package Employee;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        Employee[] emp = new Employee[num];


        for (int i = 0; i < num; i++) {
            char type = kb.next().charAt(0);
            String name = kb.next();
            String lastname = kb.next();
            int salary = kb.nextInt();
            String position = kb.next();

            if (type == 'E') {
                emp[i] = new Employee(name, lastname, salary, position);
            } else if (type == 'S') {
                int saleAmount = kb.nextInt();
                emp[i] = new SaleMan(name, lastname, salary, position, saleAmount);
            } else if (type == 'M') {
                int cashPosition = kb.nextInt();
                emp[i] = new Manager(name, lastname, salary, position, cashPosition);
            }

        }
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
    }
}

//ข้อ 1
/*
public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        for (int i = 0; i < num; i++) {
            String name = kb.next();
            String lastname = kb.next();

            Person newPerson = new Person(name,lastname);
            System.out.println(newPerson);
        }
    }
*/

//ข้อ 2
/*
public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int num = kb.nextInt();

    for (int i = 0; i < num; i++) {
        String name = kb.next();
        String lastname = kb.next();
        int salary = kb.nextInt();
        String position = kb.next();

        Employee newPerson = new Employee(name,lastname,salary,position);
        System.out.println(newPerson);
    }
}
*/

//ข้อ 3
/*
public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        for (int i = 0; i < num; i++) {
            char type = kb.next().charAt(0);
            String name = kb.next();
            String lastname = kb.next();
            int salary = kb.nextInt();
            String position = kb.next();

            if (type == 'E'){
                Employee newPerson = new Employee(name,lastname,salary,position);
                System.out.println(newPerson);
            } else if (type == 'S') {
                int saleAmount = kb.nextInt();
                SaleMan newPerson = new SaleMan(name,lastname,salary,position,saleAmount);
                System.out.println(newPerson);
            }
        }
    }
*/

//ข้อ 4
/*public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        Employee[] emp = new Employee[num];

        for (int i = 0; i < num; i++) {
            String name = kb.next();
            String lastname = kb.next();
            int salary = kb.nextInt();
            String position = kb.next();

            emp[i] = new Employee(name , lastname , salary , position);

        }
        int percent = kb.nextInt();

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }

        System.out.println("After update salary");

        for (int i = 0; i < emp.length; i++) {
            emp[i].upSalary(percent);
            System.out.println(emp[i]);
        }
    }

 */
