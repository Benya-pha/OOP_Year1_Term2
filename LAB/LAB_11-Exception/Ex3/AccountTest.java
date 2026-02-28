package Ex3;

import java.util.InputMismatchException;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) throws NegativeBalance {
        Scanner kb = new Scanner(System.in);
        try {
            System.out.print("Enter initial balance : ");
            BankAccount acc = new BankAccount(kb.nextDouble());
            System.out.print(acc);
        }catch (NegativeBalance nb){
            System.out.print(nb.getMessage());
        }catch (InputMismatchException ime){
            System.out.print("Your input invalid");
        }
    }
}
