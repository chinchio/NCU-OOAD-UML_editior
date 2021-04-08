package component.button;

import component.mode.*;

public class ClassButton extends BasicButton {
    public ClassButton() {
        super("Class");
        this.mode = new ClassMode();
    }
}
