package Person;

public class Police extends Person{
    String workCountry;

    public Police() {
    }

    public Police(String name, int bornYear, String workCountry) {
        super(name, bornYear);
        this.workCountry = workCountry;
    }

    public void introduce(){
        System.out.println("My name is " + name + ".");
        System.out.println("I was born in " + bornYear + ".");
        System.out.println("I’ m a police and work in " + workCountry + ".");
    }
}
