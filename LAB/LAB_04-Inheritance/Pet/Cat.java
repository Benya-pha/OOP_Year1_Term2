package Pet;

public class Cat extends Pet{
    public Cat() {
    }

    public Cat(String name, int weight) {
        super(name, weight);
    }

    public void makeSound(){
        System.out.println("Meaww Meaw");
    }
}
