package cisc275_final;

import static org.junit.Assert.*;

import org.junit.Test;

public class RedTowerTest {

	@Test
	public void test() {
		RedTower red = new RedTower();
		//All tests should pass
		assertEquals("Pass",Color.RED, red.getColor());
		assertEquals("Pass",10, red.getCooldown());
		assertEquals("Pass",10, red.getRange());
		
		//All tests shouldn't pass
		assertEquals("Pass",Color.BLUE, red.getColor());
		assertEquals("Pass",9, red.getCooldown());
		assertEquals("Pass",9, red.getRange());
	}

}
