package component.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import component.Gui;
import component.mode.*;

public class BasicButton extends JButton implements ActionListener{
    protected Mode mode;
    public BasicButton(String buttonName) {
        super(buttonName);
        //this.mode = new AssociationMode();
        addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Gui.getCanvas().setMode(this.mode);
        System.out.println("x");
    }
    
}
