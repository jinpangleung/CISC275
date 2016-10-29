package model;

public class BlueTower extends Tower{
	
	public BlueTower(){
		color = Color.BLUE;
		cooldownRemaining = 10;
		range = 1;
	}
	
	@Override
	public void ability(){
		System.out.println(color + " tower ability active");
	}
}
