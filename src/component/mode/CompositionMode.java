package component.mode;

import java.awt.event.MouseEvent;

import component.UMLCanvasObject;
import component.canvas.Canvas;
import component.canvas.CanvasBasicDrawTools;
import component.canvas.line.*;
import component.canvas.point.Point;

public class CompositionMode extends Mode {
    private Point connectionStartPoint, connectionEndPoint;
    private UMLCanvasObject pressFromObject, releaseOnObject;

    public CompositionMode(Canvas canvas, CanvasBasicDrawTools frontLayerBasicDrawTools, CanvasBasicDrawTools baseLayeDrawTools) {
        super(canvas, frontLayerBasicDrawTools, baseLayeDrawTools);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        pressFromObject = this.gui.getClickObject(e.getX(), e.getY());
        connectionStartPoint = this.pressFromObject.getCloseMidPoint(e.getX(), e.getY());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (connectionStartPoint != null) { //null point exception !!!
            releaseOnObject = this.gui.getClickObject(e.getX(), e.getY());
            connectionEndPoint = this.releaseOnObject.getCloseMidPoint(e.getX(), e.getY());
            if (connectionEndPoint != null) { //null point exception !!!
                BasicLine line = new CompositionLine(connectionStartPoint.getX(), connectionStartPoint.getY(), connectionEndPoint.getX(), connectionEndPoint.getY());
                line.paint(baseLayeDrawTools);
            }
        }
    }
    
}
