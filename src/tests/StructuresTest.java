package tests;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import model.Structures;

public class StructuresTest {

	@Test
	public void testGetNumberOfGreenTowers() {
		Structures structures = new Structures();
		structures.setNumberOfGreenTowers(2);
		assertEquals("Pass", 2, structures.getNumberOfGreenTowers());
	}

	@Test
	public void testGetNumberOfRedTowers() {
		Structures structures = new Structures();
		structures.setNumberOfRedTowers(2);
		assertEquals("Pass", 2, structures.getNumberOfRedTowers());
	}

	@Test
	public void testGetNumberOfBlueTowers() {
		Structures structures = new Structures();
		structures.setNumberOfBlueTowers(2);
		assertEquals("Pass", 2, structures.getNumberOfBlueTowers());
	}

	@Test
	public void testTowersRemaining() {
		Structures structures = new Structures();
		structures.setNumberOfBlueTowers(2);
		structures.setNumberOfGreenTowers(2);
		structures.setNumberOfRedTowers(2);
		assertEquals("Pass", 2, structures.towersRemaining(Color.BLUE));
		assertEquals("Pass", 2, structures.towersRemaining(Color.GREEN));
		assertEquals("Pass", 2, structures.towersRemaining(Color.RED));
	}

	@Test
	public void testPlaceTower() {
		Structures structures = new Structures();
		structures.setNumberOfBlueTowers(2);
		structures.setNumberOfGreenTowers(2);
		structures.setNumberOfRedTowers(2);
		structures.placeTower(Color.BLUE);
		structures.placeTower(Color.GREEN);
		structures.placeTower(Color.RED);
		assertEquals("Pass", 1, structures.towersRemaining(Color.BLUE));
		assertEquals("Pass", 1, structures.towersRemaining(Color.GREEN));
		assertEquals("Pass", 1, structures.towersRemaining(Color.RED));
	}

}
