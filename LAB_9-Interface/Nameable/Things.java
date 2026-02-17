package Nameable;

public  class Things implements Nameable {
    String name;
    String howToUse;

    public Things(String name, String howToUse) {
        this.name = name;
        this.howToUse = howToUse;
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
