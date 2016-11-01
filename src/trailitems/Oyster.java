package trailitems;

import java.util.Collection;

import drawing.Animation;
import drawing.Offset;
import model.*;

/**
 * 
 * Oyster is thing that you want to pick up, and when you picked up enough oysters you can build a oyster
 * gabion
 * 
 * @author Roy Cheng
 * @version 1
 * @attributes health - health of the trailitems
 * @attributes speed - how fast they travel in the river
 * @attributes isBad - if it is bad to click on it
 * 
 */

public class Oyster extends TrailItem{
	
	//// Constructor ////
	public Oyster(){
		health = 1;
		speed = 1;
		color = GridColor.BLUE;
		isBad = false;
		animation = new Animation("oyster", Offset.CENTER, Offset.CENTER);
	}
	
	//// Methods ////
	@Override
	public void click(){//checking if in radius should be done by tower
		health--;
		//speed--; shouldn't matter if we remove
		if(health == 0){//probably don't need this, but gaurantees its 0
			//object == null; //refer to comment below if remove doesnt work
			Grid.getInstance().getPlayer().increaseOysterCount();
			Collection<TrailItem> oyster = Grid.getInstance().getTrailItems();
			oyster.remove(this);
			Collection<GridItem> items = Grid.getInstance().getItems();
			items.remove(this);
		}
	}
}
/*
You can delete an object in Java by removing the reference to it by assigning null. 
After that, it will be automatically deleted by the Garbage Collector. 
You should remove the references to it by assigning null or leaving the block where it was declared.
 */
