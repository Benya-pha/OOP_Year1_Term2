package Employee;

public class Employee extends Person {
    protected int salary ;
    protected String position;

    public Employee(){

    }

    public Employee(String fristname, String lastname, int salary, String position) {
        super(fristname, lastname);
        this.salary = salary;
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int calculatePay(){
        return salary;
    }


    public void upSalary(int percent){
        salary = salary + (salary * percent / 100);
    }

    @Override
    public String toString() {
        return "Employee : " + fristname + " " + lastname + " " + position + " " + calculatePay();
    }
}
