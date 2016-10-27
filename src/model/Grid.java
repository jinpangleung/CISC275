package model;
import java.awt.*;
import java.util.*;

/*
 * Notes
 */

public class Grid {
	
	//// Attributes ////
	static private Position[][] positions = new Position[10][10];
	static private Collection<GridItem> items = new ArrayList<GridItem>();
	static private Collection<Tower> towers = new ArrayList<Tower>();
	static private Collection<TrailItem> trailItems = new ArrayList<TrailItem>();
	static private Collection<Gabion> gabions = new ArrayList<Gabion>();
	static private Player player = new Player();
	static private PixelGrid pixelGrid = new PixelGrid();
	//// Attributes ////
	
	//// Constructor ////
	public Grid(int screenWidth, int screenHeight){
		// TODO
		// THe pixel grid should be a square based on 80% of the height
	}
	
	//// Getters and Setters ////
	static public Position[][] getPositions(){
		return positions;
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
		return positions.length;
	}
	
	static public void setPositions(Position[][] p){
		positions = p;
	}
	//// Getters and Setters ////
	
	//// Methods ////
	static public void update(){
		// TODO
		// Iterate through and update grid items
		for(GridItem i : items){
			i.update();
		}
		// Update player
		player.update();
		// Update difficulty
		// do this later
	}
	static public void draw(Graphics g){
		// TODO
		// Draw estuary
		// Draw grid items
	}
	static public void clickHandler(int mouseX, int mouseY){
		// TODO
		// Find which item was clicked
		// Have that item handle it
	}
	//// Methods ////

}
