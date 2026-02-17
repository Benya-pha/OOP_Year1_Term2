package Rectangle;

public class Box extends Rectangle{
    public double depth;

    public Box() {
        this.length = 0;
        this.width = 0;
        this.depth = 0;
    }

    public Box(double length, double width, double depth) {
        super(length, width);
        this.depth = depth;
    }

    public void setDimension(double length, double width ,double depth){
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public double volumn(){
        return width*length*depth;
    }

    public double surface(){
        return (2*width*length) + (2*length*depth) + (2*width*depth);
    }

    @Override
    public String toString() {
        return "Box: width = " + width + " " + "length = " + length + " " + "depth = " + depth;
    }
}
