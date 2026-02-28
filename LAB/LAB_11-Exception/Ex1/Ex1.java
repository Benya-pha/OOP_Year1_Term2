package Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
        try{
        int [] numbers = {1, 2, 3};
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter index of array : ");
        int n = kb.nextInt();
        System.out.print(numbers[n]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Array index is out of bound");
        }catch (InputMismatchException ie){
            System.out.print("Your input mismatch");
        }

    }

}