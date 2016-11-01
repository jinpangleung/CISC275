package trailitems;

import model.GridColor;
import model.Grid;
import model.GridItem;
import model.Posn;

/**
 * 
 * trailitems are items that flow through the river
 * 
 * @author Roy Cheng
 * @version 1
 * @attributes health - health of the trailitems
 * @attributes speed - how fast they travel in the river
 * @attributes isBad - if it is bad to click on it
 * 
 */


//Abstract class
public class TrailItem extends GridItem {
	
	//// Attributes ////
	protected int health;
	protected int speed;
	protected boolean isBad; //is bad when you click on it
	protected GridColor color;
	
	//// Constants ////
	protected final int CLICKDAMAGE = 1;
	
	//// Getters ////
	public int getHealth(){
		return this.health;
	}
	public int getSpeed(){
		return this.speed;
	}
	public boolean getIsBad(){
		return this.isBad;
	}
	public GridColor getColor(){
		return this.color;
	}
	public void setSpeed(int s){
		this.speed = s;
	}
	
	//// Methods ////
	public void damage(){
		// TODO
	}
	public void click(){
		// TODO
	}
	
	@Override
	public void update() {
		// Adjust pixel position based on position of the grid cell and speed
		
		switch (Grid.getInstance().getCellAt(gridPosn).getDirection()){
			case NORTH:
				pixelPosn.setY(pixelPosn.getY() - speed);
				break;
			case SOUTH:
				pixelPosn.setY(pixelPosn.getY() + speed);
				break;
			case EAST:
				pixelPosn.setX(pixelPosn.getX() + speed);
				break;
			case WEST:
				pixelPosn.setX(pixelPosn.getX() - speed);
				break;
		}		
		// Check if new pixel position requires a change in grid position
		Posn newCellPosn = Grid.getInstance().getCellPosnFromPixelPosn(pixelPosn);
		gridPosn = newCellPosn;
		
		
	}
	
	public String toString(){
		String str = "";
		str += this.getClass();
		str += " ";
		str += Integer.toString(health) + " ";
		str += gridPosn.toString();
		str += " ";
		str += pixelPosn.toString();
		return str;
	}

}
