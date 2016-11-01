package model;

import java.awt.Color;
import java.awt.Graphics;

import towers.*;

public class BlueTowerFactory extends TowerFactory{

	public BlueTowerFactory(Posn topLeft, Posn bottomRight){
		super(topLeft, bottomRight);
	}
	
	@Override
	public Tower spawnTower(){
		return new BlueTower();
	}
	
	@Override
	public void draw(Graphics g){
		
		g.setColor(Color.blue);
		g.fillRect(topLeftCorner.getX(), topLeftCorner.getY(), bottomRightCorner.getX() - topLeftCorner.getX(),
				bottomRightCorner.getY() - topLeftCorner.getY());
	}
	
}