package MyZoo;

public class Ray extends Fish{
    public Ray() {
    }

    public Ray(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + " I have a " + o + ". I like to " + move() + ". I eat " + eat();
    }

    public String move(){
        return "circulate swimming" ;
    }

    public String eat(){
        return "plankton";
    }
}
