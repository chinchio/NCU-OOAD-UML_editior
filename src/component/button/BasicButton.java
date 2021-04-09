package component.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import component.canvas.Canvas;
import component.mode.*;

public class BasicButton extends JButton implements ActionListener{
    protected Mode mode;
    protected Canvas canvas;

    public BasicButton(String buttonName, Canvas canvas) {
        super(buttonName);
        addActionListener(this);
        this.canvas = canvas;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.canvas.setMode(this.mode);
    }
    
}
