package gabion;

import model.GridItem;

public abstract class Gabion extends GridItem {
	
	//// Attributes ////
	protected int health;
	
	//// Setters and Getters ////
	public int getHealth(){
		return this.health;
	}
	
	public void setHealth(int x){
		this.health = x;
	}

	public void update(){
		// do nothing
	}
}
