package trailitems;

import java.util.Collection;

import model.Color;
import model.Grid;
import model.GridItem;
import model.Player;

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
		Player p = Grid.getPlayer();
		health--;
		if(isBad == true){//makes sure it is NOT bad to click on
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
			Collection<TrailItem> invasiveitem = Grid.getTrailItems();
			invasiveitem.remove(this);
			Collection<GridItem> items = Grid.getItems();
			items.remove(this);
		}
		else{
			System.out.println("The health (invasiveitem) should never be below 0");
		}
	}
	
}
