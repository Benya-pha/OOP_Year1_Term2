package Logistics02;

public class Logistics {
    private Transport trans;
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
