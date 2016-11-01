package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.GridColor;
import towers.GreenTower;

public class GreenTowerTest {

	@Test
	public void test() {
		GreenTower green = new GreenTower();
		
		
		//All true
		assertEquals("Pass", GridColor.GREEN, green.getColor());
		assertEquals("Pass", 10, green.getCooldownRemaining());
		assertEquals("Pass", 10, green.getRange());
		
		//All false
		assertEquals("Pass", GridColor.RED, green.getColor());
		assertEquals("Pass", 9, green.getCooldownRemaining());
		assertEquals("Pass", 9, green.getRange());
	}

}
