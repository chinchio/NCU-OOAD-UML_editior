package component.button;

import component.mode.*;

public class CompositionButton extends BasicButton {
    public CompositionButton() {
        super("composition");
        this.mode = new CompositionMode();
    }
}
