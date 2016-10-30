package model;

public class RedTower extends Tower {

	public RedTower(){
		color = Color.RED;
		cooldownRemaining = 10;
		range = 1;
	}
	
	@Override
	public void ability(){
		System.out.println(color + " tower ability active");
	}
}
