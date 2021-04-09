package component.button;

import component.canvas.Canvas;
import component.canvas.CanvasBasicDrawTools;
import component.mode.*;

public class CompositionButton extends BasicButton {
    public CompositionButton(Canvas canvas, CanvasBasicDrawTools frontLayerBasicDrawTools, CanvasBasicDrawTools baseLayeDrawTools) {
        super("composition", canvas);
        this.mode = new CompositionMode(canvas, frontLayerBasicDrawTools, baseLayeDrawTools);
    }
}
