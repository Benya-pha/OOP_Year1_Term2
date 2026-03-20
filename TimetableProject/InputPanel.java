import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

//คลาสสำหรับ GUI รับข้อมูลสำหรับเพิ่มวิชาเรียน
public class InputPanel extends JPanel {

    private JComboBox<String> cbDay; //เลือกวัน
    private JTextField tfCourse; //ชื่อวิชา
    private JTextField tfInstructor; //ชื่อผู้สอน
    private JTextField tfStart; //เวลาเริ่ม
    private JTextField tfEnd; //ชเวลาจบ
    private JTextField tfRoom; //ห้องเรียน/แพลตฟอร์ม
    private JComboBox<String> cbType; //ประเภทวิชา Onsite/Online
    private Timetable timetable; //ออบเจกต์ Timetable หลัก
    private MainFrame mainFrame; //ออบเจกต์ MainFrame หลัก

    //สร้าง InputPanel
    public InputPanel(Timetable timetable, MainFrame mainFrame) {
        this.timetable = timetable;
        this.mainFrame = mainFrame;

        //กำหนดกรอบ
        setPreferredSize(new Dimension(300, 600));

        setLayout(null);

        //จัดตำแหน่งคำ
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
        tfEnd.setBounds(180, 140, 90, 25);
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

        //ปุ่ม Add
        JButton btnAdd = new JButton("Add Course");
        btnAdd.setBounds(20, 270, 120, 30);
        //เมื่อกดปุ่มให้เรียกเมธอด addCourse
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCourse();
            }
        });
        add(btnAdd);//เพิ่มปุ่มลงในตาราง

        //ปุ่ม Export เซฟไปที่ Downloads ชื่อ Schedule.txt
        JButton btnExport = new JButton("Export to TXT");
        btnExport.setBounds(150, 270, 120, 30);
        //เมื่อกดปุ่มให้ระบุตำแหน่งเซฟ
        btnExport.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userHome = System.getProperty("user.home");
                String savePath = userHome + File.separator + "Downloads" + File.separator + "Schedule.txt";

                ScheduleExporter.export(timetable, savePath);
                JOptionPane.showMessageDialog(null, "Export Success!\nSaved to: " + savePath);
            }
        });
        add(btnExport);
    }

    //เมธอดเพิ่มวิชาเรียน
    private void addCourse() {
        String day        = cbDay.getSelectedItem().toString(); //วันที่เลือก
        String courseName = tfCourse.getText(); //ชื่อวิชาที่กรอก
        String instructor = tfInstructor.getText(); //ชื่อผู้สอนที่กรอก
        String start      = tfStart.getText(); //เวลาเริ่มที่กรอก
        String end        = tfEnd.getText(); //เวลาจบที่กรอก
        String room       = tfRoom.getText(); //ห้องเรียน/แพลตฟอร์มที่กรอก
        String type       = cbType.getSelectedItem().toString(); //ประเภทวิชาที่เลือก

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