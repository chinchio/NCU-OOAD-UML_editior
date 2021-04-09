package component;

import component.canvas.CanvasBasicDrawTools;
import component.canvas.point.Point;

public abstract class UMLCanvasObject {
    private static int generateId = 0;
    
    protected int id;
    protected String name;
    protected int depth = 0;
    protected boolean select = false;

    public abstract void move(double deltaX, double deltaY);
    public abstract void paint(CanvasBasicDrawTools drawTools);
    public abstract boolean inside(double x, double y);
    public abstract boolean coverage(double x, double y, double width, double height);
    public abstract Point getCloseMidPoint(double x, double y);

    public UMLCanvasObject() {
        id = generateId;
        generateId += 1;
    }

    public int getDepth() {
        return depth;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelectStatus(boolean status) {
        this.select = status;
    }
}
    
