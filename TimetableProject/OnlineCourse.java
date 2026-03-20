//คลาสวิชาเรียนออนไลน์
public class OnlineCourse extends Course{
    private String platform; //แพลตฟอร์มที่ใช้เรียน

    //สร้าง OnlineCourse
    public OnlineCourse(String courseName, String instructorName, String startTime, String endTime, String platform) {
        super(courseName, instructorName, startTime, endTime);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    //ปริ้นข้อมูลวิชาเรียนออนไลน์
    @Override
    public String toString() {
        return super.toString() +
                "\n  Platform   : " + platform +
                "\n  Type       : Online";
    }
}