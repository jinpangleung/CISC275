package tests;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

import model.Towers;

public class TowersTest {

	@Test
	public void testGetNumberOfGreenTowers() {
		Towers towers = new Towers();
		towers.setNumberOfGreenTowers(2);
		assertEquals("Pass", 2, towers.getNumberOfGreenTowers());
	}

	@Test
	public void testGetNumberOfRedTowers() {
		Towers towers = new Towers();
		towers.setNumberOfRedTowers(2);
		assertEquals("Pass", 2, towers.getNumberOfRedTowers());
	}

	@Test
	public void testGetNumberOfBlueTowers() {
		Towers towers = new Towers();
		towers.setNumberOfBlueTowers(2);
		assertEquals("Pass", 2, towers.getNumberOfBlueTowers());
	}

	@Test
	public void testTowersRemaining() {
		Towers towers = new Towers();
		towers.setNumberOfBlueTowers(2);
		towers.setNumberOfGreenTowers(2);
		towers.setNumberOfRedTowers(2);
		assertEquals("Pass", 2, towers.towersRemaining(Color.BLUE));
		assertEquals("Pass", 2, towers.towersRemaining(Color.GREEN));
		assertEquals("Pass", 2, towers.towersRemaining(Color.RED));
	}

	@Test
	public void testPlaceTower() {
		Towers towers = new Towers();
		towers.setNumberOfBlueTowers(2);
		towers.setNumberOfGreenTowers(2);
		towers.setNumberOfRedTowers(2);
		towers.placeTower(Color.BLUE);
		towers.placeTower(Color.GREEN);
		towers.placeTower(Color.RED);
		assertEquals("Pass", 1, towers.towersRemaining(Color.BLUE));
		assertEquals("Pass", 1, towers.towersRemaining(Color.GREEN));
		assertEquals("Pass", 1, towers.towersRemaining(Color.RED));
	}

}
