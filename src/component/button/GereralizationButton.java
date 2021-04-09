package component.button;

import component.canvas.Canvas;
import component.canvas.CanvasBasicDrawTools;
import component.mode.*;

public class GereralizationButton extends BasicButton {
    public GereralizationButton(Canvas canvas, CanvasBasicDrawTools frontLayerBasicDrawTools, CanvasBasicDrawTools baseLayeDrawTools) {
        super("gereralizatio", canvas);
        this.mode = new GeneralizationMode(canvas, frontLayerBasicDrawTools, baseLayeDrawTools);
    }
}
