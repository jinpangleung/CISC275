package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.*;
import gabions.*;
import towers.*;
import trailitems.*;

class GridTest {

	@Test
	public void test() {
		Grid g = new Grid(80, 60);
		GridCell[][] p = new GridCell[3][3];
		p[0][0] = new GridCell(new Posn(0, 0), Direction.EAST, true);
		p[1][0] = new GridCell(new Posn(1, 0), Direction.EAST, true);
		p[2][0] = new GridCell(new Posn(2, 0), Direction.SOUTH, true);
		p[0][1] = new GridCell(new Posn(0, 1), Direction.WEST, true);
		p[1][1] = new GridCell(new Posn(1, 1), Direction.EAST, false);
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
		
		TrailItem pol = new Pollutant(1);
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
		
		assertEquals("Oyster Update1", o.getPosn().getX(), 0);
		assertEquals("Oyster Update1", o.getPosn().getY(), 0);
		assertEquals("Oyster Update1", o.getPixelPosn().getX(), 16);
		assertEquals("Oyster Update1", o.getPixelPosn().getY(), 15);
		
		assertEquals("Pollutant Update1", pol.getPosn().getX(), 0);
		assertEquals("Pollutant Update1", pol.getPosn().getY(), 0);
		assertEquals("Pollutant Update1", pol.getPixelPosn().getX(), 16);
		assertEquals("Pollutant Update1", pol.getPixelPosn().getY(), 15);
		
		assertEquals("Invasive Update1", ii.getPosn().getX(), 0);
		assertEquals("Invasive Update1", ii.getPosn().getY(), 0);
		assertEquals("Invasive Update1", ii.getPixelPosn().getX(), 16);
		assertEquals("Invasive Update1", ii.getPixelPosn().getY(), 15);
		
		assertEquals("Larvae Update1", larv.getPosn().getX(), 0);
		assertEquals("Larvae Update1", larv.getPosn().getY(), 0);
		assertEquals("Larvae Update1", larv.getPixelPosn().getX(), 16);
		assertEquals("Larvae Update1", larv.getPixelPosn().getY(), 15);
		
		assertEquals("Tower Update1", tow.getPosn().getX(), 1);
		assertEquals("Tower Update1", tow.getPosn().getY(), 1);
		assertEquals("Tower Update1", tow.getPixelPosn().getX(), 16);
		assertEquals("Tower Update1", tow.getPixelPosn().getY(), 16);
		assertEquals("Tower Update1", tow.getCooldownRemaining(), 0);
		
		for(int i = 0; i < 15; i++){ // 15 more updates, all should move over one
			Grid.update();
		}
		
		assertEquals("Oyster Update16", o.getPosn().getX(), 1);
		assertEquals("Oyster Update16", o.getPosn().getY(), 0);
		assertEquals("Oyster Update16", o.getPixelPosn().getX(), 31);
		assertEquals("Oyster Update16", o.getPixelPosn().getY(), 15);
		
		assertEquals("Pollutant Update16", pol.getPosn().getX(), 1);
		assertEquals("Pollutant Update16", pol.getPosn().getY(), 0);
		assertEquals("Pollutant Update16", pol.getPixelPosn().getX(), 31);
		assertEquals("Pollutant Update16", pol.getPixelPosn().getY(), 15);
		
		assertEquals("Invasive Update16", ii.getPosn().getX(), 1);
		assertEquals("Invasive Update16", ii.getPosn().getY(), 0);
		assertEquals("Invasive Update16", ii.getPixelPosn().getX(), 31);
		assertEquals("Invasive Update16", ii.getPixelPosn().getY(), 15);
		
		assertEquals("Larvae Update16", larv.getPosn().getX(), 1);
		assertEquals("Larvae Update16", larv.getPosn().getY(), 0);
		assertEquals("Larvae Update16", larv.getPixelPosn().getX(), 31);
		assertEquals("Larvae Update16", larv.getPixelPosn().getY(), 15);
		
		assertEquals("Tower Update16", tow.getPosn().getX(), 1);
		assertEquals("Tower Update16", tow.getPosn().getY(), 1);
		assertEquals("Tower Update16", tow.getPixelPosn().getX(), 16);
		assertEquals("Tower Update16", tow.getPixelPosn().getY(), 16);
		assertEquals("Tower Update16", tow.getCooldownRemaining(), 15);
		
		Grid.update();
		
		assertEquals("Oyster Update17", o.getPosn().getX(), 1);
		assertEquals("Oyster Update17", o.getPosn().getY(), 0);
		assertEquals("Oyster Update17", o.getPixelPosn().getX(), 32);
		assertEquals("Oyster Update17", o.getPixelPosn().getY(), 15);
		
		assertEquals("Pollutant Update17", pol.getPosn().getX(), 1);
		assertEquals("Pollutant Update17", pol.getPosn().getY(), 0);
		assertEquals("Pollutant Update17", pol.getPixelPosn().getX(), 32);
		assertEquals("Pollutant Update17", pol.getPixelPosn().getY(), 15);
		
		assertEquals("Invasive Update17", ii.getPosn().getX(), 1);
		assertEquals("Invasive Update17", ii.getPosn().getY(), 0);
		assertEquals("Invasive Update17", ii.getPixelPosn().getX(), 32);
		assertEquals("Invasive Update17", ii.getPixelPosn().getY(), 15);
		
		assertEquals("Larvae Update17", larv.getPosn().getX(), 1);
		assertEquals("Larvae Update17", larv.getPosn().getY(), 0);
		assertEquals("Larvae Update17", larv.getPixelPosn().getX(), 32);
		assertEquals("Larvae Update17", larv.getPixelPosn().getY(), 15);
		
		assertEquals("Tower Update17", tow.getPosn().getX(), 1);
		assertEquals("Tower Update17", tow.getPosn().getY(), 1);
		assertEquals("Tower Update17", tow.getPixelPosn().getX(), 16);
		assertEquals("Tower Update17", tow.getPixelPosn().getY(), 16);
		assertEquals("Tower Update17", tow.getCooldownRemaining(), 14);
		
		for(int i = 0; i < 15; i++){
			Grid.update();
		}
		
		assertEquals("Oyster Update32", o.getPosn().getX(), 2);
		assertEquals("Oyster Update32", o.getPosn().getY(), 0);
		assertEquals("Oyster Update32", o.getPixelPosn().getX(), 47);
		assertEquals("Oyster Update32", o.getPixelPosn().getY(), 15);
		
		assertEquals("Pollutant Update32", pol.getPosn().getX(), 2);
		assertEquals("Pollutant Update32", pol.getPosn().getY(), 0);
		assertEquals("Pollutant Update32", pol.getPixelPosn().getX(), 47);
		assertEquals("Pollutant Update32", pol.getPixelPosn().getY(), 15);
		
		assertEquals("Invasive Update32", ii.getPosn().getX(), 2);
		assertEquals("Invasive Update32", ii.getPosn().getY(), 0);
		assertEquals("Invasive Update32", ii.getPixelPosn().getX(), 47);
		assertEquals("Invasive Update32", ii.getPixelPosn().getY(), 15);
		
		assertEquals("Larvae Update32", larv.getPosn().getX(), 2);
		assertEquals("Larvae Update32", larv.getPosn().getY(), 0);
		assertEquals("Larvae Update32", larv.getPixelPosn().getX(), 47);
		assertEquals("Larvae Update32", larv.getPixelPosn().getY(), 15);
		
		assertEquals("Tower Update32", tow.getPosn().getX(), 1);
		assertEquals("Tower Update32", tow.getPosn().getY(), 1);
		assertEquals("Tower Update32", tow.getPixelPosn().getX(), 16);
		assertEquals("Tower Update32", tow.getPixelPosn().getY(), 16);
		assertEquals("Tower Update32", tow.getCooldownRemaining(), 29);
		
		Grid.update();
		
		assertEquals("Oyster Update33", o.getPosn().getX(), 2);
		assertEquals("Oyster Update33", o.getPosn().getY(), 0);
		assertEquals("Oyster Update33", o.getPixelPosn().getX(), 47);
		assertEquals("Oyster Update33", o.getPixelPosn().getY(), 16);
		
		assertEquals("Pollutant Update33", pol.getPosn().getX(), 2);
		assertEquals("Pollutant Update33", pol.getPosn().getY(), 0);
		assertEquals("Pollutant Update33", pol.getPixelPosn().getX(), 47);
		assertEquals("Pollutant Update33", pol.getPixelPosn().getY(), 16);
		
		assertEquals("Invasive Update33", ii.getPosn().getX(), 2);
		assertEquals("Invasive Update33", ii.getPosn().getY(), 0);
		assertEquals("Invasive Update33", ii.getPixelPosn().getX(), 47);
		assertEquals("Invasive Update33", ii.getPixelPosn().getY(), 16);
		
		assertEquals("Larvae Update33", larv.getPosn().getX(), 2);
		assertEquals("Larvae Update33", larv.getPosn().getY(), 0);
		assertEquals("Larvae Update33", larv.getPixelPosn().getX(), 47);
		assertEquals("Larvae Update33", larv.getPixelPosn().getY(), 16);
		
		assertEquals("Tower Update33", tow.getPosn().getX(), 1);
		assertEquals("Tower Update33", tow.getPosn().getY(), 1);
		assertEquals("Tower Update33", tow.getPixelPosn().getX(), 16);
		assertEquals("Tower Update33", tow.getPixelPosn().getY(), 16);
		assertEquals("Tower Update33", tow.getCooldownRemaining(), 28);
		
		for(int i = 0; i < 15; i++){
			Grid.update();
		}
		
		assertEquals("Oyster Update48", o.getPosn().getX(), 2);
		assertEquals("Oyster Update48", o.getPosn().getY(), 1);
		assertEquals("Oyster Update48", o.getPixelPosn().getX(), 47);
		assertEquals("Oyster Update48", o.getPixelPosn().getY(), 31);
		
		assertEquals("Pollutant Update48", pol.getPosn().getX(), 2);
		assertEquals("Pollutant Update48", pol.getPosn().getY(), 1);
		assertEquals("Pollutant Update48", pol.getPixelPosn().getX(), 47);
		assertEquals("Pollutant Update48", pol.getPixelPosn().getY(), 31);
		
		assertEquals("Invasive Update48", ii.getPosn().getX(), 2);
		assertEquals("Invasive Update48", ii.getPosn().getY(), 1);
		assertEquals("Invasive Update48", ii.getPixelPosn().getX(), 47);
		assertEquals("Invasive Update48", ii.getPixelPosn().getY(), 31);
		
		assertEquals("Larvae Update48", larv.getPosn().getX(), 2);
		assertEquals("Larvae Update48", larv.getPosn().getY(), 1);
		assertEquals("Larvae Update48", larv.getPixelPosn().getX(), 47);
		assertEquals("Larvae Update48", larv.getPixelPosn().getY(), 31);
		
		assertEquals("Tower Update48", tow.getPosn().getX(), 1);
		assertEquals("Tower Update48", tow.getPosn().getY(), 1);
		assertEquals("Tower Update48", tow.getPixelPosn().getX(), 16);
		assertEquals("Tower Update48", tow.getPixelPosn().getY(), 16);
		assertEquals("Tower Update48", tow.getCooldownRemaining(), 13);
		
	}

