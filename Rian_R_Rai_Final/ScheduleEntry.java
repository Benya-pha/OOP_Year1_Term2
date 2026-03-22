package Rian_R_Rai_Final;

//คลาสสำหรับรายการตารางเรียน
public class ScheduleEntry implements Schedulable {
    private String startTime; //เวลาเริ่ม
    private String endTime; //เวลาจบ
    private Course course; //วิชา
    private String dayOfWeek; //วัน

    //สร้าง ScheduleEntry
    public ScheduleEntry(String startTime, String endTime, Course course, String dayOfWeek) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.course = course;
        this.dayOfWeek = dayOfWeek;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String getStartTime() {
        return startTime;
    }

    @Override
    public String getEndTime() {
        return endTime;
    }

    //คืนค่าช่วงเวลา เช้า/บ่าย
    @Override
    public String getPeriod() {
        String[] parts = startTime.split(":");
        int hour = Integer.parseInt(parts[0]);

        if (hour < 13) {
            return "Morning";
        } else {
            return "Afternoon";
        }
    }

    //ปริ้นข้อมูลรายการตารางเรียน
    @Override
    public String toString() {
        return dayOfWeek + " | " + startTime + "-" + endTime
                + " | " + getPeriod()
                + " | " + course.getCourseName();
    }
}