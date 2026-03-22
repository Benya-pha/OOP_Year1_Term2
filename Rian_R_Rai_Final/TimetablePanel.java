package Rian_R_Rai_Final;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//คลาสแผงแสดงผลตารางเรียน (GUI)
public class TimetablePanel extends JPanel {
    private Timetable timetable; //ตารางเรียน
    private JTable table; //ตาราง
    private DefaultTableModel tableModel; //โมเดลตาราง
    private JButton btnDelete; //ปุ่มลบ

    //สร้าง TimetablePanel
    public TimetablePanel(Timetable timetable) {
        this.timetable = timetable;
        setLayout(new BorderLayout());

        //สร้างตาราง - เพิ่มคอลัมน์ Instructor
        String[] columns = {"Day", "Time", "Course", "Room / Platform", "Instructor", "Type"}; //หัวข้อคอลัมน์
        tableModel = new DefaultTableModel(columns, 0);
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        //สร้างปุ่มลบ
        btnDelete = new JButton("Delete Selected Course");
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteSelectedCourse();
            }
        });
        add(btnDelete, BorderLayout.SOUTH);

        refresh(); //รีเฟรชข้อมูล
    }

    //เมธอดสำหรับลบวิชาที่เลือก
    private void deleteSelectedCourse() {
        int selectedRow = table.getSelectedRow(); //แถวที่เลือก
        if (selectedRow != -1) {
            String dayName = (String) tableModel.getValueAt(selectedRow, 0); //ชื่อวัน
            String time = (String) tableModel.getValueAt(selectedRow, 1); //เวลา
            String courseName = (String) tableModel.getValueAt(selectedRow, 2); //ชื่อวิชา

            DaySchedule day = timetable.getDay(dayName);
            if (day != null) {
                //หา ScheduleEntry ที่ตรงกันเพื่อลบ
                ArrayList<ScheduleEntry> morning = day.getMorningList();
                for (int i = 0; i < morning.size(); i++) {
                    ScheduleEntry entry = morning.get(i);
                    String entryTime = entry.getStartTime() + " - " + entry.getEndTime();
                    if (entryTime.equals(time) && entry.getCourse().getCourseName().equals(courseName)) {
                        day.removeEntry(entry);
                        refresh();
                        return;
                    }
                }

                ArrayList<ScheduleEntry> afternoon = day.getAfternoonList();
                for (int i = 0; i < afternoon.size(); i++) {
                    ScheduleEntry entry = afternoon.get(i);
                    String entryTime = entry.getStartTime() + " - " + entry.getEndTime();
                    if (entryTime.equals(time) && entry.getCourse().getCourseName().equals(courseName)) {
                        day.removeEntry(entry);
                        refresh();
                        return;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a course to delete"); //แจ้งเตือนถ้าไม่ได้เลือก
        }
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
        //ใช้ Interface Schedulable ดึงข้อมูลเวลา
        Schedulable s = e;
        String time = s.getStartTime() + " - " + s.getEndTime(); //ดึงเวลาผ่าน Interface

        String course = e.getCourse().getCourseName(); //ชื่อวิชา
        String instructor = e.getCourse().getInstructorName(); //ชื่ออาจารย์
        String room = "-"; //ห้องเรียน
        String type = "Onsite"; //ประเภท

        //เช็คประเภทวิชา
        if (e.getCourse() instanceof OnsiteCourse) {
            room = ((OnsiteCourse) e.getCourse()).getRoom();
        } else if (e.getCourse() instanceof OnlineCourse) {
            room = ((OnlineCourse) e.getCourse()).getPlatform();
            type = "Online";
        }

        //เพิ่มแถวข้อมูลตามลำดับคอลัมน์: Day, Time, Course, Room, Instructor, Type
        tableModel.addRow(new Object[]{dayName, time, course, room, instructor, type});
    }
}