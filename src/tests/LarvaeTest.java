package tests;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

import model.GridColor;
import model.Grid;
import model.GridItem;
import trailitems.Larvae;
import trailitems.Oyster;
import trailitems.TrailItem;

public class LarvaeTest {

	@Test
	public void test() {
		Larvae myLarvae = new Larvae();
		Larvae myLarvae2 = new Larvae();
		Collection<TrailItem> larvae = Grid.getInstance().getTrailItems();
		Collection<GridItem> GridItems = Grid.getInstance().getItems();
		larvae.add(myLarvae);
		larvae.add(myLarvae2);
		GridItems.add(myLarvae);
		GridItems.add(myLarvae2);
		
		// / / / ALL TRUE / / / //
		assertEquals("Pass",1, myLarvae.getHealth());
		assertEquals("Pass",GridColor.YELLOW, myLarvae.getColor());
		assertEquals("Pass",1, myLarvae.getSpeed());
		assertEquals("Pass",true, myLarvae.getIsBad());
		
		// / / / ALL FALSE / / / //
		assertEquals("Pass",0, myLarvae.getHealth());
		assertEquals("Pass",GridColor.BLUE, myLarvae.getColor());
		assertEquals("Pass",0, myLarvae.getSpeed());
		assertEquals("Pass",false, myLarvae.getIsBad());
		
		myLarvae.click();
		
		//All true
		assertEquals("Pass", myLarvae2, larvae);
		assertEquals("Pass", myLarvae2, GridItems);
		assertEquals("Pass", 0, myLarvae.getHealth());
		
		//All false
		assertEquals("Pass", 1, myLarvae.getHealth());
	}

}
