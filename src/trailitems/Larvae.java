package trailitems;

import java.util.Collection;

import drawing.Animation;
import drawing.Offset;
import model.*;

/**
 * 
 * Larvae are stuff that can be picked up anywhere, but you aren't supposed to pick any of them up,
 * since it is suppose to be in the estuary
 * 
 * @author Roy Cheng
 * @version 1
 * @attributes health - health of the trailitems
 * @attributes speed - how fast they travel in the river
 * @attributes isBad - if it is bad to click on it
 * 
 */

public class Larvae extends TrailItem {
	//// Constructor ////
	public Larvae(){
		health = 1;
		speed = 1;
		color = GridColor.YELLOW;
		isBad = true; //dont click on the larvae!!!
		animation = new Animation("larvae", Offset.CENTER, Offset.CENTER);
	}
	
	//// Methods ////
	@Override
	public void click(){//checking if in radius should be done by tower
		Player p = Grid.getInstance().getPlayer();
		
		health--;
		if(isBad == true){//makes sure it is bad to click on
			p.setEstuaryHealth(p.getEstuaryHealth() - 5);
		}else{
			p.setEstuaryHealth(p.getEstuaryHealth() + 5);
		}
		if(health > 0){
			System.out.println("The health (larvae) should not be above 1 after click");
		}
		else if(health == 0){//gaurantees its 0, removes item
			Collection<TrailItem> larvae = Grid.getInstance().getTrailItems();
			larvae.remove(this);
			Collection<GridItem> items = Grid.getInstance().getItems();
			items.remove(this);
		}
		else{
			System.out.println("The health (larvae) should never be below 0");
		}
	}
	
}
