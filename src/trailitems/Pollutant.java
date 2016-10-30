package trailitems;

import java.util.Collection;

import model.*;

public class Pollutant extends TrailItem {
	
	public Pollutant(int health){
		health = this.health;
		speed = 1;
		isBad = false;
		color = Color.RED;
	}
	
	@Override
	public void click(){//checking if in radius should be done by tower
		Player p = Grid.getPlayer();
		health--;
		if(isBad == true){//makes sure it is NOT bad to click on
			p.setEstuaryHealth(p.getEstuaryHealth() - 5);
			System.out.println("isBad should be set to False, check out pollutant class");
		}
		else{
			p.setEstuaryHealth(p.getEstuaryHealth() + 5);//very good to destroy pullutant
		}
		if (health > 0){//health can be upto 3
			//do nothing
			System.out.println("Health of pollutant = " + health);
		}
		else if (health == 0){//gaurantees health is 0
			Collection<TrailItem> pollutant = Grid.getTrailItems();
			pollutant.remove(this);
			Collection<GridItem> items = Grid.getItems();
			items.remove(this);
		}
		else{
			System.out.println("The health (pollutant) should never be below 0");
		}
	}
}
