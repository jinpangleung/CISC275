package tests;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

import model.GridColor;
import model.Grid;
import model.GridItem;
import trailitems.InvasiveItem;
import trailitems.Pollutant;
import trailitems.TrailItem;

public class InvasiveItemTest {

	@Test
	public void test() {
		InvasiveItem TestInvasiveItem = new InvasiveItem();
		InvasiveItem TestInvasiveItem2 = new InvasiveItem();
		Collection<TrailItem> invasive = Grid.getInstance().getTrailItems();
		Collection<GridItem> GridItems3 = Grid.getInstance().getItems();
		invasive.add(TestInvasiveItem);
		invasive.add(TestInvasiveItem2);
		GridItems3.add(TestInvasiveItem);
		GridItems3.add(TestInvasiveItem2);
		
		
		//All true
		assertEquals("Pass", 1, TestInvasiveItem.getHealth());
		assertEquals("Pass", 1, TestInvasiveItem.getSpeed());
		assertEquals("Pass", false, TestInvasiveItem.getIsBad());
		assertEquals("Pass", GridColor.GREEN, TestInvasiveItem.getColor());
		
		//All false
		assertEquals("Pass", 2, TestInvasiveItem.getHealth());
		assertEquals("Pass", 0, TestInvasiveItem.getSpeed());
		assertEquals("Pass", true, TestInvasiveItem.getIsBad());
		assertEquals("Pass", GridColor.BLUE, TestInvasiveItem.getColor());
		
		
		
		TestInvasiveItem.click();
		
		//All true
		assertEquals("Pass", TestInvasiveItem2, invasive);
		assertEquals("Pass", TestInvasiveItem2, GridItems3);		
		assertEquals("Pass", 0, TestInvasiveItem.getHealth());
		
		//All false
		assertEquals("Pass", 1, TestInvasiveItem.getHealth());	
		
	}
}
