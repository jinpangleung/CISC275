package trailitems;

import java.util.Collection;
import drawing.*;
import model.*;

public class InvasiveItem extends TrailItem {
	
	public InvasiveItem(){
		health = 1;
		speed = 1;
		isBad = false;
		color = GridColor.GREEN;
		animation = new Animation("invasive_item", Offset.CENTER, Offset.CENTER);
	}
	
	//// Methods ////
	@Override
	public void click(){//checking if in radius should be done by tower
		Player p = Grid.getInstance().getPlayer();
		health--;
		if(isBad){//makes sure it is NOT bad to click on
			p.setEstuaryHealth(p.getEstuaryHealth() - 5);
			System.out.println("isBad should be set to False, check out InvasiveItem class");
		}
		else{
			p.setEstuaryHealth(p.getEstuaryHealth() + 5);//very good to destroy invasive items
		}
		if(health > 0){
			System.out.println("The health (invasiveitem) should not be above 1 after click");
		}
		else if(health == 0){//gaurantees its 0, removes item
			Collection<TrailItem> invasiveitem = Grid.getInstance().getTrailItems();
			invasiveitem.remove(this);
			Collection<GridItem> items = Grid.getInstance().getItems();
			items.remove(this);
		}
		else{
			System.out.println("The health (invasiveitem) should never be below 0");
		}
	}
	
}
