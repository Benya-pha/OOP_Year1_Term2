package Employee;

public class SaleMan extends Employee{
    protected int saleAmount;

    public SaleMan(){

    }

    public SaleMan(String fristname, String lastname, int salary, String position, int saleAmount) {
        super(fristname, lastname, salary, position);
        this.saleAmount = saleAmount;
    }

    public int calculatePay(){
        return salary + (int)(saleAmount * 0.05);
    }
}
