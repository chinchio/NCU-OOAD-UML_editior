package component.button;

import component.canvas.Canvas;
import component.canvas.CanvasBasicDrawTools;
import component.mode.*;

public class SelectButton extends BasicButton {
    public SelectButton(Canvas canvas, CanvasBasicDrawTools frontLayerBasicDrawTools, CanvasBasicDrawTools baseLayeDrawTools) {
        super("select", canvas);
        this.mode = new SelectMode(canvas, frontLayerBasicDrawTools, baseLayeDrawTools);
    }
}
