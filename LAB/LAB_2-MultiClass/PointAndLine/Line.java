package PointAndLine;

public class Line {
    Point start;
    Point end;

    public Line(){
        start = new Point();
        end = new Point();
    }
    public Line(Point s , Point e){
        start = s ;
        end = e;
    }

    public Line(int xStart , int yStart , int xEnd , int yEnd){
        start = new Point( xStart , yStart );
        end = new Point( xEnd , yEnd );
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public double distance(){
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }

    public String toString() {
        return "Line(" + "start = " + start + " , end = " + end + ")";
    }
}
