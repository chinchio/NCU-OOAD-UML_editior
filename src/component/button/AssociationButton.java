package component.button;

import component.canvas.Canvas;
import component.canvas.CanvasBasicDrawTools;
import component.mode.*;

public class AssociationButton extends BasicButton {
    public AssociationButton(Canvas canvas, CanvasBasicDrawTools frontLayerBasicDrawTools, CanvasBasicDrawTools baseLayeDrawTools) {
        super("Association Line", canvas);
        this.mode = new AssociationMode(canvas, frontLayerBasicDrawTools, baseLayeDrawTools);
    }
}
