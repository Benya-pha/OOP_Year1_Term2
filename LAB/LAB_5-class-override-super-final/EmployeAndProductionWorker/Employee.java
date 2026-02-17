package EmployeAndProductionWorker;

public class Employee {
    String empName ;
    String empNumber;
    String hireDate;

    public Employee(){

    }

    public Employee(String empName, String empNumber, String hireDate) {
        this.empName = empName;
        this.empNumber = empNumber;
        this.hireDate = hireDate;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void showInfo(){
        System.out.println("Name : " + empName);
        System.out.println("Number : " + empNumber);
        System.out.println("Date : " + hireDate);
    }
}
