package component.mode;

import java.awt.event.MouseEvent;

import component.canvas.Canvas;
import component.canvas.CanvasBasicDrawTools;
import component.canvas.shape.UseCaseShape;

public class UseCaseMode extends Mode {
    protected static final double width = 200, height = 100; //not good
    public UseCaseMode(Canvas canvas, CanvasBasicDrawTools frontLayerBasicDrawTools, CanvasBasicDrawTools baseLayeDrawTools) {
        super(canvas, frontLayerBasicDrawTools, baseLayeDrawTools);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        this.canvasDrawObjectList.add(new UseCaseShape(e.getX(), e.getY(), width, height));
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
