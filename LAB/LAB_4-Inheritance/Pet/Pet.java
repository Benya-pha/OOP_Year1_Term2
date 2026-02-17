package Pet;

public class Pet {
    protected String name;
    protected int weight;

    public Pet(){
        name = "unknow";
        weight = 0;
    }

    public Pet(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eatFood(String food){
        System.out.println("Pet eat " + food);
    }

    @Override
    public String toString() {
        return "Pet " + "name='" + name + '\'' + ", weight=" + weight;
    }
}
