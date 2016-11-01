package tests;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import model.PixelGrid;
import model.Structures;
import towers.BlueTower;
import towers.GreenTower;
import towers.RedTower;

public class StructuresTest {
	
	PixelGrid pg = new PixelGrid(0, 0, 0);
	
	@Test
	public void testGetNumberOfGreenTowers() {
		Structures structures = new Structures(0, 0, pg);
		structures.setNumberOfGreenTowers(2);
		assertEquals("Pass", 2, structures.getNumberOfGreenTowers());
	}

	@Test
	public void testGetNumberOfRedTowers() {
		Structures structures = new Structures(0, 0, pg);
		structures.setNumberOfRedTowers(2);
		assertEquals("Pass", 2, structures.getNumberOfRedTowers());
	}

	@Test
	public void testGetNumberOfBlueTowers() {
		Structures structures = new Structures(0, 0, pg);
		structures.setNumberOfBlueTowers(2);
		assertEquals("Pass", 2, structures.getNumberOfBlueTowers());
	}

	@Test
	public void testTowersRemaining() {
		Structures structures = new Structures(0, 0, pg);
		structures.setNumberOfBlueTowers(2);
		structures.setNumberOfGreenTowers(2);
		structures.setNumberOfRedTowers(2);
		assertEquals("Pass", 2, structures.towersRemaining(Color.BLUE));
		assertEquals("Pass", 2, structures.towersRemaining(Color.GREEN));
		assertEquals("Pass", 2, structures.towersRemaining(Color.RED));
	}

	@Test
	public void testPlaceTower() {
		Structures structures = new Structures(0, 0, pg);
		structures.setNumberOfBlueTowers(2);
		structures.setNumberOfGreenTowers(2);
		structures.setNumberOfRedTowers(2);
		structures.placeTower(new BlueTower());
		structures.placeTower(new GreenTower());
		structures.placeTower(new RedTower());
		assertEquals("Pass", 1, structures.towersRemaining(Color.BLUE));
		assertEquals("Pass", 1, structures.towersRemaining(Color.GREEN));
		assertEquals("Pass", 1, structures.towersRemaining(Color.RED));
	}

}
