package model;
import java.awt.*;
import java.util.*;

import drawing.ImageLibrary;
import gabion.Gabion;
import towers.Tower;
import trailitems.TrailItem;

/*
 * Notes
 */

public class Grid {
	
////Attributes ////
	private DirectionGrid cells;
	private Collection<GridItem> items;
	private Collection<Tower> towers;
	private Collection<TrailItem> trailItems;
	private Collection<Gabion> gabions;
	private Collection<Path> paths;
	private Player player;
	private PixelGrid pixelGrid;
	private Difficulty difficulty;
	private Posn[] posnByDirection;
	private Touch touch;
	private Structures towerComponent;
	
	static private Grid grid = null;
	//// Attributes ////
	
	static public Grid getInstance(){
		if(grid == null){
			grid = new Grid();
		}
		return grid;
	}
	
	//// Constructor ////
	private Grid(){
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		cells = new DirectionGrid();
		System.out.println(cells);
		items = new ArrayList<GridItem>();
		towers = new ArrayList<Tower>();
		trailItems = new ArrayList<TrailItem>();
		gabions = new ArrayList<Gabion>();
		paths = new ArrayList<Path>();
		player = new Player();
		pixelGrid = new PixelGrid((int) d.getWidth(), (int) d.getHeight(), cells.getGridSize());
		difficulty = new Difficulty();
		posnByDirection = new Posn[4];
		posnByDirection[Direction.EAST.ordinal()] = new Posn(1, 0);
		posnByDirection[Direction.NORTH.ordinal()] = new Posn(0, -1);
		posnByDirection[Direction.WEST.ordinal()] = new Posn(-1, 0);
		posnByDirection[Direction.SOUTH.ordinal()] = new Posn(0, 1);
		new ImageLibrary();
		touch = new Touch();
		towerComponent = new Structures((int) d.getWidth(), (int) d.getHeight(), pixelGrid);
	}
	
	//// Getters and Setters ////
	public Structures getTowerComponent(){
		return towerComponent;
	}
	public DirectionGrid getCells(){
		return cells;
	}
	public Collection<GridItem> getItems(){
		return items;
	}
	public Player getPlayer(){
		return player;
	}
	public Collection<Tower> getTowers(){
		return towers;
	}
	public Collection<TrailItem> getTrailItems(){
		return trailItems;
	}
	public Collection<Gabion> getGabions(){
		return gabions;
	}
	public PixelGrid getPixelGrid(){
		return pixelGrid;
	}
	public int getGridSize(){
		return cells.getGridSize();
	}
	
	public void setCells(DirectionGrid p){
		cells = p;
	}
	
	public GridCell getCellAt(Posn p){
		return cells.gridCellAt(p);
	}
	
	public Collection<Path> getPaths(){
		return paths;
	}
	
	public void setPaths(Collection<Path> p){
		paths = p;
	}
	
	public Touch getTouch(){
		return touch;
	}
	
	public Posn getCellPosnFromPixelPosn(Posn pixel){
		GridCell gc = pixelGrid.getGridCell(pixel.getX(), pixel.getY());
		return gc.getPosn();
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
	public void update(){
		// Iterate through and update grid items
		for(GridItem i : items){
			i.update();
		}
		// Iterate through all of the paths
		Iterator<Path> i = paths.iterator();
		while (i.hasNext()) {
		   Path p = i.next(); // must be called before you can call i.remove()
		   if(p.update()){
			   i.remove();
		   }
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
	public void draw(Graphics g){
		// TODO
		// Draw estuary
		// Draw grid items
		cells.draw(g);
		towerComponent.draw(g);
		for(GridItem item : items){
			item.draw(g);
		}
		for(Path p : paths){
			p.getGridItem().draw(g);
		}
		touch.draw(g);
	}
	
	/**
	 * Returns void
	 * <p>
	 * Take in a mouse click, find out what was clicked, handle it
	 * 
	 * @param mouseX
	 * @param mouseY
	 */
	public void clickHandler(int mouseX, int mouseY){
		// TODO
		// Find which item was clicked
		// Have that item handle it
		// Step 1 : Check if the grid was clicked or something else
		// For now assume that the grid was clicked
		// Step 2 : Check what in the grid was clicked
		// For now, it will be inefficient
		System.out.println(new Posn(mouseX, mouseY));
		if(pixelGrid.isWithin(mouseX, mouseY)){
			for(TrailItem ti : trailItems){
				int imageWidth = ti.getAnimation().getImageWidth();
				int imageHeight = ti.getAnimation().getImageHeight();
				int xOffset = ti.getAnimation().getXOffset();
				int yOffset = ti.getAnimation().getYOffset();
				int itemX = ti.getPixelPosn().getX();
				int itemY = ti.getPixelPosn().getY();
				
				int left = itemX - xOffset;
				int right = itemX + (imageWidth - xOffset);
				int top = itemY - yOffset;
				int bottom = itemY + (imageHeight - yOffset);
				
				if(left <= mouseX && right >= mouseX && top <= mouseY && bottom >= mouseY){
					ti.click();
					return;
				}
			}
		} else if (towerComponent.isWithin(mouseX, mouseY)){
			towerComponent.click(mouseX, mouseY);
		}
	}
	
	/**
	 * Handle mouse releases
	 * @param mouseX
	 * @param mouseY
	 */
	public void releaseHandler(int mouseX, int mouseY){
		touch.releaseHandler(mouseX, mouseY);
	}
	
	/**
	 * Handle mouse drags
	 * @param mouseX
	 * @param mouseY
	 */
	public void dragHandler(int mouseX, int mouseY){
		touch.dragHandler(mouseX, mouseY);
	}
	
	/**
	 * Return Posn based on desired direction
	 * <p>
	 * Take in a direction, and say which Posn should be moved to next
	 * Take the Posn this function gives, and add it to objects current Posn
	 * 
	 * @param direction
	 */
	public Posn getPosnFromDirection(Direction direction){
		return posnByDirection[direction.ordinal()];
	}
	
	/**
	 * Returns void
	 * <p>
	 * Add a trail item to the Grid
	 * 
	 * @param ti
	 */
	public void addTrailItems(TrailItem ti){
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
	public GridCell getCellFromPosn(Posn posn){
		return cells.gridCellAt(posn);
	}
	
	/**
	 * Return GridCell
	 * <p>
	 * returns the cell based on given pixel posn
	 * Can throw a runtime exception on out of bounds
	 * 
	 * @param pixelPosn
	 */
	public GridCell getCellFromPixelPosn(Posn pixelPosn){
		return pixelGrid.getGridCell(pixelPosn);
	}
	
	/**
	 * Return void
	 * <p>
	 * Add grid item to the grid and into the correct collections
	 * 
	 * @param gi
	 */
	public void addGridItem(GridItem gi){
		if(gi.getClass().getSuperclass() == TrailItem.class){
			items.add((TrailItem) gi);
			trailItems.add((TrailItem) gi);
		}
	}
	
	public void addPath(Path p){
		paths.add(p);
	}
	
	public void addTower(Tower t){
		items.add(t);
		towers.add(t);
	}
	//// Methods ////

}
