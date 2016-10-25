package model;


//Abstract class
public class TrailItem extends GridItem {
	
	//// Attributes ////
	protected int health;
	protected int speed;
	protected boolean isBad; //is bad when you click on it
	protected Color color;
	
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
	public Color getColor(){
		return this.color;
	}
	
	//// Methods ////
	public void damage(){
		// TODO
	}
	public void click(){
		// TODO
	}

}
