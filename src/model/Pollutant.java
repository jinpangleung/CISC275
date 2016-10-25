package model;

public class Pollutant extends TrailItem {
	
	public Pollutant(int health){
		health = this.health;
		speed = 1;
		isBad = false;
		color = Color.RED;
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
