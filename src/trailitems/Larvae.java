package trailitems;

import java.util.Collection;

import drawing.Animation;
import drawing.Offset;
import model.*;

public class Larvae extends TrailItem {
	//// Constructor ////
	public Larvae(){
		health = 1;
		speed = 1;
		gridColor = GridColor.WHITE;
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