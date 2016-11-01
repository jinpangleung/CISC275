package model;

import java.awt.Color;
import java.awt.Graphics;

import towers.RedTower;
import towers.Tower;

public class RedTowerFactory extends TowerFactory{

	public RedTowerFactory(Posn topLeft, Posn bottomRight){
		super(topLeft, bottomRight);
	}
	
	@Override
	public Tower spawnTower(){
		return new RedTower();
	}
	
	@Override
	public void draw(Graphics g){
		
		g.setColor(Color.red);
		g.fillRect(topLeftCorner.getX(), topLeftCorner.getY(), bottomRightCorner.getX() - topLeftCorner.getX(),
				bottomRightCorner.getY() - topLeftCorner.getY());
	}
	
}
