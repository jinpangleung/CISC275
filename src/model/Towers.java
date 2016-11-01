package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collection;

import towers.Tower;

public class Towers extends GridComponent {
	
	//// Attributes ////
	private int numberOfGreenTowers; //remaining
	private int numberOfRedTowers; //remaining
	private int numberOfBlueTowers; //remaining
	private Collection<TowerFactory> factories;
	private final double percent = 0.2;
	
	//// Getters ////
	public int getNumberOfGreenTowers() {
		return numberOfGreenTowers;
	}
	public int getNumberOfRedTowers() {
		return numberOfRedTowers;
	}
	public int getNumberOfBlueTowers() {
		return numberOfBlueTowers;
	}
	
	public void setNumberOfGreenTowers(int numberOfGreenTowers) {
		this.numberOfGreenTowers = numberOfGreenTowers;
	}
	public void setNumberOfRedTowers(int numberOfRedTowers) {
		this.numberOfRedTowers = numberOfRedTowers;
	}
	public void setNumberOfBlueTowers(int numberOfBlueTowers) {
		this.numberOfBlueTowers = numberOfBlueTowers;
	}
	
	//// Methods ////
	public boolean towersRemaining(Color color){
		return false;
		// TODO
	}
	
	public Towers(int screenWidth, int screenHeight, PixelGrid pg){
		double absoluteSize = (double) screenHeight * percent;
		int percentSize = (int) absoluteSize;
		topLeftCorner = new Posn(pg.getBottomRightCorner().getX() + percentSize,
								pg.getTopLeftCorner().getY());
		percentSize *= 2;
		bottomRightCorner = new Posn(pg.getBottomRightCorner().getX() + percentSize + percentSize,
									pg.getBottomRightCorner().getY());
		numberOfGreenTowers = 2;
		numberOfBlueTowers = 2;
		numberOfRedTowers = 2;
		
		factories = new ArrayList<TowerFactory>();
		TowerFactory redFactory = new RedTowerFactory(new Posn(800, 400), new Posn(850, 450));
		TowerFactory blueFactory = new BlueTowerFactory(new Posn(800, 500), new Posn(850, 550));
		TowerFactory greenFactory = new GreenTowerFactory(new Posn(800, 600), new Posn(850, 650));
		factories.add(redFactory);
		factories.add(blueFactory);
		factories.add(greenFactory);
		
	}
	
	public void draw(Graphics g){
		g.setColor(Color.gray);
		g.fillRect(topLeftCorner.getX(), topLeftCorner.getY(), bottomRightCorner.getX() - topLeftCorner.getX(),
				bottomRightCorner.getY() - topLeftCorner.getY());
		for(TowerFactory tf : factories){
			tf.draw(g);
		}
	}
	
	public void click(int mouseX, int mouseY){
		for(TowerFactory tf : factories){
			if(tf.isWithin(mouseX, mouseY)){
				Grid.getInstance().getTouch().setHolding(tf.spawnTower());
				System.out.println("Setting");
				return;
			}
		}
	}
	
	public void placeTower(Tower t){
		t.setPosn(Grid.getInstance().getPixelGrid().getGridCellPosn(t.getPixelPosn()));
		Grid.getInstance().addTower(t);
	}
	

}
