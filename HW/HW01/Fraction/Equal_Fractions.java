package Fraction;

import java.util.Scanner;


public class Equal_Fractions {
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

        int result = m1.compareTo(m2);

        if(result > 0)
            System.out.println(">");
        else if(result < 0)
            System.out.println("<");
        else
            System.out.println("=");
    }
}
