package Employee;

public class Manager extends Employee{
    public String parkingNo;

    public Manager() {

    }

    public Manager(String name, double salary, String parkingNo) {
        super(name, salary);
        this.parkingNo = parkingNo;
    }

    public double celSarary(){
        return  salary ;
    }

    @Override
    public String toString() {
        return "My name is " + name + "." + " " +
                "I am an manager" + "." + "\n" +
                "My salary is " + salary   ;
    }
}
