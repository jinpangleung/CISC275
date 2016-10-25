package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Color;
import model.Oyster;

public class OysterTest {

	@Test
	public void test() {
		Oyster myOyster = new Oyster();
		// / / / ALL TRUE / / / //
		assertEquals("Pass",1, myOyster.getHealth());
		assertEquals("Pass",Color.BLUE, myOyster.getColor());
		assertEquals("Pass",1, myOyster.getSpeed());
		assertEquals("Pass",false, myOyster.getIsBad());
		
		// / / / ALL FALSE / / / //
		assertEquals("Pass",0, myOyster.getHealth());
		assertEquals("Pass",Color.GREEN, myOyster.getColor());
		assertEquals("Pass",0, myOyster.getSpeed());
		assertEquals("Pass",true, myOyster.getIsBad());
		
		myOyster.click();
		assertEquals("Pass",1, myOyster.getHealth()); //should fail
		assertEquals("Pass",0, myOyster.getHealth()); //should pass
		assertEquals("Pass",Color.BLUE, myOyster.getColor());
		assertEquals("Pass",1, myOyster.getSpeed());
		assertEquals("Pass",false, myOyster.getIsBad());
		
	}

}
