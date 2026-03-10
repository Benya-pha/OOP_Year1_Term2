import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class InputPanel extends JPanel {

    private JTextField tfDay;
    private JTextField tfCourse;
    private JTextField tfInstructor;
    private JTextField tfStart;
    private JTextField tfEnd;
    private JTextField tfRoom;
    private JComboBox cbType;
    private Timetable timetable;
    private MainFrame mainFrame;

    public InputPanel(Timetable timetable, MainFrame mainFrame) {
        this.timetable = timetable;
        this.mainFrame = mainFrame;
        setLayout(new GridLayout(10, 2));

        add(new JLabel("Day :"));
        tfDay = new JTextField();
        add(tfDay);

        add(new JLabel("Course :"));
        tfCourse = new JTextField();
        add(tfCourse);

        add(new JLabel("Instructor :"));
        tfInstructor = new JTextField();
        add(tfInstructor);

        add(new JLabel("Start :"));
        tfStart = new JTextField();
        add(tfStart);

        add(new JLabel("End :"));
        tfEnd = new JTextField();
        add(tfEnd);

        add(new JLabel("Room :"));
        tfRoom = new JTextField();
        add(tfRoom);

        cbType = new JComboBox();
        cbType.addItem("Onsite");
        cbType.addItem("Online");
        add(cbType);

        JButton btnAdd = new JButton("Add Course");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addCourse();
            }
        });
        add(btnAdd);
    }

    private void addCourse() {
        String day        = tfDay.getText();
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
    }
}