package Fraction;

import java.util.Scanner;

public class Add_Fractions {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int num1 = kb.nextInt();
        int n1 = kb.nextInt();
        int d1 = kb.nextInt();

        int num2 = kb.nextInt();
        int n2 = kb.nextInt();
        int d2 = kb.nextInt();

        MixedNumber m1 = new MixedNumber();
        MixedNumber m2 = new MixedNumber();

        m1.setValue(num1, new Fraction(n1, d1));
        m2.setValue(num2, new Fraction(n2, d2));

        m1.add(m2);
        m1.print();
    }
}
