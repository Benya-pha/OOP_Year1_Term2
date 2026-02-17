package MyZoo;

public class Fish extends Animal{
    private String my_type = "Fish";

    public Fish() {
    }

    public Fish(String name) {
        super(name,new Organ("Fin"));
    }

    @Override
    public String toString() {
        return  super.toString() + ". I am a Fish.";
    }
    static int count;
}
