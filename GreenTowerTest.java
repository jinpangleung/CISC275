package cisc275_final;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreenTowerTest {

	@Test
	public void test() {
		GreenTower green = new GreenTower();
		
		
		//All true
		assertEquals("Pass", Color.BLUE, green.getColor());
		assertEquals("Pass", 10, green.getcooldownRemaining());
		assertEquals("Pass", 10, green.getRange());
		
		//All false
		assertEquals("Pass", Color.RED, green.getColor());
		assertEquals("Pass", 9, green.getcooldownRemaining());
		assertEquals("Pass", 9, green.getRange());
	}

}
