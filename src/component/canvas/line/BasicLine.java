package component.canvas.line;

import component.UMLCanvasObject;
import component.canvas.CanvasBasicDrawTools;
import component.canvas.point.Point;

public class BasicLine extends UMLCanvasObject {
    protected Point startPoint, endPoint;
    public BasicLine(Double x1, double y1, double x2, double y2) {
        super();
        startPoint = new Point(x1, y1);
        endPoint = new Point(x2, y2);
    }
    @Override
    public void move(double deltaX, double deltaY){

    }

    @Override
    public boolean inside(double x, double y){
        return false;
    }

    @Override
    public boolean coverage(double x, double y, double width, double height) {
        // TODO Auto-generated method stub
        if(
            startPoint.getX() >= x && startPoint.getX() <= x + width &&
            startPoint.getY() >= y && startPoint.getY() <= y + height &&
            endPoint.getX() >= x && endPoint.getX() <= x + width &&
            endPoint.getY() >= y && endPoint.getY() <= y + height
        ){
            return true;
        }
        return false;
    }
    @Override
    public Point getCloseMidPoint(double x, double y){
        return null;
    }

    @Override
    public void paint(CanvasBasicDrawTools drawTools) {
        // TODO Auto-generated method stub
        
    }
}
