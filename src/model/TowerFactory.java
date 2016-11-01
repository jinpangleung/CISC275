package model;

import java.awt.Graphics;

import towers.Tower;

public abstract class TowerFactory extends GridComponent {
	
	public TowerFactory(Posn topLeft, Posn bottomRight){
		topLeftCorner = topLeft;
		bottomRightCorner = bottomRight;
	}
	
	public Tower spawnTower(){
		return null;
	}
	
	public void draw(Graphics g){
		// nothing
	}

}
