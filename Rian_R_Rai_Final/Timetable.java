package Rian_R_Rai_Final;

import java.util.ArrayList;

//คลาสจัดการตารางเรียนทั้งหมด
public class Timetable {
    private ArrayList<DaySchedule> dayList = new ArrayList<DaySchedule>(); //รายการตารางเรียนแต่ละวัน

    //สร้าง Timetable
    public Timetable() {
        dayList = new ArrayList<>();
    }

    //เพิ่มวันเข้าตาราง
    public void addDay(DaySchedule day){
        dayList.add(day);
    }

    //ลบวิชาออกจากตาราง
    public void removeCourse(String dayName, ScheduleEntry entry) {
        DaySchedule day = getDay(dayName);
        if (day != null) {
            day.removeEntry(entry);
        }
    }

    //ดึงข้อมูลตารางตามชื่อวัน
    public DaySchedule getDay(String dayName){
        for (int i = 0; i < dayList.size() ; i++) {
            if (dayList.get(i).getDayName().equals(dayName)){
                return dayList.get(i);
            }
        }
        return null;
    }

    public ArrayList<DaySchedule> getDayList(){
        return dayList;
    }

    //ปริ้นตารางเรียนทั้งหมด
    @Override
    public String toString() {
        String result = "=== TIMETABLE ===\n";
        for (int i = 0; i < dayList.size(); i++) {
            result += dayList.get(i).toString() + "\n";
        }
        return result;
    }
}