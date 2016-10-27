package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Grid;
import model.Direction;
import model.GridItem;
import model.InvasiveItem;
import model.Larvae;
import model.Oyster;
import model.Pollutant;
import model.GridCell;
import model.Posn;
import model.RedTower;
import model.Tower;
import model.TrailItem;

public class GridTest {

	@Test
	public void test() {
		Grid g = new Grid(80, 60);
		GridCell[][] p = new GridCell[3][3];
		p[0][0] = new GridCell(new Posn(0, 0), Direction.EAST, true);
		p[1][0] = new GridCell(new Posn(1, 0), Direction.EAST, true);
		p[2][0] = new GridCell(new Posn(2, 0), Direction.SOUTH, true);
		p[0][1] = new GridCell(new Posn(0, 1), Direction.WEST, true);
		p[1][1] = new GridCell(new Posn(1, 1), Direction.EAST, true);
		p[2][1] = new GridCell(new Posn(2, 1), Direction.SOUTH, true);
		p[0][2] = new GridCell(new Posn(0, 2), Direction.NORTH, true);
		p[1][2] = new GridCell(new Posn(1, 2), Direction.WEST, true);
		p[2][2] = new GridCell(new Posn(2, 2), Direction.WEST, true);
		// >>V
		// <.V
		// ^<<
		Grid.setCells(p);
		TrailItem o = new Oyster();
		o.setPosn(new Posn(0, 0));
		o.setPixelPosn(new Posn(15, 15));
		o.setSpeed(1);
		
		TrailItem ii = new InvasiveItem();
		ii.setPosn(new Posn(0, 0));
		ii.setPixelPosn(new Posn(15, 15));
		ii.setSpeed(1);
		
		TrailItem pol = new Pollutant(5);
		pol.setPosn(new Posn(0, 0));
		pol.setPixelPosn(new Posn(15, 15));
		pol.setSpeed(1);
		
		TrailItem larv = new Larvae();
		larv.setPosn(new Posn(0, 0));
		larv.setPixelPosn(new Posn(15, 15));
		larv.setSpeed(1);
		
		Tower tow = new RedTower();
		tow.setPosn(new Posn(1, 1));
		tow.setPixelPosn(new Posn(16, 16));
		tow.setCooldownRemaining(1);
		
		Grid.update();
		
		assertEquals("Oyster Update1", o.getPosn().getY(), 0);
		assertEquals("Oyster Update1", o.getPosn().getY(), 0);
		assertEquals("Oyster Update1", o.getPixelPosn().getX(), 16);
		assertEquals("Oyster Update1", o.getPixelPosn().getY(), 15);
		
		assertEquals("Pollutant Update1", pol.getPosn().getY(), 0);
		assertEquals("Pollutant Update1", pol.getPosn().getY(), 0);
		assertEquals("Pollutant Update1", pol.getPixelPosn().getX(), 16);
		assertEquals("Pollutant Update1", pol.getPixelPosn().getY(), 15);
		
		assertEquals("Invasive Update1", ii.getPosn().getY(), 0);
		assertEquals("Invasive Update1", ii.getPosn().getY(), 0);
		assertEquals("Invasive Update1", ii.getPixelPosn().getX(), 16);
		assertEquals("Invasive Update1", ii.getPixelPosn().getY(), 15);
		
		assertEquals("Larvae Update1", larv.getPosn().getY(), 0);
		assertEquals("Larvae Update1", larv.getPosn().getY(), 0);
		assertEquals("Larvae Update1", larv.getPixelPosn().getX(), 16);
		assertEquals("Larvae Update1", larv.getPixelPosn().getY(), 15);
		
		assertEquals("Tower Update1", tow.getPosn().getX(), 1);
		assertEquals("Tower Update1", tow.getPosn().getY(), 1);
		assertEquals("Tower Update1", tow.getPixelPosn().getX(), 16);
		assertEquals("Tower Update1", tow.getPixelPosn().getY(), 16);
		assertEquals("Tower Update1", tow.getCooldownRemaining(), 0);
	}

	@Test
	public void testClickHandler() {
		fail("Not yet implemented");
	}

}
