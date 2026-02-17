package Nameable;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String name = kb.next();
        int age = kb.nextInt();

        Nameable P1 = new Person(name,age);

        P1.setName(name);
        System.out.println(P1.getName());

//-----------------------------------------------------------

        String nameThings = kb.next();
        String howToUse = kb.next();

        Nameable T1 = new Things(name,howToUse);

        T1.setName(nameThings);
        System.out.println(T1.getName());

//-----------------------------------------------------------

        String nameAnimal = kb.next();
        String Type = kb.next();

        Nameable A1 = new Animal(nameAnimal,Type);

        A1.setName(nameAnimal);
        System.out.println(A1.getName());
    }
}
