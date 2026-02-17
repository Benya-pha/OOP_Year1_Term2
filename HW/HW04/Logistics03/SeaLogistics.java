package Logistics03;

public class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport(){
        return new Ship();
    }
}
