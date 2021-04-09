package component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import component.button.*;
import component.canvas.Canvas;
import component.canvas.CanvasBasicDrawTools;

public class Gui {
    private Canvas canvas; 
    private CanvasBasicDrawTools frontLayerDrawTools, baseLayerDrawTools;
    public static List<UMLCanvasObject> canvasDrawObjectList = new ArrayList<>(); //worst
    public static Gui gui; //worst

    /*
    public void addCanvasDrawObjectList(UMLCanvasObject canvasObject) {
        canvasDrawObjectList.add(canvasObject);
        updateCanvas();
    }
    */

    public UMLCanvasObject getClickObject(double x, double y) {
        for (UMLCanvasObject umlCanvasObject : canvasDrawObjectList) {
            if (umlCanvasObject.inside(x, y)){
                return umlCanvasObject;
            }
        }
        return null;
    }

    public void updateCanvas() {
        for (UMLCanvasObject canvasObject : canvasDrawObjectList) {
            System.out.println(canvasObject);
            canvasObject.paint(this.baseLayerDrawTools);
        }
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
        
        JButton selectButton = new SelectButton(this.canvas, this.frontLayerDrawTools, this.baseLayerDrawTools);
        JButton associatioButton = new AssociationButton(canvas, this.frontLayerDrawTools, this.baseLayerDrawTools);
        JButton gereralizationButton = new GereralizationButton(canvas, this.frontLayerDrawTools, this.baseLayerDrawTools);
        JButton compositionButton = new CompositionButton(canvas, this.frontLayerDrawTools, this.baseLayerDrawTools);
        JButton classButton = new ClassButton(canvas, this.frontLayerDrawTools, this.baseLayerDrawTools);
        JButton useCaseButton = new UseCaseButton(canvas, this.frontLayerDrawTools, this.baseLayerDrawTools);

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
            this.canvas = new Canvas();
            this.frontLayerDrawTools = new CanvasBasicDrawTools(canvas);
            this.baseLayerDrawTools = new CanvasBasicDrawTools(canvas);
        }
        return canvas; 
    }

	private void drawUI() {
		JFrame mainFrame = new JFrame();
        mainFrame.setSize(1024, 768); //set windows size
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("UML editior");

        JPanel canvas = canvas(); //must be the first excute
        canvas.setBackground(Color.GRAY);
		JMenuBar menuBar = menuBar();
        JPanel toolsPanel = toolsPanel();

        mainFrame.getContentPane().add(BorderLayout.NORTH, menuBar);
        mainFrame.getContentPane().add(BorderLayout.WEST, toolsPanel);
        mainFrame.getContentPane().add(BorderLayout.CENTER, canvas);

        mainFrame.setVisible(true);
	}

	public Gui() {
        this.gui = this;
		drawUI();
	}

}
