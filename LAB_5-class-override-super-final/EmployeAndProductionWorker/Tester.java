package EmployeAndProductionWorker;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Employee p1 = new Employee("Jame","123-A","1-1-2561");

        ProductionWorker wp1 = new ProductionWorker("Jame","123-A","1-1-2561","Day",50);
        ProductionWorker wp2 = new ProductionWorker("Bell","222-A","2-2-2561","Night",100);
        wp1.showInfo();
        System.out.println();
        wp2.showInfo();
        System.out.println();

        System.out.print("Enter the number of working hours for jame : ");
        int hourJ = kb.nextInt();
        double SalaryJ = hourJ * wp1.hourlyPerRate;
        System.out.println("Salary of Jame = " + SalaryJ );

        System.out.print("Enter the number of working hours for Bell : ");
        int hourB = kb.nextInt();
        double SalaryB = hourB * wp2.hourlyPerRate;
        System.out.println("Salary of Bell = " + SalaryB);

        if (SalaryB > SalaryJ){
            double total = SalaryB-SalaryJ;
            System.out.println("Bell has more salary than Jame = " + total);
        }else if (SalaryJ > SalaryB){
            double total = SalaryJ-SalaryB;
            System.out.println("Jame has more salary than Bell = " + total);
        } else if (SalaryJ == SalaryB) {
            System.out.println("Jame and Bell get the same salary");
        }
    }
}
