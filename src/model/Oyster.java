package model;

public class Oyster extends TrailItem{
	
	//// Constructor ////
	public Oyster(){
		health = 1;
		speed = 1;
		color = color.BLUE;
		isBad = false;
	}
	
	//// Methods ////
	@Override
	public void click(){//checking if in radius should be done by tower
		// TODO
		health--;
		//speed--; shouldnt matter if we subtract
		//OysterCount++; need to connect this to OysterCount(has OysterClicked method)
		//thats connected to Gabbion which is connected to GridItem(which connects to TrailItem)
		if(health == 0){//probably don't need this, but gaurantees its 0
			//object remove or object change
			//object == null; //refer to comment bellow
		}
	}
}
/*
You can delete an object in Java by removing the reference to it by assigning null. 
After that, it will be automatically deleted by the Garbage Collector. 
You should remove the references to it by assigning null or leaving the block where it was declared.
 */