	@Test
	public void testClickHandler() {
		Grid g = new Grid(80, 60);
		GridCell[][] p = new GridCell[3][3];
		p[0][0] = new GridCell(new Posn(0, 0), Direction.EAST, true);
		p[1][0] = new GridCell(new Posn(1, 0), Direction.EAST, true);
		p[2][0] = new GridCell(new Posn(2, 0), Direction.SOUTH, true);
		p[0][1] = new GridCell(new Posn(0, 1), Direction.WEST, true);
		p[1][1] = new GridCell(new Posn(1, 1), Direction.EAST, false);
		p[2][1] = new GridCell(new Posn(2, 1), Direction.SOUTH, true);
		p[0][2] = new GridCell(new Posn(0, 2), Direction.NORTH, true);
		p[1][2] = new GridCell(new Posn(1, 2), Direction.WEST, true);
		p[2][2] = new GridCell(new Posn(2, 2), Direction.WEST, true);
		// >>V
		// <.V
		// ^<<
		Grid.setCells(p);
		
		TrailItem t1 = new Oyster();
		t1.setPosn(new Posn(0, 1));
		t1.setPixelPosn(new Posn(15, 31));
		
		TrailItem t2 = new InvasiveItem();
		t2.setPosn(new Posn(2, 2));
		t2.setPixelPosn(new Posn(47, 47));
		
		TrailItem t3 = new Larvae();
		t3.setPosn(new Posn(2, 0));
		t3.setPixelPosn(new Posn(47, 15));
		
		Grid.clickHandler(15, 31);
		Grid.clickHandler(47, 47);
		Grid.clickHandler(47, 15);
		
		assertFalse("ClickHandler Oyster", Grid.getTrailItems().contains(t1));
		assertFalse("ClickHandler Oyster", Grid.getTrailItems().contains(t2));
		assertFalse("ClickHandler Oyster", Grid.getTrailItems().contains(t3));
		assertEquals("ClickHandler Happiness", Grid.getPlayer().getEstuaryHealth(), 49);
	}

}
