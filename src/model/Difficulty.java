package model;

public class Difficulty {

	int spawnRate = 10;
	
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
	
	public void update(){
		
	}
}
