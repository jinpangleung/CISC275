package model;

public class InvasiveItem extends TrailItem {
	
	public InvasiveItem(){
		health = 1;
		speed = 1;
		isBad = false;
		color = Color.RED;
	}
	
	//// Methods ////
	@Override
	public void click(){//checking if in radius should be done by tower
		// TODO
		health--;
		//set object to null
	}
	
}
