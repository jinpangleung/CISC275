package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.OysterGabion;

public class OysterGabionTest {

	@Test
	public void test() {
		OysterGabion og = new OysterGabion();
		
		//Pass
		assertEquals("Pass", 3, og.getHealth());
		
		//Fail
		assertEquals("Pass", 1, og.getHealth());	
	}

}
