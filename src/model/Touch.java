package model;

/*
 * Touch controls all of our mouse based events
 * Clicking on trail items
 * Dragging/Dropping towers into place
 */

public class Touch {
	
	// Attributes
	private GridItem holding; // The grid item that you are holding, pointer
	
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
		// TODO
	}
	
	public void dragHandler(int mouseX, int mouseY){
		holding.setPixelPosn(new Posn(mouseX, mouseY));
	}

}
