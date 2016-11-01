package towers;

import model.GridColor;

public class RedTower extends Tower {

	public RedTower(){
		color = GridColor.RED;
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
