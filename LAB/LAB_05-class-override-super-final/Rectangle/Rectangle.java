package Rectangle;

public class Rectangle {
    public double length;
    public double width;

    public Rectangle(){
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setDimension(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area(){
        return width*length;
    }

    public double surface(){
        return (2*width) + (2*length);
    }

    @Override
    public String toString() {
        return "Rectangel: width = " + width + " " + "length = " + length;
    }
}
