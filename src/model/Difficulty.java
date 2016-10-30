package model;

import trailitems.*;

public class Difficulty {
	
	/**
	 * Returns void
	 * <p>
	 * Look at the current Grid and decide how to scale difficulty and when to spawn new objects
	 */
	public void update(){
		// TODO
	}
	
	/**
	 * Returns void
	 * <p>
	 * Use the difficulty and what has been spawned recently to decide
	 * what needs to be spawned, avoid unwinnable scenarios
	 */
	public TrailItem spawn(){
		int randomNum = (int)(Math.random() * 3); 
		if(randomNum == 0){
			return new Oyster();
		}
		else if (randomNum == 1){
			return new InvasiveItem();
		}
		else if (randomNum == 2){
			return new Larvae();
		}
		else{
			return new Pollutant(1);
		}
	}

}
