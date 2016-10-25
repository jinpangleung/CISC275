package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.BlueTower;
import model.Color;

public class BlueTowerTest {

	@Test
	public void test() {
		BlueTower blue = new BlueTower();
		
		
		//All true
		assertEquals("Pass", Color.BLUE, blue.getColor());
		assertEquals("Pass", 10, blue.getcooldownRemaining());
		assertEquals("Pass", 10, blue.getRange());
		
		//All false
		assertEquals("Pass", Color.RED, blue.getColor());
		assertEquals("Pass", 9, blue.getcooldownRemaining());
		assertEquals("Pass", 9, blue.getRange());
		}
	
	
		//GridItem test and posn test
		Posn PosnTest = new Posn(1, 1);
		
		
		//All true
		assertEquals("Pass", 1, PosnTest.getX());
		assertEquals("Pass", 1, PosnTest.getY());
		
		PosnTest.addX(1);
		PosnTest.addY(1);		
		
		assertEquals("Pass", 2, PosnTest.getX());
		assertEquals("Pass", 2, PosnTest.getY());
		
		PosnTest.setX(1);
		PosnTest.setY(1);
		
		assertEquals("Pass", 1, PosnTest.getX());
		assertEquals("Pass", 1, PosnTest.getY());
		
		
		Posn testing11 = new Posn(1, 1);
		BlueTower fml = new BlueTower();
		fml.setPosn(testing11);
		
		
		assertEquals("Pass", PosnTest, fml.getPosn());

}
