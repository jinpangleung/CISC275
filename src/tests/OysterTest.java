package tests;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

import model.Color;
import model.Grid;
import model.GridItem;
import model.Oyster;
import model.Player;
import model.TrailItem;

public class OysterTest {

	@Test
	public void test() {
		Player p = Grid.getPlayer();
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
		
		assertEquals("Pass", 0, p.getOysterCount());
		
		// / / / ALL FALSE / / / //
		assertEquals("Pass",0, myOyster.getHealth());
		assertEquals("Pass",Color.GREEN, myOyster.getColor());
		assertEquals("Pass",0, myOyster.getSpeed());
		assertEquals("Pass",true, myOyster.getIsBad());
		
		assertEquals("Pass", 1, p.getOysterCount());
		
		myOyster.click();
		
		//All true
		assertEquals("Pass", myOyster2, oyster);
		assertEquals("Pass", myOyster2, GridItems);
		assertEquals("Pass", 0, myOyster.getHealth());
		
		assertEquals("Pass", 1, p.getOysterCount());
		
		//All false
		assertEquals("Pass", 1, myOyster.getHealth());
		
		assertEquals("Pass", 0, p.getOysterCount());
		
		myOyster.click();
		myOyster.click();
		myOyster.click();
		myOyster.click();
		myOyster.click();
		
		//All true
		assertEquals("Pass", 0, p.getOysterCount());
		
		//All false
		assertEquals("Pass", 6, p.getOysterCount());
		assertEquals("Pass", 1, p.getOysterCount());
		assertEquals("Pass", 2, p.getOysterCount());
		assertEquals("Pass", 3, p.getOysterCount());
		assertEquals("Pass", 4, p.getOysterCount());
		assertEquals("Pass", 5, p.getOysterCount());
		
	}

}
