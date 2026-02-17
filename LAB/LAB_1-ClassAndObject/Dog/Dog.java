package Dog;

public class Dog {
    String name;
    String breed;

    public Dog (){
        this.name = "unknow";
        this.breed = "unknow";
    }

    public Dog (String name , String breed){
        this.name = name;
        this.breed = breed;
    }

    void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    void setBreed (String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }

    public static void makeSound(){
        System.out.print("Boc Boc Boc");
    }

}
