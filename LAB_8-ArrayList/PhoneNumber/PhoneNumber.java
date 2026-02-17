package PhoneNumber;

public class PhoneNumber {
    String name;
    int phoneNum;

    public PhoneNumber(String name, int phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    @Override
    public String toString() {
        return "Name= '" + name + "', Phone='" + phoneNum + "'";
    }
}
