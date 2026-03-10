public class OnsiteCourse extends Course{
    private String room;

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

    @Override
    public String toString() {
        return super.toString() +
                "\n  Room       : " + room +
                "\n  Type       : Onsite";
    }
}
