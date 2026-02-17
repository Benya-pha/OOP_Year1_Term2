package Employee;

public class Sales extends Employee{
    public double commistion;

    public Sales() {

    }

    public Sales(String name, double salary, double commistion) {
        super(name, salary);
        this.commistion = commistion;
    }

    public double celSarary(){
        return salary + commistion ;
    }

    @Override
    public String toString() {
        return "My name is " + name + "." + " " +
                "I am an sales"  + "." +"\n" +
                "My salary is " + celSarary()  ;
    }
}
