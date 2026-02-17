package Logistics02;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int distance = kb.nextInt();
        Logistics L1 = new Logistics();
        Truck T1 = new Truck();

        double total = L1.planDelivery(T1, distance);
        System.out.printf("%.2f",total);
        System.out.println();
        L1.deliver();
    }
}