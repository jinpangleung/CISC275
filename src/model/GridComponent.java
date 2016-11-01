package model;

/*
 * A GridComponent is a rectangle object that exists on the Grid.
 * It is used for click handlers and drawing
 */

public abstract class GridComponent {
	
	protected Posn topLeftCorner;
	protected Posn bottomRightCorner;
	
	public boolean isWithin(int x, int y){
		return topLeftCorner.getX() <= x && bottomRightCorner.getX() >= x
				&& topLeftCorner.getY() <= y && bottomRightCorner.getY() >= y;
	}
	
	public Posn getTopLeftCorner() {
		return topLeftCorner;
	}
	public void setTopLeftCorner(Posn topLeftCorner) {
		this.topLeftCorner = topLeftCorner;
	}
	public Posn getBottomRightCorner() {
		return bottomRightCorner;
	}
	public void setBottomRightCorner(Posn size) {
		this.bottomRightCorner = size;
	}

}
