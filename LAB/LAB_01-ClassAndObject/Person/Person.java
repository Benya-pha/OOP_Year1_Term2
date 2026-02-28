package Person;

public class Person {
    String name;
    double weight;
    double height;

    void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

    double bmi(){
        return weight/Math.pow(height,2);
    }
}
