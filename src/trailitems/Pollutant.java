package trailitems;

import drawing.Animation;
import drawing.Offset;
import model.GridColor;

/**
 * 
 * Pollutant are stuff that's bad for the estuary, you are supposed to pick them up.
 * 
 * @author Roy Cheng
 * @version 1
 * @attributes health - health of the trailitems
 * @attributes speed - how fast they travel in the river
 * @attributes isBad - if it is bad to click on it
 * 
 */

public class Pollutant extends TrailItem {
	
	public Pollutant(int health){
		health = this.health;
		speed = 1;
		isBad = false;
		color = GridColor.RED;
		animation = new Animation("pollutant", Offset.CENTER, Offset.CENTER);
	}
	
	@Override
	public void click(){//checking if in radius should be done by tower
		health--;
		if (health > 0){//health can be upto 3
			//do nothing
		}
		else{
			//set object to null to remove
		}
	}
}
