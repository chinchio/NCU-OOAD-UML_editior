package component.button;

import component.canvas.Canvas;
import component.canvas.CanvasBasicDrawTools;
import component.mode.*;

public class ClassButton extends BasicButton {
    public ClassButton(Canvas canvas, CanvasBasicDrawTools frontLayerBasicDrawTools, CanvasBasicDrawTools baseLayeDrawTools) {
        super("Class", canvas);
        this.mode = new ClassMode(canvas, frontLayerBasicDrawTools, baseLayeDrawTools);
    }
}
