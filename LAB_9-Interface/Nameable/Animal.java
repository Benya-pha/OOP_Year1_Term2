package Nameable;

public  class Animal implements Nameable {
    String name;
    String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
