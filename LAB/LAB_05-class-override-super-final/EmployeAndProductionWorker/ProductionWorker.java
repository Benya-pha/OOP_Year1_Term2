package EmployeAndProductionWorker;

public class ProductionWorker extends Employee {
    String shift;
    double hourlyPerRate;

    public ProductionWorker(){
        shift = "Day";
        hourlyPerRate = 50;
    }

    public ProductionWorker(String empName, String empNumber, String hireDate, String shift, double hourlyPerRate) {
        super(empName, empNumber, hireDate);
        this.shift = shift;
        this.hourlyPerRate = hourlyPerRate;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public double getHourlyPerRate() {
        return hourlyPerRate;
    }

    public void setHourlyPerRate(double hourlyPerRate) {
        this.hourlyPerRate = hourlyPerRate;
    }

    public void showInfo(){
        System.out.println("Name : " + empName);
        System.out.println("Number : " + empNumber);
        System.out.println("Date : " + hireDate);
        System.out.println("Shift = " + shift);
        System.out.println("Rate = " + hourlyPerRate);
    }
}
