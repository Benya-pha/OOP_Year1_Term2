package MyZoo;

public class Duck extends Poultry{

    public Duck() {
    }


    public Duck(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + " I have a " + o.getType() + ". I like to " + move() + ". I eat " + eat();
    }


    public String move(){
        return "swimming" ;
    }

    public String eat(){
        return "rice";
    }
}
