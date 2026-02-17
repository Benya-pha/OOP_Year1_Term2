package Measurable;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number of BankAccount : ");
        int num = kb.nextInt();

        BankAccount [] B1 = new BankAccount[num];


        for (int i = 0; i < num ; i++) {
            String accNo = kb.next();
            int startBalance = kb.nextInt();
            B1 [i] = new BankAccount(accNo,startBalance);
        }
        for (int i = 0; i < num; i++) {
            System.out.println("Acc no : " + B1[i].getAccNo() + " Balance : " + B1[i].getMeasure());
        }

        System.out.print("Enter the number of PiggyBank : ");
        int piggy = kb.nextInt();
        PiggyBank [] p1 = new PiggyBank[piggy];

        for (int i = 0; i < piggy; i++) {
            System.out.print("Enter size and number of deposit : ");
            int size = kb.nextInt();
            p1[i] = new PiggyBank(size);
            int each = kb.nextInt();

            for (int j = 0; j < each; j++) {
                String typeMoney = kb.next();
                if (typeMoney.equalsIgnoreCase("1")){
                    int money = kb.nextInt();
                    p1[i].addOne(money);

                }else if (typeMoney.equalsIgnoreCase("5")){
                    int money = kb.nextInt();
                    p1[i].addFive(money);

                }else if (typeMoney.equalsIgnoreCase("10")){
                    int money = kb.nextInt();
                    p1[i].addTen(money);

                }
            }
            System.out.println("Total : " + p1[i].getMeasure());
        }
    }
}
