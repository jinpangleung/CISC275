package tests;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

import model.GridColor;
import model.Grid;
import model.GridItem;
import trailitems.Oyster;
import trailitems.TrailItem;

public class OysterTest {

	@Test
	public void test() {
		Oyster myOyster = new Oyster();
		Oyster myOyster2 = new Oyster();
		Collection<TrailItem> oyster = Grid.getInstance().getTrailItems();
		Collection<GridItem> GridItems = Grid.getInstance().getItems();
		oyster.add(myOyster);
		oyster.add(myOyster2);
		GridItems.add(myOyster);
		GridItems.add(myOyster2);
		
		// / / / ALL TRUE / / / //
		assertEquals("Pass",1, myOyster.getHealth());
		assertEquals("Pass",GridColor.BLUE, myOyster.getColor());
		assertEquals("Pass",1, myOyster.getSpeed());
		assertEquals("Pass",false, myOyster.getIsBad());
		
		// / / / ALL FALSE / / / //
		assertEquals("Pass",0, myOyster.getHealth());
		assertEquals("Pass",GridColor.GREEN, myOyster.getColor());
		assertEquals("Pass",0, myOyster.getSpeed());
		assertEquals("Pass",true, myOyster.getIsBad());
		
		myOyster.click();
		
		//All true
		assertEquals("Pass", myOyster2, oyster);
		assertEquals("Pass", myOyster2, GridItems);
		assertEquals("Pass", 0, myOyster.getHealth());
		
		//All false
		assertEquals("Pass", 1, myOyster.getHealth());
		
	}

}
