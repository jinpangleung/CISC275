package model;

public abstract class Tower extends GridItem {
	
	//// Attributes ////
	protected Color color;
	protected int cooldownRemaining;
	protected int range;
	
	
	
	////  Getters  ////
	public Color getColor(){
		return this.color;
	}
	
	public int getcooldownRemaining(){
		return this.cooldownRemaining;
	}
	
	public int getRange(){
		return this.range;
	}
	
	
	
	//// Methods ////
	public void ability(){
		
	}
	
	@Override
	public void update(){
		//TODO update should probably pass around elapsedTickTime, add after controller is implemented - Gifan
		if(cooldownRemaining > 0){
			cooldownRemaining = cooldownRemaining - elapsedTickTime;
		}
	}
}
