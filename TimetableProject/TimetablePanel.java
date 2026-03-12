import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

class TimetablePanel extends JPanel {
    private Timetable timetable;
    private JTable table;
    private DefaultTableModel tableModel;

    public TimetablePanel(Timetable timetable) {
        this.timetable = timetable;
        setLayout(new BorderLayout());

        // สร้างตารางด้วย DefaultTableModel พื้นฐาน
        String[] columns = {"Day", "Time", "Course", "Room / Platform", "Type"};
        tableModel = new DefaultTableModel(columns, 0);
        table = new JTable(tableModel);

        // ใส่ใน ScrollPane แบบเบสิก
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        refresh();
    }

    public void refresh() {
        tableModel.setRowCount(0); // ล้างตาราง

        ArrayList<DaySchedule> days = timetable.getDayList();
        for (int i = 0; i < days.size(); i++) {
            DaySchedule day = days.get(i);

            // เพิ่มวิชาช่วงเช้า
            for (int j = 0; j < day.getMorningList().size(); j++) {
                addRowToTable(day.getDayName(), day.getMorningList().get(j));
            }
            // เพิ่มวิชาช่วงบ่าย
            for (int j = 0; j < day.getAfternoonList().size(); j++) {
                addRowToTable(day.getDayName(), day.getAfternoonList().get(j));
            }
        }
    }

    private void addRowToTable(String dayName, ScheduleEntry e) {
        String time = e.getStartTime() + " - " + e.getEndTime();
        String course = e.getCourse().getCourseName();
        String room = "-";
        String type = "Onsite";

        if (e.getCourse() instanceof OnsiteCourse) {
            room = ((OnsiteCourse) e.getCourse()).getRoom();
        } else if (e.getCourse() instanceof OnlineCourse) {
            room = ((OnlineCourse) e.getCourse()).getPlatform();
            type = "Online";
        }

        tableModel.addRow(new Object[]{dayName, time, course, room, type});
    }
}