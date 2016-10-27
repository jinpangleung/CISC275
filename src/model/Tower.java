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
	
	public int getCooldownRemaining(){
		return this.cooldownRemaining;
	}
	
	public int getRange(){
		return this.range;
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
