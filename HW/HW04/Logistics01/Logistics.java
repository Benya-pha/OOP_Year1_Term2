package Logistics01;

public class Logistics {
    private Truck trans;
    private double distance = 0;

    public double planDelivery(Truck trans , double distance){
        this.trans = trans;
        this.distance = distance;
        return distance*trans.getRate();
    }

    public void deliver(){
        trans.deliver();
    }
}
