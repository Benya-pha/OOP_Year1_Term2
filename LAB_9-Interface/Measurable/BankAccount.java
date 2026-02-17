package Measurable;

public class BankAccount implements Measurable {
    private String accNo;
    private double balance;

    public BankAccount(String accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getMeasure(){
        return balance;
    }
}
