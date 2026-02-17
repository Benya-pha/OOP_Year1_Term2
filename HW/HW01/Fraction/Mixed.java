package Fraction;

import java.util.Scanner;

public class Mixed {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int num1 = kb.nextInt();
        int n1 = kb.nextInt();
        int d1 = kb.nextInt();

        int num2 = kb.nextInt();
        int n2 = kb.nextInt();
        int d2 = kb.nextInt();

        // แปลงเป็นเศษเกิน
        int improper1 = num1 * d1 + n1;
        int improper2 = num2 * d2 + n2;

        int left = improper1 * d2;
        int right = improper2 * d1;

        if(left > right)
            System.out.println(">");
        else if(left < right)
            System.out.println("<");
        else
            System.out.println("=");
    }
}
