package MyZoo;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        Animal[] animals = new Animal[num];

        for (int i = 0; i < animals.length; i++) {

            String  typeAnimal = kb.next();
            String name = kb.next();

            if (typeAnimal.equals("Duck")){

                animals[i] = new Duck(name);
                Poultry.count++;

            }else if (typeAnimal.equals("Chicken")){

                Poultry.count++;
                animals[i] = new Chicken(name);

            }else if (typeAnimal.equals("Dolphin")){

                Fish.count++;
                animals[i] = new Dolphin(name);

            }else if (typeAnimal.equals("Ray")){

                Fish.count++;
                animals[i] = new Ray(name);
            }

        }

        System.out.println();

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        System.out.println();

        System.out.println("Count FIsh " + Fish.count);
        System.out.println("Count Poultry " + Poultry.count);

    }
}
