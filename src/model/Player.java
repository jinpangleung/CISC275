package model;

import gabions.*;

import java.util.Collection;

public class Player {
	private int estuaryHealth;
	private double gameTime;
	private int OysterCount = 0;
	
	
	public void increaseOysterCount(){
		OysterCount++;
		Collection<GridItem> allItems = Grid.getItems();
		Collection<Gabion> gabion = Grid.getGabions();
		if (OysterCount == 4){
			allItems.add(new OysterGabion());
			gabion.add(new OysterGabion());
			OysterCount = 0;
			//dont need gabion count, will be added in collections
		}
	}
	
	public int getOysterCount(){
		return OysterCount;
	}
	
	public int getEstuaryHealth() {
		return estuaryHealth;
	}

	public void setEstuaryHealth(int estuaryHealth) {
		this.estuaryHealth = estuaryHealth;
	}

	public double getGameTime() {
		return gameTime;
	}

	public void setGameTime(double gameTime) {
		this.gameTime = gameTime;
	}

	public void update(double elapsedTickTime) {
		gameTime = gameTime - elapsedTickTime;
		//needs to update oystercount and number of each tower and keep updating as we use for our inventory
	}

}
