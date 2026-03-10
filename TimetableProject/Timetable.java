import java.util.ArrayList;

public class Timetable {
    private ArrayList<DaySchedule> dayList = new ArrayList<DaySchedule>();

    public Timetable() {
        dayList = new ArrayList<>();
    }

    public void addDay(DaySchedule day){
        dayList.add(day);
    }

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

    @Override
    public String toString() {
        String result = "=== TIMETABLE ===\n";
        for (int i = 0; i < dayList.size(); i++) {
            result += dayList.get(i).toString() + "\n";
        }
        return result;
    }
}
