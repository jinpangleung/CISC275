package towers;

import drawing.Animation;
import drawing.Offset;
import model.GridColor;


/**
 * A RedTower is a tower that can pick up pollution. 
 * 
 * @author leung
 * @version 1
 * @attributes GridColor - Color on the grid
 * @attributes cooldownRemaining - Cooldown for tower
 * @attributes range - range of tower
 * @throw
 * @return
 */

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
