package towers;

import drawing.Animation;
import drawing.Offset;
import model.GridColor;

/**
 * A GreenTower is a tower that can pick up Invasive Items. 
 * 
 * @author leung
 * @version 1
 * @attributes GridColor - Color on the grid
 * @attributes cooldownRemaining - Cooldown for tower
 * @attributes range - range of tower
 * @throw
 * @return
 */

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
