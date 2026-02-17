package WorkParttime;

public class Person {
    protected String name;
    protected String surnsme;

    public Person(){

    }

    public Person(String name, String surnsme) {
        this.name = name;
        this.surnsme = surnsme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnsme() {
        return surnsme;
    }

    public void setSurnsme(String surnsme) {
        this.surnsme = surnsme;
    }

    @Override
    public String toString() {
        return "Person  " + "name : " + name + " " + surnsme ;
    }
}
