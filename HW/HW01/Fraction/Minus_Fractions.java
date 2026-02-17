package Fraction;

import java.util.Scanner;

public class Minus_Fractions {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int num1 = kb.nextInt();
        int n1 = kb.nextInt();
        int d1 = kb.nextInt();

        int num2 = kb.nextInt();
        int n2 = kb.nextInt();
        int d2 = kb.nextInt();

        // 1) แปลงจำนวนคละเป็นเศษเกิน
        int improper1 = num1 * d1 + n1;
        int improper2 = num2 * d2 + n2;

        // 2) สูตรลบ
        int newNumerator = improper1 * d2 - improper2 * d1;
        int newDenominator = d1 * d2;

        // 3) สร้างผลลัพธ์
        Fraction resultFraction = new Fraction(newNumerator, newDenominator);
        MixedNumber result = new MixedNumber();

        result.setValue(0, resultFraction);
        result.print();
    }
}
