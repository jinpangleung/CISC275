package towers;

import drawing.Animation;
import drawing.Offset;
import model.GridColor;

public class BlueTower extends Tower{
	
	public BlueTower(){
		gridColor = GridColor.BLUE;
		cooldownRemaining = 10;
		range = 10;
		animation = new Animation("oyster_tower", Offset.CENTER, Offset.CENTER);
	}
	
	@Override
	public void ability(){
		// TODO
	}
}
