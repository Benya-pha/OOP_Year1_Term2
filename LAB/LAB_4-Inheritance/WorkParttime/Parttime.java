package WorkParttime;

public class Parttime extends Person{
    private int hourWork;
    private int rate;

    public Parttime() {
    }

    public Parttime(String name, String surnsme,int hourWork , int rate) {
        super(name, surnsme);
        this.hourWork = hourWork;
        this.rate = rate;
    }

    public int Pay(){
        return hourWork*rate;
    }
}
