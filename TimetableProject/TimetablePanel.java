import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

//คลาสแผงแสดงผลตารางเรียน (GUI)
class TimetablePanel extends JPanel {
    private Timetable timetable; //ตารางเรียน
    private JTable table; //ตาราง
    private DefaultTableModel tableModel; //โมเดลตาราง

    //สร้าง TimetablePanel
    public TimetablePanel(Timetable timetable) {
        this.timetable = timetable;
        setLayout(new BorderLayout());

        //สร้างตาราง
        String[] columns = {"Day", "Time", "Course", "Room / Platform", "Type"}; //หัวข้อคอลัมน์
        tableModel = new DefaultTableModel(columns, 0);
        table = new JTable(tableModel);

        //ใส่ ScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        refresh(); //รีเฟรชข้อมูล
    }

    //รีเฟรชข้อมูลในตาราง
    public void refresh() {
        tableModel.setRowCount(0); //ล้างตาราง

        ArrayList<DaySchedule> days = timetable.getDayList(); //ดึงรายการวัน
        for (int i = 0; i < days.size(); i++) {
            DaySchedule day = days.get(i);

            //เพิ่มวิชาช่วงเช้า
            for (int j = 0; j < day.getMorningList().size(); j++) {
                addRowToTable(day.getDayName(), day.getMorningList().get(j));
            }
            //เพิ่มวิชาช่วงบ่าย
            for (int j = 0; j < day.getAfternoonList().size(); j++) {
                addRowToTable(day.getDayName(), day.getAfternoonList().get(j));
            }
        }
    }

    //เพิ่มแถวข้อมูลลงในตาราง
    private void addRowToTable(String dayName, ScheduleEntry e) {
        String time = e.getStartTime() + " - " + e.getEndTime(); //เวลา
        String course = e.getCourse().getCourseName(); //ชื่อวิชา
        String room = "-"; //ห้องเรียน
        String type = "Onsite"; //ประเภท

        if (e.getCourse() instanceof OnsiteCourse) {
            room = ((OnsiteCourse) e.getCourse()).getRoom();
        } else if (e.getCourse() instanceof OnlineCourse) {
            room = ((OnlineCourse) e.getCourse()).getPlatform();
            type = "Online";
        }

        tableModel.addRow(new Object[]{dayName, time, course, room, type}); //เพิ่มแถว
    }
}