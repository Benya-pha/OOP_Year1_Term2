package WorkParttime;

public class Employee extends Person{
    private int salary ;

    public Employee() {

    }

    public Employee(String name, String surnsme ,int salary) {
        super(name, surnsme);
        this.salary = salary;
    }

    public int Pay (){
        return salary;
    }
}
