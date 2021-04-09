package component.canvas.point;

public class Point {
    private double x, y;
    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double calcDistance(Point point) {
        return Math.sqrt( Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    public double calcDistance(Point pointA, Point pointB) {
        /*
        * Get two points distance.
        * two_point_distance = sqrt{  (pointA.x - pointB.x)^ 2  + (pointA.y - pointB.y)^ 2 }
        */
        return Math.sqrt( Math.pow(pointA.x - pointB.x, 2) + Math.pow(pointA.y - pointB.y, 2));
    }
}
