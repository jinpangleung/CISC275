package model;

public class Player {
	private int estuaryHealth;
	private long startTime;
	private long gameTime;
	private int oysterCount;
	
	public Player(){
		estuaryHealth = 50; // ranging from 0 -> 100, start right in the middle
		oysterCount = 0;
		startTime = System.currentTimeMillis();
		gameTime = 0;
	}
	
	public long getStartTime(){
		return startTime;
	}
	
	public int getEstuaryHealth() {
		return estuaryHealth;
	}

	public void setEstuaryHealth(int estuaryHealth) {
		this.estuaryHealth = estuaryHealth;
	}

	public long getGameTime() {
		return gameTime;
	}

	public void setGameTime(long gameTime) {
		this.gameTime = gameTime;
	}
	
	public int getOysterCount(){
		return oysterCount;
	}

	public void update() {
		gameTime = System.currentTimeMillis() - startTime;
	}
	
	public void increaseOysterCount(){
		oysterCount++;
	}
	
	

}
