package model;

public class Player {
	private int estuaryHealth;
	private double gameTime;
	
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
