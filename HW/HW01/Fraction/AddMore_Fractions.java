package Fraction;

import java.util.Scanner;

public class AddMore_Fractions {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int count = kb.nextInt();

        MixedNumber result = new MixedNumber();
        result.setValue(0, new Fraction(0,1));

        for(int i = 0; i < count; i++){
            int num = kb.nextInt();
            int n = kb.nextInt();
            int d = kb.nextInt();

            MixedNumber temp = new MixedNumber();
            temp.setValue(num, new Fraction(n, d));

            result.add(temp);
        }

        result.print();
    }
}
