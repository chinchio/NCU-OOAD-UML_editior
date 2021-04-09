package component.canvas;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;
import component.mode.Mode;

public class Canvas extends JPanel implements MouseInputListener {
    private static Mode canvasMode;

    public Canvas() {
        super();
        addMouseListener(this); //MouseInputListener Support
        /*
        addMouseListener(this);
        reference: https://docs.oracle.com/javase/tutorial/uiswing/events/mouselistener.html
        */
        setBackground(Color.WHITE);
    }

    public void setMode(Mode mode){
        this.canvasMode = mode;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        this.canvasMode.mouseDragged(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.canvasMode.mouseReleased(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.canvasMode.mousePressed(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
}
