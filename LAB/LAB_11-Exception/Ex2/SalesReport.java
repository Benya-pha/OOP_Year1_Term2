package Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SalesReport {
    public static void main(String[] args) throws FileNotFoundException {

        int months = 0;
        double oneMonth;
        double totalSales = 0.0;
        double averageSales;



        Scanner kb = new Scanner(System.in);
        try {
            String filename = kb.nextLine();
            File file = new File("/workspaces/OOP_Year1_Term2/LAB/LAB_11-Exception/Ex2/SalesData.txt");
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {

                oneMonth = inputFile.nextDouble();
                totalSales += oneMonth;
                months++;

            }
            inputFile.close();
            averageSales = totalSales / months;
            System.out.println("Number of months : " + months);
            System.out.println("Total Sales : " + totalSales);
            System.out.println("Average Sales : " + averageSales);
        }catch (FileNotFoundException nfe){
            System.out.print("File is not exist.");
        }catch (InputMismatchException ie){
            System.out.print("Your input mismatch.");
        }
    }
}
