//คลาสวิชาเรียนในห้องเรียน
public class OnsiteCourse extends Course{
    private String room; //ห้องเรียน

    //สร้าง OnsiteCourse
    public OnsiteCourse(String courseName, String instructorName, String startTime, String endTime, String room) {
        super(courseName, instructorName, startTime, endTime);
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    //ปริ้นข้อมูลวิชาเรียนในห้องเรียน
    @Override
    public String toString() {
        return super.toString() +
                "\n  Room       : " + room +
                "\n  Type       : Onsite";
    }
}