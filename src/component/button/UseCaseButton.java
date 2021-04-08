package component.button;

import component.mode.*;

public class UseCaseButton extends BasicButton {
    public UseCaseButton() {
        super("use case");
        this.mode = new UseCaseMode();
    }
}
