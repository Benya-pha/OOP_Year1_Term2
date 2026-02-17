package Logistics04;

public class AirLogistics extends Logistics{
    public Transport createTransport(){
        return new Plane();
    }
}
