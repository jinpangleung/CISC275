package tests;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

import model.Color;
import model.Grid;
import model.GridItem;
import model.Oyster;
import model.TrailItem;

public class OysterTest {

	@Test
	public void test() {
		Oyster myOyster = new Oyster();
		Oyster myOyster2 = new Oyster();
		Collection<TrailItem> oyster = Grid.getTrailItems();
		Collection<GridItem> GridItems = Grid.getItems();
		oyster.add(myOyster);
		oyster.add(myOyster2);
		GridItems.add(myOyster);
		GridItems.add(myOyster2);
		
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
		
		assertEquals("Pass", myOyster2, oyster);
		assertEquals("Pass", myOyster2, GridItems);
		
		
	}

}
