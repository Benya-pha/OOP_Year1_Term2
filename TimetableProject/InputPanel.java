import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class InputPanel extends JPanel {

    private JComboBox<String> cbDay;
    private JTextField tfCourse;
    private JTextField tfInstructor;
    private JTextField tfStart;
    private JTextField tfEnd;
    private JTextField tfRoom;
    private JComboBox<String> cbType;
    private Timetable timetable;
    private MainFrame mainFrame;

    public InputPanel(Timetable timetable, MainFrame mainFrame) {
        this.timetable = timetable;
        this.mainFrame = mainFrame;

        // ปรับขนาดเริ่มต้นของกรอบซ้าย
        setPreferredSize(new Dimension(300, 600));

        // ใช้ setLayout(null) ตามสไลด์หน้า 3 (Absolute Layout)
        setLayout(null);

        // จัดตำแหน่งทีละอันด้วย setBounds
        JLabel lblDay = new JLabel("Day:");
        lblDay.setBounds(20, 20, 100, 25);
        add(lblDay);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        cbDay = new JComboBox<>(days);
        cbDay.setBounds(120, 20, 150, 25);
        add(cbDay);

        JLabel lblCourse = new JLabel("Course:");
        lblCourse.setBounds(20, 60, 100, 25);
        add(lblCourse);

        tfCourse = new JTextField();
        tfCourse.setBounds(120, 60, 150, 25);
        add(tfCourse);

        JLabel lblInstructor = new JLabel("Instructor:");
        lblInstructor.setBounds(20, 100, 100, 25);
        add(lblInstructor);

        tfInstructor = new JTextField();
        tfInstructor.setBounds(120, 100, 150, 25);
        add(tfInstructor);

        JLabel lblStart = new JLabel("Start:");
        lblStart.setBounds(20, 140, 50, 25);
        add(lblStart);

        tfStart = new JTextField();
        tfStart.setBounds(70, 140, 60, 25);
        add(tfStart);

        JLabel lblEnd = new JLabel("End:");
        lblEnd.setBounds(140, 140, 50, 25);
        add(lblEnd);

        tfEnd = new JTextField();
        tfEnd.setBounds(180, 140, 60, 25);
        add(tfEnd);

        JLabel lblRoom = new JLabel("Room / Platform:");
        lblRoom.setBounds(20, 180, 100, 25);
        add(lblRoom);

        tfRoom = new JTextField();
        tfRoom.setBounds(120, 180, 150, 25);
        add(tfRoom);

        JLabel lblType = new JLabel("Type:");
        lblType.setBounds(20, 220, 100, 25);
        add(lblType);

        cbType = new JComboBox<>();
        cbType.addItem("Onsite");
        cbType.addItem("Online");
        cbType.setBounds(120, 220, 150, 25);
        add(cbType);

        // ปุ่ม Add
        JButton btnAdd = new JButton("Add Course");
        btnAdd.setBounds(20, 270, 120, 30);
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCourse();
            }
        });
        add(btnAdd);

        // ปุ่ม Export บังคับเซฟไปที่โฟลเดอร์ Downloads และใช้ชื่อ Schedule.txt
        JButton btnExport = new JButton("Export to TXT");
        btnExport.setBounds(150, 270, 120, 30);
        btnExport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // ดึงตำแหน่งโฟลเดอร์ home ของ User แล้วต่อด้วย Downloads/Schedule.txt
                String userHome = System.getProperty("user.home");
                String savePath = userHome + File.separator + "Downloads" + File.separator + "Schedule.txt";

                ScheduleExporter.export(timetable, savePath);
                JOptionPane.showMessageDialog(null, "Export Success!\nSaved to: " + savePath);
            }
        });
        add(btnExport);
    }

    private void addCourse() {
        String day        = cbDay.getSelectedItem().toString();
        String courseName = tfCourse.getText();
        String instructor = tfInstructor.getText();
        String start      = tfStart.getText();
        String end        = tfEnd.getText();
        String room       = tfRoom.getText();
        String type       = cbType.getSelectedItem().toString();

        Course course = null;

        if (type.equalsIgnoreCase("Onsite")) {
            course = new OnsiteCourse(courseName, instructor, start, end, room);
        } else if (type.equalsIgnoreCase("Online")) {
            course = new OnlineCourse(courseName, instructor, start, end, room);
        }

        ScheduleEntry entry = new ScheduleEntry(start, end, course, day);
        DaySchedule daySchedule = timetable.getDay(day);

        if (daySchedule == null) {
            daySchedule = new DaySchedule(day);
            timetable.addDay(daySchedule);
        }

        daySchedule.addEntry(entry);
        mainFrame.refreshTable();

        // ล้างข้อมูลหลังบันทึก
        tfCourse.setText("");
        tfInstructor.setText("");
        tfStart.setText("");
        tfEnd.setText("");
        tfRoom.setText("");
    }
}