package Measurable;

public class PiggyBank implements Measurable {
    private int one;
    private int five;
    private int ten;
    private int size;

    public PiggyBank(int size) {
        this.size = size;
    }

    public void addOne(int n){
        if (size - (one + five + ten) <= 0) {
            return;
        }
        if (n <= size - (one + five + ten)) {
            one += n;
        } else {
            one += size - (one + five + ten);
        }
    }


    public void addFive(int n){
        if (size - (one + five + ten) <= 0) {
            return;
        }
        if (n <= size - (one + five + ten)) {
            five += n;
        } else {
            five += size - (one + five + ten);
        }
    }

    public void addTen(int n){
        if (size - (one + five + ten) <= 0) {
            return;
        }
        if (n <= size - (one + five + ten)) {
            ten += n;
        } else {
            ten += size - (one + five + ten);
        }
    }

    public double getMeasure(){
        return (one*1.00) + (five*5.00) + (ten*10.00);
    }
}
