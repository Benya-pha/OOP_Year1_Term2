package RetailItem;

import java.util.Scanner;

public class Tester {
    private static void showPrice(RetailItem item) {
        System.out.printf("Price: $%,.2f\n", item.getRetailPrice());
    }
    public static void main(String[] args) {
        CompactDisc C1 = new CompactDisc("Greatest Hits","Joe Looney Band",18.95);
        DvdMovie M1 = new DvdMovie("Joker",122,12.95);

        System.out.println("Item #1: " + C1.getTitle());
        showPrice(C1);

        System.out.println("============================");

        System.out.println("Item #2: " + M1.getTitle());
        showPrice(C1);
    }
}
