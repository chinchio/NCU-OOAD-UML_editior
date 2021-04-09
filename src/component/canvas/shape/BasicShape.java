package component.canvas.shape;

import component.UMLCanvasObject;
import component.canvas.CanvasBasicDrawTools;
import component.canvas.point.BaseShapeMidPoint;
import component.canvas.point.Point;

public abstract class BasicShape extends UMLCanvasObject {
    protected double width, height;
    protected Point anchor;
    protected BaseShapeMidPoint shapeMidPoint;

    public BasicShape(double anchor_x, double anchor_y, double width, double height) {
        super();
        this.anchor = new Point(anchor_x, anchor_y);
        this.width = width;
        this.height = height;
        this.shapeMidPoint = new BaseShapeMidPoint(anchor_x, anchor_y, width, height);
    }

    @Override
    public void move(double deltaX, double deltaY) {
        this.anchor.setPoint(anchor.getX() + deltaX, anchor.getY() + deltaY); //moving
        this.shapeMidPoint.move(deltaX, deltaY);
    }

    @Override
    public abstract void paint(CanvasBasicDrawTools drawTools);

    @Override
    public boolean inside(double x, double y) {
        if ( //condition
                ( x <= anchor.getX() + width && x >= anchor.getX() ) &&
                ( y <= anchor.getY() + height && y >= anchor.getY() ) 
            ) {
                return true;
        }
        return false;
    }

    @Override
    public boolean coverage(double x, double y, double width, double height) {
        if ( //condition
                ( anchor.getX() >= x ) &&
                ( anchor.getY() >= y ) &&
                ( anchor.getX() + this.width <= x + width) &&
                ( anchor.getY() + this.height <= y + height)
            ) {
                return true;
        }
        return false;
    }

    @Override
    public Point getCloseMidPoint(double x, double y) {
        Point comparePoint = new Point(x, y);
        Point cloestPoint = new Point();
        double distance = Double.MAX_VALUE;
        for (Point point : this.shapeMidPoint.getShapeMidPoints()) {
            if(point.calcDistance(comparePoint) < distance) {
                distance = point.calcDistance(comparePoint);
                cloestPoint = point;
            }
        }
        return cloestPoint;
    }
}
