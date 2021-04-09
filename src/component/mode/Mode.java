package component.mode;

import java.awt.event.*;
import java.util.List;

import component.canvas.Canvas;
import component.canvas.CanvasBasicDrawTools;
import component.Gui;
import component.UMLCanvasObject;

public abstract class Mode {
    protected CanvasBasicDrawTools frontLayerBasicDrawTools, baseLayeDrawTools;
    protected Canvas canvas;
    protected List<UMLCanvasObject> canvasDrawObjectList;
    protected Gui gui;

    public Mode(Canvas canvas, CanvasBasicDrawTools frontLayerBasicDrawTools, CanvasBasicDrawTools baseLayeDrawTools) {
        this.canvas = canvas;
        this.frontLayerBasicDrawTools = frontLayerBasicDrawTools;
        this.baseLayeDrawTools = baseLayeDrawTools;

        this.gui = Gui.gui; //worst
        this.canvasDrawObjectList = Gui.canvasDrawObjectList; //worst
        System.out.print(this.canvasDrawObjectList);
    }

    public void group() {
        //select mode
    };
    public void unGroup() {
        //select mode
    };
    public void changeName() {
        //select mode
    };

    public abstract void mousePressed(MouseEvent e);
    public abstract void mouseDragged(MouseEvent e);
    public abstract void mouseReleased(MouseEvent e);
}
