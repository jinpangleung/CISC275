package cisc275_final;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlueTowerTest {

	@Test
	public void test() {
		BlueTower blue = new BlueTower();
		
		
		//All true
		assertEquals("Pass", Color.BLUE, blue.getColor());
		assertEquals("Pass", 10, blue.getcooldownRemaining());
		assertEquals("Pass", 10, blue.getRange());
		
		//All false
		assertEquals("Pass", Color.RED, blue.getColor());
		assertEquals("Pass", 9, blue.getcooldownRemaining());
		assertEquals("Pass", 9, blue.getRange());
		}

}
