//คลาส Exception เมื่อเจอเวลาที่ไม่ถูกต้อง
public class InvalidTimeException extends Exception{
    //สร้าง InvalidTimeException พร้อมข้อความ
    public InvalidTimeException(String message) throws InvalidTimeException {
        super(message);
    }
}