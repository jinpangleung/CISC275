package towers;

import drawing.Animation;
import drawing.Offset;
import model.GridColor;

public class RedTower extends Tower {

	public RedTower(){
		gridColor = GridColor.RED;
		cooldownRemaining = 10;
		range = 10;
		animation = new Animation("pollutant_tower", Offset.CENTER, Offset.CENTER);
	}
	
	@Override
	public void ability(){
		//TODO
	}
}
