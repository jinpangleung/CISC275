package model;

public class GreenTower extends Tower{
	
	public GreenTower(){
		color = Color.GREEN;
		cooldownRemaining = 10;
		range = 1;
	}
	
	@Override
	public void ability(){
		System.out.println(color + " tower ability active");
	}
}
