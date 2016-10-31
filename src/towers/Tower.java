package towers;

import model.Color;
import model.GridItem;

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
	
	public void setCooldownRemaining(int cd){
		this.cooldownRemaining = cd;
	}
	
	public String toString(){
		String str = "";
		switch(color){
		case RED: str += "Red Tower "; break;
		case BLUE: str += "Blue Tower "; break;
		case GREEN: str += "Green Tower "; break;
		default: str += "Undefined Color Tower "; break;
		}
		str += "Grid Posn: " + gridPosn.toString() + " Pixel Posn " + pixelPosn.toString() + " ";
		str += "Cooldown Remaining = " + Integer.toString(cooldownRemaining);
		return str;
	}
	
	
	
	//// Methods ////
	public void ability(){
		
	}
	
	@Override
	public void update(){
		//TODO update should probably pass around elapsedTickTime, add after controller is implemented - Gifan
		if(cooldownRemaining > 0){
			cooldownRemaining--;
		} else {
			ability();
		}
	}
}
