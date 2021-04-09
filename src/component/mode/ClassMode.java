package component.mode;

import java.awt.event.MouseEvent;

import component.canvas.Canvas;
import component.canvas.CanvasBasicDrawTools;
import component.canvas.shape.ClassShape;

public class ClassMode extends Mode {
    public static final double width = 300, height = 200; //not good
    public ClassMode(Canvas canvas, CanvasBasicDrawTools frontLayerBasicDrawTools, CanvasBasicDrawTools baseLayeDrawTools) {
        super(canvas, frontLayerBasicDrawTools, baseLayeDrawTools);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        this.canvasDrawObjectList.add(new ClassShape(e.getX(), e.getY(), width, height));
        this.gui.updateCanvas();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
