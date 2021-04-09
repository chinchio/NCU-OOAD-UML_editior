package component.canvas.line;

import java.awt.Color;

import component.canvas.CanvasBasicDrawTools;

public class CompositionLine extends BasicLine {

    public CompositionLine(Double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void paint(CanvasBasicDrawTools drawTools) {
        Color color = Color.ORANGE;
        drawTools.line(this.startPoint.getX(), this.startPoint.getY(), this.endPoint.getX(), this.endPoint.getY(), color);
    }
}
