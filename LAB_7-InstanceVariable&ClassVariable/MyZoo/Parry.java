package MyZoo;

public class Parry extends Poultry{
    public Parry() {
    }

    public Parry(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  super.toString() + " I have a " + o.getType() + ". I like to " + move() + ". I eat " + eat();
    }

    public String move(){
        return "speaking" ;
    }

    public String eat(){
        return "bean";
    }
}
