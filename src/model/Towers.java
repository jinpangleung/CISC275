package model;

import java.awt.Color;

public class Towers {
	
	//// Attributes ////
	private int numberOfGreenTowers; //remaining
	private int numberOfRedTowers; //remaining
	private int numberOfBlueTowers; //remaining
	
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
	public void placeTower(Color color){ //-1 every time tower is placed
		// TODO
	}
	

}
