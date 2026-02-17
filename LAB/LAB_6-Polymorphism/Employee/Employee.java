package Employee;

public class Employee {
    public String name;
    public double salary;

    public Employee() {

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double celSarary(){
        return this.salary = salary ;
    }

    @Override
    public String toString() {
        return "My name is " + name + "." + "\n" +
                "I am an employee" + "." + "\n" +
                "My salary is " + celSarary()   ;
    }
}
