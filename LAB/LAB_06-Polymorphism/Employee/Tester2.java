package Employee;

import java.util.Scanner;

public class Tester2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter number of person : ");
        int numOfPerson = kb.nextInt();
        Employee[] employees = new Employee[numOfPerson];

        for (int i = 0; i < numOfPerson; i++) {
            System.out.println("Enter information of person (" + (i+1) + ")");
            System.out.print("Enter type of person : ");
            int type = kb.nextInt();

            if (type == 1){
                System.out.print("Enter Employee information (1) [ name salary ] : ");
                String name = kb.next();
                double salary = kb.nextDouble();
                Employee e1 = new Employee(name,salary);
                employees[i] = e1;

            } else if (type == 2 ) {
                System.out.print("Enter Sale information (1) [ name salary commission ] : ");
                String name = kb.next();
                double salary = kb.nextDouble();
                double commission = kb.nextDouble();
                Sales s1 = new Sales(name , salary , commission);
                employees[i] = s1;

            } else if (type == 3 ) {
                System.out.print("Enter Manager information (1) [ name salary parkNo ] : ");
                String name = kb.next();
                double salary = kb.nextDouble();
                String parkNo = kb.next();
                Manager m1 = new Manager(name, salary, parkNo);
                employees[i] = m1;

            } else if (type == 4 ) {
                System.out.print("Enter Programmer information (1) [ name salary OT ] : ");
                String name = kb.next();
                double salary = kb.nextDouble();
                int OT = kb.nextInt();
                System.out.print("Enter number of programmer language : ");
                int numberOfProgrammer = kb.nextInt();

                String[] nameS = new String[numberOfProgrammer];

                for (int j = 0; j < nameS.length ; j++) {
                    System.out.print("Enter name of language (" + (j+1) + ") : ");
                    nameS[j] = kb.next();
                }
                Programmer p1 = new Programmer(name, salary, nameS , OT);

                employees[i] = p1;
            }
        }

        System.out.println("<=== The detail of each person ===>");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            System.out.println();
        }
    }
}
