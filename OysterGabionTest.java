package cisc275_final;

import static org.junit.Assert.*;

import org.junit.Test;

public class OysterGabionTest {

	@Test
	public void test() {
		OysterGabion og = new OysterGabion();
		
		//Pass
		assertEquals("Pass", 0, og.getHealth());
		assertEquals("Pass", 0, og.getOysterCount());
		
		
		og.OysterClicked();
		
		//Fail
		assertEquals("Pass", 1, og.getHealth());
		assertEquals("Pass", 0, og.getOysterCount());
		
		og.OysterClicked();
		og.OysterClicked();
		og.OysterClicked();
		og.OysterClicked();
		
		//Fail
		assertEquals("Pass", 1, og.getHealth());
		assertEquals("Pass", 1, og.getOysterCount());
		
		og.OysterClicked();
		//Pass
		assertEquals("Pass", 1, og.getHealth());
		assertEquals("Pass", 0, og.getOysterCount());
		
		
	}

}
