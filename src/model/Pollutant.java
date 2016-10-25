package model;

public class Pollutant extends TrailItem {
	
	public Pollutant(int health){
		health = this.health;
		speed = 1;
		isBad = false;
		color = Color.RED;
	}
	
	@Override
	public void click(){
		// TODO
	}
}
