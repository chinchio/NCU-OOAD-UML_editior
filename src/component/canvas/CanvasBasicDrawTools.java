package component.canvas;

import java.awt.Color;
import java.awt.Graphics;

public class CanvasBasicDrawTools {
    protected Canvas canvas;
    //protected Graphics graphics;

    public CanvasBasicDrawTools(Canvas canvas) {
        this.canvas = canvas;
        //this.graphics = this.canvas.getGraphics();
    }

    public void rect(double x, double y, double width, double height) {
        Graphics graphics = canvas.getGraphics();
        graphics.setColor(Color.BLUE);
        graphics.fillRect((int) x, (int) y, (int) height, (int) height);
    }

    public void line(double x1, double y1, double x2, double y2, Color color) {
        Graphics graphics = canvas.getGraphics();
        graphics.setColor(color); //set color
        graphics.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
    }

    /*public void associationLine(double x1, double y1, double x2, double y2) {
        Graphics graphics = canvas.getGraphics();
        graphics.setColor(Color.RED);
        graphics.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
    }*/

    public void oval(double x, double y, double width, double height) {
        Graphics graphics = canvas.getGraphics();
        graphics.setColor(Color.GREEN);
        graphics.fillOval((int) x, (int) y, (int) width, (int) height);
    }

    public void text(double x, double y, String text) {
        Graphics graphics = canvas.getGraphics();
        graphics.setColor(Color.BLACK);
        graphics.drawString(text, (int) x, (int) y);
    }
     


}
