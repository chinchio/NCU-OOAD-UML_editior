package component.button;

import component.mode.*;

public class GereralizationButton extends BasicButton {
    public GereralizationButton() {
        super("gereralizatio");
        this.mode = new GeneralizationMode();
    }
}
