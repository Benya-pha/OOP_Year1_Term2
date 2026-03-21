//อินเทอร์เฟซสำหรับจัดตาราง
public interface Schedulable {
    String getStartTime(); //เวลาเริ่ม
    String getEndTime(); //เวลาจบ
    String getPeriod(); //ช่วงเวลา
}