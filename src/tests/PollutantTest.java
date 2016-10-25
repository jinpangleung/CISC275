package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Color;
import model.Pollutant;

public class PollutantTest {

	@Test
	public void test() {
		Pollutant TestPollutant = new Pollutant(3);
		
		//All true
		assertEquals("Pass", 3, TestPollutant.getHealth());
		assertEquals("Pass", 1, TestPollutant.getSpeed());
		assertEquals("Pass", false, TestPollutant.getIsBad());
		assertEquals("Pass", Color.RED, TestPollutant.getColor());
		
		//All false
		assertEquals("Pass", 2, TestPollutant.getHealth());
		assertEquals("Pass", 0, TestPollutant.getSpeed());
		assertEquals("Pass", true, TestPollutant.getIsBad());
		assertEquals("Pass", Color.BLUE, TestPollutant.getColor());
		
		
		
		TestPollutant.click();
		//All true
		assertEquals("Pass", 2, TestPollutant.getHealth());
		assertEquals("Pass", 1, TestPollutant.getSpeed());
		assertEquals("Pass", false, TestPollutant.getIsBad());
		assertEquals("Pass", Color.RED, TestPollutant.getColor());
		
		//All false
		assertEquals("Pass", 3, TestPollutant.getHealth());
		assertEquals("Pass", 0, TestPollutant.getSpeed());
		assertEquals("Pass", true, TestPollutant.getIsBad());
		assertEquals("Pass", Color.BLUE, TestPollutant.getColor());		
		
	}

}
