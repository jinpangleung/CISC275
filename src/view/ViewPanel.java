package view;

import java.awt.*;

import javax.swing.*;
import model.Grid;

public class ViewPanel extends JPanel {
	private static final long serialVersionUID = 6786945841076036254L;

	public ViewPanel(){
		this.setFocusable(true);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Grid.getInstance().draw(g);
	}
}
