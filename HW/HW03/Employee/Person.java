package Employee;

public class Person {
    protected String fristname;
    protected String lastname;

    public Person() {

    }

    public Person(String fristname, String lastname) {
        this.fristname = fristname;
        this.lastname = lastname;
    }

    public String getFristname() {
        return fristname;
    }

    public void setFristname(String fristname) {
        this.fristname = fristname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person : " + fristname + " " + lastname;
    }
}