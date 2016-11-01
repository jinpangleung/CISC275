package towers;

import model.GridColor;
import model.GridItem;

/**
 * A Tower is an abstract object that extends GridItem. 
 * 
 * @author leung
 * @version 1
 * @attributes GridColor - Color on the grid
 * @attributes cooldownRemaining - Cooldown for tower
 * @attributes range - range of tower
 * @throw
 * @return
 */

public abstract class Tower extends GridItem {
	
	//// Attributes ////
	protected GridColor gridColor;
	protected int cooldownRemaining;
	protected int range;
	
	
	
	////  Getters  ////
	public GridColor getColor(){
		return this.gridColor;
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
		switch(gridColor){
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
