package cisc275_final;

import static org.junit.Assert.*;

import org.junit.Test;

public class LarvaeTest {

	@Test
	public void test() {
		Larvae myLarvae = new Larvae();
		// / / / ALL TRUE / / / //
		assertEquals("Pass",1, myLarvae.getHealth());
		assertEquals("Pass",Color.WHITE, myLarvae.getColor());
		assertEquals("Pass",1, myLarvae.getSpeed());
		assertEquals("Pass",true, myLarvae.getIsBad());
		
		// / / / ALL FALSE / / / //
		assertEquals("Pass",0, myLarvae.getHealth());
		assertEquals("Pass",Color.BLUE, myLarvae.getColor());
		assertEquals("Pass",0, myLarvae.getSpeed());
		assertEquals("Pass",false, myLarvae.getIsBad());
		
		myLarvae.click();
		assertEquals("Pass",1, myLarvae.getHealth()); //should fail
		assertEquals("Pass",0, myLarvae.getHealth()); //should pass
		assertEquals("Pass",Color.BLUE, myLarvae.getColor());
		assertEquals("Pass",1, myLarvae.getSpeed());
		assertEquals("Pass",true, myLarvae.getIsBad());
	}

}
