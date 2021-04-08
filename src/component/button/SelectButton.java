package component.button;

import component.mode.*;

public class SelectButton extends BasicButton {
    public SelectButton() {
        super("select");
        this.mode = new SelectMode();
    }
}
