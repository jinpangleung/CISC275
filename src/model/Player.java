package model;

public class Player {
	private int estuaryHealth;
	private double gameTime;
	private int OysterCount = 0;
	private int GabionCount = 0;
	
	
	public void increaseOysterCount(){
		OysterCount++;
		if (OysterCount == 6){
			OysterCount = 0;
			GabionCount++;
			//make a osyter gabion, however we are going to implement that
		}
	}
	public int getGabionCount(){
		return GabionCount;
	}
	
	public int getOysterCount(){
		return OysterCount;
	}
	
	public int getEstuaryHealth() {
		return estuaryHealth;
	}

	public void setEstuaryHealth(int estuaryHealth) {
		this.estuaryHealth = estuaryHealth;
	}

	public double getGameTime() {
		return gameTime;
	}

	public void setGameTime(double gameTime) {
		this.gameTime = gameTime;
	}

	public void update(double elapsedTickTime) {
		gameTime = gameTime - elapsedTickTime;
	}

}
