import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class TimetablePanel extends JPanel {
    private Timetable timetable;
    private JTable table;
    private DefaultTableModel tableModel;

    public TimetablePanel(Timetable timetable) {
        this.timetable = timetable;
        setLayout(new BorderLayout());

        String[] columns = {"Day", "Time","Instructor" ,"Course", "Room / Platform", "Type"};
        tableModel = new DefaultTableModel(columns, 0);
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        refresh();
    }

    public void refresh() {
        tableModel.setRowCount(0);

        ArrayList<DaySchedule> days = timetable.getDayList();
        for (int i = 0; i < days.size(); i++) {
            DaySchedule day = days.get(i);

            for (int j = 0; j < day.getMorningList().size(); j++) {
                addRowToTable(day.getDayName(), day.getMorningList().get(j));
            }
            for (int j = 0; j < day.getAfternoonList().size(); j++) {
                addRowToTable(day.getDayName(), day.getAfternoonList().get(j));
            }
        }
    }

    private void addRowToTable(String dayName, ScheduleEntry e) {
        String time = e.getStartTime() + " - " + e.getEndTime();
        String instructor = e.getCourse().getInstructorName();
        String course = e.getCourse().getCourseName();
        String room = "-";
        String type = "Onsite";

        if (e.getCourse() instanceof OnsiteCourse) {
            room = ((OnsiteCourse) e.getCourse()).getRoom();
        } else if (e.getCourse() instanceof OnlineCourse) {
            room = ((OnlineCourse) e.getCourse()).getPlatform();
            type = "Online";
        }

        tableModel.addRow(new Object[]{dayName, time, instructor , course, room, type});
    }
}