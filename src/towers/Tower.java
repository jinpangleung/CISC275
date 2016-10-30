package towers;

import model.Color;
import model.GridItem;

public abstract class Tower extends GridItem {
	
	//// Attributes ////
	protected Color color;
	protected double cooldownRemaining;
	protected int range;
	protected int stormCooldown;
	
	
	////  Getters  ////
	public Color getColor(){
		return this.color;
	}
	
	public double getCooldownRemaining(){
		return this.cooldownRemaining;
	}
	
	public int getRange(){
		return this.range;
	}
	
	public int getStormCooldown(){
		return this.stormCooldown;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

	public void setCooldownRemaining(int cooldownRemaining) {
		this.cooldownRemaining = cooldownRemaining;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	public void setStormCooldown(int sCD){
		this.stormCooldown = sCD;
	}

	//// Methods ////
	public void ability(){
		
	}
	
	public boolean onCooldown(){
		if (cooldownRemaining > 0){
			return true;
		}
		return false;
	}
	
	public void update(double elapsedTickTime){
		if(cooldownRemaining > 0){
			cooldownRemaining = cooldownRemaining - elapsedTickTime;
		}
		else{
			cooldownRemaining = 0;
		}
	}
}
