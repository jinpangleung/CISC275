package tests;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

import model.Color;
import model.Grid;
import model.GridItem;
import trailitems.Oyster;
import trailitems.Pollutant;
import trailitems.TrailItem;

public class PollutantTest {

	@Test
	public void test() {
		Pollutant TestPollutant = new Pollutant(3);
		Pollutant TestPollutant2 = new Pollutant(3);
		Collection<TrailItem> pollutant = Grid.getTrailItems();
		Collection<GridItem> GridItems2 = Grid.getItems();
		pollutant.add(TestPollutant);
		pollutant.add(TestPollutant2);
		GridItems2.add(TestPollutant);
		GridItems2.add(TestPollutant2);
		
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
		assertEquals("Pass", TestPollutant2, pollutant);
		assertEquals("Pass", TestPollutant2, GridItems2);
		
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
		
		TestPollutant.click();
		TestPollutant.click();
		assertEquals("Pass", TestPollutant2, pollutant);
		assertEquals("Pass", TestPollutant2, GridItems2);
		
		
		
	}

}
