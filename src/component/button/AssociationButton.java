package component.button;

import component.mode.*;

public class AssociationButton extends BasicButton {
    public AssociationButton() {
        super("Association Line");
        this.mode = new AssociationMode();
    }
}
