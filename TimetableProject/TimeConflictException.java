//คลาส Exception สำหรับเวลาทับซ้อน
public class TimeConflictException extends Exception{
    //สร้าง TimeConflictException
    public TimeConflictException(String message){
        super(message);
    }
}