package model;
import java.awt.*;
import java.util.*;

import gabions.Gabion;
import towers.Tower;
import trailitems.TrailItem;

/*
 * Notes
 */

public class Grid {
	
////Attributes ////
	static private GridCell[][] cells;
	static private Collection<GridItem> items;
	static private Collection<Tower> towers;
	static private Collection<TrailItem> trailItems;
	static private Collection<Gabion> gabions;
	static private Player player;
	static private PixelGrid pixelGrid;
	static private Difficulty difficulty;
	private final int GRID_SIZE = 10;
	static private Posn[] posnByDirection;
	//// Attributes ////
	
	//// Constructor ////
	public Grid(int screenWidth, int screenHeight){
		cells = new GridCell[GRID_SIZE][GRID_SIZE];
		items = new ArrayList<GridItem>();
		towers = new ArrayList<Tower>();
		trailItems = new ArrayList<TrailItem>();
		gabions = new ArrayList<Gabion>();
		player = new Player();
		pixelGrid = new PixelGrid(screenWidth, screenHeight, GRID_SIZE);
		difficulty = new Difficulty();
		posnByDirection = new Posn[4];
		posnByDirection[Direction.EAST.ordinal()] = new Posn(1, 0);
		posnByDirection[Direction.NORTH.ordinal()] = new Posn(0, -1);
		posnByDirection[Direction.WEST.ordinal()] = new Posn(-1, 0);
		posnByDirection[Direction.SOUTH.ordinal()] = new Posn(0, 1);
	}
	
	//// Getters and Setters ////
	static public GridCell[][] getCells(){
		return cells;
	}
	static public Collection<GridItem> getItems(){
		return items;
	}
	static public Player getPlayer(){
		return player;
	}
	static public Collection<Tower> getTowers(){
		return towers;
	}
	static public Collection<TrailItem> getTrailItems(){
		return trailItems;
	}
	static public Collection<Gabion> getGabions(){
		return gabions;
	}
	static public PixelGrid getPixelGrid(){
		return pixelGrid;
	}
	static public int getGridSize(){
		return cells.length;
	}
	
	static public void setCells(GridCell[][] p){
		cells = p;
	}
	//// Getters and Setters ////
	
	/**
	 * Returns void, alters the existing Grid
	 * <p>
	 * Iterates through every element of the Grid, calling each
	 * GridItems update method, and updating the player
	 *
	 * @return      void
	 */
	static public void update(){
		// Iterate through and update grid items
		for(GridItem i : items){
			i.update();
		}
		// Update player
		player.update();
		
		// Update difficulty
		difficulty.update();
	}
	
	/**
	 * Returns void 
	 * <p>
	 * Draws the Grid and everything contained in it to the given Graphics.
	 *
	 * @param  g The Graphics to draw from.
	 * @return      Void
	 */
	static public void draw(Graphics g){
		// TODO
		// Draw estuary
		// Draw grid items
	}
	
	/**
	 * Returns void
	 * <p>
	 * Take in a mouse click, find out what was clicked, handle it
	 * 
	 * @param mouseX
	 * @param mouseY
	 */
	static public void clickHandler(int mouseX, int mouseY){
		// TODO
		// Find which item was clicked
		// Have that item handle it
	}
	
	/**
	 * Return Posn based on desired direction
	 * <p>
	 * Take in a direction, and say which Posn should be moved to next
	 * Take the Posn this function gives, and add it to objects current Posn
	 * 
	 * @param direction
	 */
	static public Posn getPosnFromDirection(Direction direction){
		return posnByDirection[direction.ordinal()];
	}
	
	/**
	 * Returns void
	 * <p>
	 * Add a trail item to the Grid
	 * 
	 * @param ti
	 */
	static public void addTrailItems(TrailItem ti){
		items.add(ti);
		trailItems.add(ti);
	}
	
	/**
	 * Return GridCell
	 * <p>
	 * returns the cell at the specified position
	 * 
	 * @param posn
	 */
	static public GridCell getCellFromPosn(Posn posn){
		return cells[posn.getX()][posn.getY()];
	}
	
	/**
	 * Return GridCell
	 * <p>
	 * returns the cell based on given pixel posn
	 * Can throw a runtime exception on out of bounds
	 * 
	 * @param pixelPosn
	 */
	static public GridCell getCellFromPixelPosn(Posn pixelPosn){
		return pixelGrid.getGridCell(pixelPosn);
	}
	//// Methods ////

}
