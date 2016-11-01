package model;

import java.awt.*;

import towers.*;

public class GreenTowerFactory extends TowerFactory{

	public GreenTowerFactory(Posn topLeft, Posn bottomRight){
		super(topLeft, bottomRight);
	}
	
	@Override
	public Tower spawnTower(){
		return new GreenTower();
	}
	
	@Override
	public void draw(Graphics g){
		
		g.setColor(Color.green);
		g.fillRect(topLeftCorner.getX(), topLeftCorner.getY(), bottomRightCorner.getX() - topLeftCorner.getX(),
				bottomRightCorner.getY() - topLeftCorner.getY());
	}
	
}