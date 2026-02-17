package Logistics04;

public abstract class Logistics {

    private Transport trans;
    private double distance = 0;

    public double planDelivery(double distance){
        this.trans = createTransport();
        this.distance = distance;
        Transport t = createTransport();
        return distance*trans.getRate();
    }

    public void deliver(){
        trans.deliver();
    }

    public abstract Transport createTransport();
}
