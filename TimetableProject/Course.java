public class Course {

    private String courseName;
    private String instructorName;
    private String startTime;
    private String endTime;
    private static int  totalCourses;

    public Course(String courseName, String instructorName, String startTime, String endTime) {
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
        totalCourses++;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getTotalCourses() {
        return totalCourses;
    }

    public String getInfo(){
        return "[ " + courseName + " ]" +
                "\n  Instructor : " + instructorName +
                "\n  Time       : " + startTime + " - " + endTime;
    }

    @Override
    public String toString() {
        return "[ " + courseName + " ]" +
                "\n  Instructor : " + instructorName +
                "\n  Time       : " + startTime + " - " + endTime;
    }
}
