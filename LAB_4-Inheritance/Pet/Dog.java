package Pet;

public class Dog extends Pet {

    public Dog() {
    }

    public Dog(String name, int weight) {
        super(name, weight); // super = สิง่ที่อ้างอิงถึงคลาสแม่
    }

    public void makeSound(){
        System.out.println("Boc Boc");
    }
}
