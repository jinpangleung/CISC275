package model;

public class Larvae extends TrailItem {
	//// Constructor ////
	public Larvae(){
		health = 1;
		speed = 1;
		color = color.WHITE;
		isBad = true;
	}
	
	//// Methods ////
	@Override
	public void click(){//checking if in radius should be done by tower
		// TODO
		health--;
		//make estuary happiness go down because isBad is true
		//set object to null for garbage collector
	}
}
