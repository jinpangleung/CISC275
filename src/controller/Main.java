package controller;

import javax.swing.JFrame;
import javax.swing.Timer;
import model.Grid;
import view.View;

public class Main {
	
	public static void main(String[] args){
		// create new model, view and controller
		Grid.getInstance(); // Initialize the Grid
		System.out.println("Grid Created");
		View view = new View();
		System.out.println("View Create");
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setExtendedState(JFrame.MAXIMIZED_BOTH);
		view.setUndecorated(true);
		MouseController mouseController = 
				new MouseController();
		RepaintController repaintController = 
				new RepaintController(view);
		
		// repaint timer so that the window will update every 25 ms
	    new Timer(25, repaintController).start();
		
		/* register other controllers as listeners */
		view.registerListeners(mouseController);
		
		/* start it up */
		view.setVisible(true);
	}
}
