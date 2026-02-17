package Employee;

public class Manager extends Employee {
    private int cashPosition;

    public Manager(String name, String lastname, int salary, String position, int cashPosition) {
        super(name, lastname, salary, position);
        this.cashPosition = cashPosition;
    }

    @Override
    public int calculatePay() {
        return salary + cashPosition;
    }
}
