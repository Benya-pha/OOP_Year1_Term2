package PointAndLine;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Point p1 = new Point(1,1);
        Point p2 = new Point (5,5);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        Line myLineA = new Line(p1,p2);
        System.out.println("Line A : " + myLineA);
        System.out.print("Distance = ");
        System.out.printf("%.2f\n" , myLineA.distance());
        p1.setX(2);
        p1.setY(2);
        System.out.println("Line A : " + myLineA);
        System.out.print("Distance = ");
        System.out.printf("%.2f\n" , myLineA.distance());

        Line myLineB = new Line(2,3,2,5);
        System.out.println("Line B : " + myLineB);
        System.out.print("Distance = ");
        System.out.printf("%.2f\n" , myLineB.distance());

        System.out.print("Input start point x and y : ");
        int startx = kb.nextInt();
        int starty = kb.nextInt();
        System.out.print("Input end point x and y : ");
        int endx = kb.nextInt();
        int endy = kb.nextInt();
        Line myLineC = new Line(startx,starty,endx,endy);
        System.out.println(myLineC);
        System.out.print("Distance = ");
        System.out.printf("%.2f\n" , myLineC.distance());

        if (myLineA.distance() >= myLineB.distance() && myLineA.distance() >= myLineC.distance()){
            System.out.println("Longest line : mylineA");
        }else if (myLineA.distance() >= myLineB.distance() && myLineA.distance() >= myLineC.distance()) {
            System.out.println("Longest line : mylineB");
        }else {
            System.out.println("Longest line : mylineC");
        }
    }

}
