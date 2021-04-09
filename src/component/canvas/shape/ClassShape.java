package component.canvas.shape;

import component.canvas.CanvasBasicDrawTools;

public class ClassShape extends BasicShape {
    public ClassShape(double anchor_x, double anchor_y, double width, double height) {
        super(anchor_x, anchor_y, width, height);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void paint(CanvasBasicDrawTools drawTools) {
        drawTools.rect(this.anchor.getX(), this.anchor.getY(), width, height);
        drawTools.text(this.anchor.getX() + this.width / 4, this.anchor.getY() + this.width / 4, "Class");
    }
}
