package towers;

import model.GridColor;

public class BlueTower extends Tower{
	
	public BlueTower(){
		color = GridColor.BLUE;
		cooldownRemaining = 10;
		range = 1;
	}
	
	@Override
	public void ability(){
		System.out.println(color + " tower ability active");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
