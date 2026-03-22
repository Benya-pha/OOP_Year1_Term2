package Rian_R_Rai_Final;

import java.util.ArrayList;

//คลาสจัดการตารางเรียนในแต่ละวัน
public class DaySchedule {
    private final String dayName; //ชื่อวัน
    private ArrayList<ScheduleEntry> morningList = new ArrayList<>(); //รายการวิชาช่วงเช้า
    private ArrayList<ScheduleEntry> afternoonList = new ArrayList<>(); //รายการวิชาช่วงบ่าย

    //สร้าง DaySchedule
    public DaySchedule(String dayName) {
        this.dayName = dayName;
    }

    //เพิ่มวิชาเข้าตาราง
    public void addEntry(ScheduleEntry entry) {
        if (entry.getPeriod().equalsIgnoreCase("Morning")) {
            morningList.add(entry);
        } else if (entry.getPeriod().equalsIgnoreCase("Afternoon")) {
            afternoonList.add(entry);
        }
    }

    //ลบวิชาออกจากตาราง
    public void removeEntry(ScheduleEntry entry) {
        if (entry.getPeriod().equalsIgnoreCase("Morning")) {
            morningList.remove(entry);
        } else if (entry.getPeriod().equalsIgnoreCase("Afternoon")) {
            afternoonList.remove(entry);
        }
    }

    public String getDayName() {
        return dayName;
    }

    public ArrayList<ScheduleEntry> getMorningList() {
        return morningList;
    }

    public void setMorningList(ArrayList morningList) {
        this.morningList = morningList;
    }

    public ArrayList<ScheduleEntry> getAfternoonList() {
        return afternoonList;
    }

    public void setAfternoonList(ArrayList afternoonList) {
        this.afternoonList = afternoonList;
    }

    //ปริ้นตารางเรียนของวัน
    @Override
    public String toString() {
        String result = "[ " + dayName + " ]\n";

        result += "  Morning   : ";
        for (int i = 0; i < morningList.size(); i++) {
            ScheduleEntry e = morningList.get(i);
            String extra = "";
            if (e.getCourse() instanceof OnsiteCourse) {
                extra = "[" + ((OnsiteCourse) e.getCourse()).getRoom() + "]";
            } else if (e.getCourse() instanceof OnlineCourse) {
                extra = "[" + ((OnlineCourse) e.getCourse()).getPlatform() + "]";
            }
            result += e.getStartTime() + "-" + e.getEndTime() + "  "
                    + e.getCourse().getCourseName() + " (" + e.getCourse().getInstructorName() + ") " + extra + "  ";
        }

        result += "\n  Afternoon : ";
        for (int i = 0; i < afternoonList.size(); i++) {
            ScheduleEntry e = afternoonList.get(i);
            String extra = "";
            if (e.getCourse() instanceof OnsiteCourse) {
                extra = "[" + ((OnsiteCourse) e.getCourse()).getRoom() + "]";
            } else if (e.getCourse() instanceof OnlineCourse) {
                extra = "[" + ((OnlineCourse) e.getCourse()).getPlatform() + "]";
            }
            result += e.getStartTime() + "-" + e.getEndTime() + "  "
                    + e.getCourse().getCourseName() + " (" + e.getCourse().getInstructorName() + ") " + extra + "  ";
        }

        return result;
    }
}