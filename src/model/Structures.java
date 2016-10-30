package model;

import java.awt.Color;

public class Structures {
	
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
	public int towersRemaining(Color color){
		if(color == Color.BLUE){
			return numberOfBlueTowers;
		}
		else if(color == Color.GREEN){
			return numberOfGreenTowers;
		}
		else{
			return numberOfRedTowers;
		}
	}
	public void placeTower(Color color){ //-1 every time tower is placed
		if(color == Color.BLUE && this.towersRemaining(color) > 0){
			numberOfBlueTowers--;
		}
		else if(color == Color.GREEN && this.towersRemaining(color) > 0){
			numberOfGreenTowers--;
		}
		else if(color == Color.RED && this.towersRemaining(color) > 0){
			numberOfRedTowers--;
		}
	}
}
