package component.button;

import component.canvas.Canvas;
import component.canvas.CanvasBasicDrawTools;
import component.mode.*;

public class UseCaseButton extends BasicButton {
    public UseCaseButton(Canvas canvas, CanvasBasicDrawTools frontLayerBasicDrawTools, CanvasBasicDrawTools baseLayeDrawTools) {
        super("use case", canvas);
        this.mode = new UseCaseMode(canvas, frontLayerBasicDrawTools, baseLayeDrawTools);
    }
}
