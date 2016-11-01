package model;

import java.awt.Graphics;

import towers.Tower;

/*
 * Touch controls all of our mouse based events
 * Clicking on trail items
 * Dragging/Dropping towers into place
 */

public class Touch {
	
	// Attributes
	private GridItem holding; // The grid item that you are holding, pointer
	
	public Touch(){
		holding = null;
	}
	
	// Getters/Setters
	public GridItem getHolding(){
		return holding;
	}
	public void setHolding(GridItem gi){
		holding = gi;
	}
	
	// Methods
	public void clickHandler(int mouseX, int mouseY){
		// TODO
	}
	
	public void releaseHandler(int mouseX, int mouseY){
		Tower t = (Tower) holding;
		holding = null;
		Grid.getInstance().getTowerComponent().placeTower(t);
	}
	
	public void dragHandler(int mouseX, int mouseY){
		if(holding != null){
			holding.setPixelPosn(new Posn(mouseX, mouseY));
		}
		
		System.out.println("Null");
		System.out.println("Is Dragging");
	}
	
	public void draw(Graphics g){
		if(holding != null){
			holding.draw(g);
		}
	}

}
