package component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import component.button.*;
import component.canvas.Canvas;

public class Gui {
    private static Canvas canvas;

    public static Canvas getCanvas() {
        return canvas;
    }

	private JMenuBar menuBar() {
		JMenuBar menubar = new JMenuBar();
		
        JMenu file_option = new JMenu("File");
		JMenu edit_option = new JMenu("Edit");

        JMenuItem group_item = new JMenuItem("Group");
        JMenuItem ungroup_item = new JMenuItem("Ungroup");
        
        edit_option.add(group_item);
        edit_option.add(ungroup_item);

		menubar.add(file_option);
		menubar.add(edit_option);
		return menubar;
	}

	private JPanel toolsPanel() {
		JPanel toolspanel = new JPanel();
		toolspanel.setLayout(new GridLayout(6, 1));
        
        JButton selectButton = new SelectButton();
        JButton associatioButton = new AssociationButton();
        JButton gereralizationButton = new GereralizationButton();
        JButton compositionButton = new CompositionButton();
        JButton classButton = new ClassButton();
        JButton useCaseButton = new UseCaseButton();

        toolspanel.add(selectButton);
        toolspanel.add(associatioButton);
        toolspanel.add(gereralizationButton);
        toolspanel.add(compositionButton);
        toolspanel.add(classButton);
        toolspanel.add(useCaseButton);

		return toolspanel;
	}

    private JPanel canvas() {
        if(canvas == null){
            canvas = new Canvas();
        }
        return canvas; 
    }

	private void drawUI() {
		JFrame mainFrame = new JFrame();
        mainFrame.setSize(1024, 768);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("UML editior");

		JMenuBar menuBar = menuBar();
        JPanel toolsPanel = toolsPanel();
        JPanel canvas = canvas();

        mainFrame.getContentPane().add(BorderLayout.NORTH, menuBar);
        mainFrame.getContentPane().add(BorderLayout.WEST, toolsPanel);
        mainFrame.getContentPane().add(BorderLayout.CENTER, canvas);

        mainFrame.setVisible(true);
	}

	public Gui() {
		drawUI();
	}

	public static void main(String[] args){
		/*JFrame demo = new JFrame();
        demo.setSize(1024, 768);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demo.setTitle("UML editior");
		
        JCheckBox checkbox = new JCheckBox("JCheckBox");
        JRadioButton radiobutton = new JRadioButton("JRadiobutton");
        JButton button = new JButton("JButton");
        JLabel label = new JLabel("JLabel");
        JTextArea textarea = new JTextArea("JTextArea");
         
        demo.getContentPane().add(BorderLayout.EAST, checkbox);
        demo.getContentPane().add(BorderLayout.WEST, radiobutton);
        demo.getContentPane().add(BorderLayout.SOUTH, button);
        demo.getContentPane().add(BorderLayout.NORTH , label);
        demo.getContentPane().add(BorderLayout.CENTER, textarea);

        JPanel toolsPanel = new JPanel();
        JMenuBar menuBar = new JMenuBar();
        JButton button = new JButton("JButton");
        toolsPanel.add(button);

		Gui gui = new Gui();

		JMenuBar menuBar = gui.menuBar();

        demo.getContentPane().add(BorderLayout.NORTH, menuBar);
        
        demo.setVisible(true);*/
	}
}
