//คลาส Exception สำหรับเวลาไม่ถูกต้อง
public class InvalidTimeException extends Exception{
    //สร้าง InvalidTimeException
    public InvalidTimeException(String message) throws InvalidTimeException {
        super(message);
    }
}