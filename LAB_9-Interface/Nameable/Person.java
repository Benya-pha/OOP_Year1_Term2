package Nameable;

public  class Person implements Nameable {
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
