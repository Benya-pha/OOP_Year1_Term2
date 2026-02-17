package MyZoo;

public class Dolphin extends Fish {
    public Dolphin() {
    }

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + " I have a " + o + ". I like to " + move() + ". I eat " + eat();
    }

    public String move(){
        return "hover swimming" ;
    }

    public String eat(){
        return "seaweed";
    }
}
