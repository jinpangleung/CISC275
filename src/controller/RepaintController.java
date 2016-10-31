package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Grid;
import view.View;

public class RepaintController implements ActionListener {
	private View view;
	
	public RepaintController(View view){
		this.view = view;
	}
	
	public void actionPerformed(ActionEvent e){
		Grid.getInstance().update();
		view.repaint();
	}
}
