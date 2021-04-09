package component.canvas.line;

import java.awt.Color;

import component.canvas.CanvasBasicDrawTools;
import component.canvas.point.Point;

public class GeneralizationLine extends BasicLine {

    public GeneralizationLine(Double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void paint(CanvasBasicDrawTools drawTools) {
        Color color = Color.BLACK;
        drawTools.line(this.startPoint.getX(), this.startPoint.getY(), this.endPoint.getX(), this.endPoint.getY(), color);
    }

    @Override
    public void move(double deltaX, double deltaY) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean inside(double x, double y) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Point getCloseMidPoint(double x, double y) {
        // TODO Auto-generated method stub
        return null;
    }
}
