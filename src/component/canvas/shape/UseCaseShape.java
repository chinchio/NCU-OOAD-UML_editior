package component.canvas.shape;

import component.canvas.CanvasBasicDrawTools;

public class UseCaseShape extends BasicShape {
    public UseCaseShape(double anchor_x, double anchor_y, double width, double height) {
        super(anchor_x, anchor_y, width, height);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void paint(CanvasBasicDrawTools drawTools) {
        drawTools.oval(this.anchor.getX(), this.anchor.getY(), width, height);
        drawTools.text(this.anchor.getX() + this.width / 4, this.anchor.getY() + this.width / 4, "Use Case");
    }
}
