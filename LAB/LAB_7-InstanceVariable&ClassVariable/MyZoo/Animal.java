package MyZoo;

public class Animal {
    protected String name;
    protected Organ o;

    public Animal() {
    }

    public Animal(String name, Organ o) {
        this.name = name;
        this.o = o;
    }

    @Override
    public String toString() {
        return "Hello, my name is " + name;
    }
}
