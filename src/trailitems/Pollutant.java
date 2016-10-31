package trailitems;

import drawing.Animation;
import drawing.Offset;
import model.Color;

public class Pollutant extends TrailItem {
	
	public Pollutant(int health){
		health = this.health;
		speed = 1;
		isBad = false;
		color = Color.RED;
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
