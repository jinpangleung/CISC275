package towers;

import drawing.Animation;
import drawing.Offset;
import model.GridColor;

public class GreenTower extends Tower{
	
	public GreenTower(){
		gridColor = GridColor.GREEN;
		cooldownRemaining = 10;
		range = 10;
		animation = new Animation("invasive_item_tower", Offset.CENTER, Offset.CENTER);
	}
	
	@Override
	public void ability(){
		// TODO
	}
}
