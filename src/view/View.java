package view;

import java.awt.*;
import javax.swing.*;

import controller.MouseController;

public class View extends JFrame {
	private static final long serialVersionUID = 4858054666476821149L;
	
	private ViewPanel panel;
	private FlowLayout layout = new FlowLayout();
	
	public View(){
		super("Estuary");
		panel = new ViewPanel();
		add(panel, BorderLayout.CENTER);
		panel.setBackground(Color.WHITE);
		panel.requestFocus();
	}
	
	public void registerListeners(MouseController mouseController){
		panel.addMouseListener(mouseController);
		panel.addMouseMotionListener(mouseController);
	}
	
	public Dimension getPanelSize(){
		return panel.getSize();
	}
}

