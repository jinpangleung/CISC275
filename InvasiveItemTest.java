package cisc275_final;

import static org.junit.Assert.*;

import org.junit.Test;

public class InvasiveItemTest {

	@Test
	public void test() {
		InvasiveItem TestInvasiveItem = new InvasiveItem();
		
		//All true
		assertEquals("Pass", 1, TestInvasiveItem.getHealth());
		assertEquals("Pass", 1, TestInvasiveItem.getSpeed());
		assertEquals("Pass", false, TestInvasiveItem.getIsBad());
		assertEquals("Pass", Color.GREEN, TestInvasiveItem.getColor());
		
		//All false
		assertEquals("Pass", 2, TestInvasiveItem.getHealth());
		assertEquals("Pass", 0, TestInvasiveItem.getSpeed());
		assertEquals("Pass", true, TestInvasiveItem.getIsBad());
		assertEquals("Pass", Color.BLUE, TestInvasiveItem.getColor());
		
		
		
		TestInvasiveItem.click();
		//All true
		assertEquals("Pass", 0, TestInvasiveItem.getHealth());
		assertEquals("Pass", 1, TestInvasiveItem.getSpeed());
		assertEquals("Pass", false, TestInvasiveItem.getIsBad());
		assertEquals("Pass", Color.GREEN, TestInvasiveItem.getColor());
		
		//All false
		assertEquals("Pass", 1, TestInvasiveItem.getHealth());
		assertEquals("Pass", 0, TestInvasiveItem.getSpeed());
		assertEquals("Pass", true, TestInvasiveItem.getIsBad());
		assertEquals("Pass", Color.BLUE, TestInvasiveItem.getColor());		
		
	}
}
