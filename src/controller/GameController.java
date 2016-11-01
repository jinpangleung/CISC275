/*package controller;

import model.Grid;

public class GameController {
	private Grid model;
	private View view;
	boolean isRunning;
	// This means timeRate milliseconds per tick
	public static final double TICKRATE = 1000;
	
	private GameController(){
		model = new Grid();
		view = new View();
		isRunning = false;
	}
	
	public static void main(String [] args){
		GameController game = new GameController();
		game.runGame();
		//TODO implement
	}
	
	public void runGame(){
		isRunning = true;
		double previous = System.currentTimeMillis();
		double lag = 0.0;
		
		while (isRunning)
		{
		  double current = System.currentTimeMillis();
		  double elapsed = current - previous;
		  previous = current;
		  
		  // Update game and u
		  isRunning = Grid.update(elapsed);
		  
		  // render();
		}
	}
}
*/
