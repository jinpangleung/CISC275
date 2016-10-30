package model;

import java.awt.Graphics;
import java.util.Collection;
import java.util.Iterator;

public class Storm {
	protected boolean isStorming;
	protected int damage;

	public Storm(){
		isStorming = true;
		damage = 10;
	}
	
	public void dealDamage(){
		//TODO
		Collection<GridItem> allItems = Grid.getItems();
		Collection<Gabion> gabion = Grid.getGabions();
		Collection<Tower> tower = Grid.getTowers();
	 
		for(Iterator<Gabion> gLoop = gabion.iterator(); gLoop.hasNext();){
			Gabion gRandom = gLoop.next();
			if (damage - gRandom.getHealth() >= 0){
				allItems.remove(this);
				gabion.remove(this);
				damage = damage - gRandom.getHealth();
			}
			else if (damage - gRandom.getHealth() < 0){
				gRandom.setHealth(gRandom.getHealth() - damage);
				damage = 0;
			}
			else if (damage <= 0){
				break;
			}
		}
		if (damage > 0){
			for(Iterator<Tower> loop = tower.iterator(); loop.hasNext();){
				Tower random = loop.next();
				random.setCooldownRemaining(damage);
			}
		}
	}
	
	public boolean isStorming() {
		return isStorming;
	}
	
	public void setStorming(boolean isStorming) {
		this.isStorming = isStorming;
	}
	
	static public void draw(Graphics g){
		// TODO
	}
}
