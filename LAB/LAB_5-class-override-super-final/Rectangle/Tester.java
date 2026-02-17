package Rectangle;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter length of R1: ");
        int LR1 = kb.nextInt();
        System.out.print("Enter width of R1: ");
        int WR1 = kb.nextInt();
        System.out.print("Enter length of R2: ");
        int LR2 = kb.nextInt();
        System.out.print("Enter width of R2: ");
        int WR2 = kb.nextInt();

        Rectangle R1 = new Rectangle(LR1,WR1);
        Rectangle R2 = new Rectangle(LR2,WR2);
        System.out.println(R1);
        System.out.println(R2);
        System.out.println("Area of R1 = " + R1.area() + " " + "Area of R2 = " + R2.area());

        if (R1.area() > R2.area()){
            System.out.println("R1 is bigger than R2");
        }else if (R1.area() < R2.area()){
            System.out.println("R1 is smaller than R2");
        }else if (R1.area() == R2.area()){
            System.out.println("R1 is equal to R2");
        }

        System.out.println();

        System.out.print("Enter [width, length, depth] of B1:");
        int LB1 = kb.nextInt();
        int WB1 = kb.nextInt();
        int LD1 = kb.nextInt();
        System.out.print("Enter [width, length, depth] of B2:");
        int LB2 = kb.nextInt();
        int WB2 = kb.nextInt();
        int LD2 = kb.nextInt();
        Box B1 = new Box(LB1,WB1,LD1);
        Box B2 = new Box(LB2,WB2,LD2);
        System.out.println(B1);
        System.out.println(B2);

        System.out.println("Volum of B1 = " + B1.volumn() + " " + "Volum of B2 = " + B2.volumn());

        if (B1.volumn() > B2.volumn()){
            System.out.println("B1 is more space than B2");
        }else if (B1.volumn() < B2.volumn()){
            System.out.println("B1 is little space than B2");
        }else if (B1.volumn() == B2.volumn()){
            System.out.println("B1 is equal to B2");
        }

    }
}
