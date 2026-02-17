package Logistics03;

public class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport(){
        return new Truck();
    }
}
