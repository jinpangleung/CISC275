package towers;

import drawing.Animation;
import drawing.Offset;
import model.GridColor;

/**
 * A BlueTower is a tower that can pick up oysters. 
 * 
 * @author leung
 * @version 1
 * @attributes GridColor - Color on the grid
 * @attributes cooldownRemaining - Cooldown for tower
 * @attributes range - range of tower
 * @throw
 * @return
 */

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
