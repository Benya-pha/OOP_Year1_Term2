package Pet;

public class Tester {
    public static void main(String[] args) {
        Dog myDog =  new Dog("Dang" , 12);
        System.out.println(myDog);
        myDog.eatFood("pedeegre");
        myDog.makeSound();

        System.out.println();

        Cat som = new Cat("som",4);
        System.out.println(som);
        som.eatFood("fish");
        som.makeSound();;
    }
}
