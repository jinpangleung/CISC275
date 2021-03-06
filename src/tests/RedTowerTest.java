package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.GridColor;
import towers.RedTower;

public class RedTowerTest {

	@Test
	public void test() {
		RedTower red = new RedTower();
		//All tests should pass
		assertEquals("Pass",GridColor.RED, red.getColor());
		assertEquals("Pass",10, red.getCooldownRemaining());
		assertEquals("Pass",10, red.getRange());
		
		//All tests shouldn't pass
		assertEquals("Pass",GridColor.BLUE, red.getColor());
		assertEquals("Pass",9, red.getCooldownRemaining());
		assertEquals("Pass",9, red.getRange());
	}

}
