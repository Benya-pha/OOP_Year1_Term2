package Fraction;

import java.util.Scanner;

public class Drop_Fractions {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int num = kb.nextInt();
        int numerator = kb.nextInt();
        int denominator = kb.nextInt();

        MixedNumber mixed = new MixedNumber();
        Fraction fraction = new Fraction(numerator, denominator);

        mixed.setValue(num, fraction);
//        mixed.simplify();
        mixed.print();
    }
}
