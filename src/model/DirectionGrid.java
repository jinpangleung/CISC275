package model;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.awt.Graphics;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class DirectionGrid {
	
	// Attributes
	private GridCell[][] directionGrid;
	private List<Posn> spawnPositions;
	private Posn lastPosn;
	private int gridSize;
	
	// Constructor
	public DirectionGrid(){
		try{
			// Read from grid.txt
			Path path = Paths.get("grid.txt");
		    List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		    gridSize = lines.get(0).length();
		    System.out.println("Grid Size " + Integer.toString(gridSize));
		    directionGrid = new GridCell[gridSize][gridSize];
		    for(int i = 0; i < gridSize; i++){ // i is the y component
		    	String str = lines.get(i);
		    	for(int j = 0; j < gridSize; j++){ // j is the x component
		    		char c = str.charAt(j);
		    		Direction dir;
		    		boolean isTrail;
		    		switch(c){
		    		case 'N': dir = Direction.NORTH; isTrail = true; break;
		    		case 'E': dir = Direction.EAST; isTrail = true; break;
		    		case 'W': dir = Direction.WEST; isTrail = true; break;
		    		case 'S': dir = Direction.SOUTH; isTrail = true; break;
		    		case 'X': dir = Direction.SOUTH; isTrail = false; break;
		    		default: throw new InvalidCellException();
		    		}
		    		directionGrid[j][i] = new GridCell(new Posn(j, i), dir, isTrail);
		    	}
		    	// I'm manually setting the spawn positions for now
		    	spawnPositions = new ArrayList<Posn>();
		    	spawnPositions.add(new Posn(1, 0));
		    	spawnPositions.add(new Posn(8, 0));
		    	lastPosn = new Posn(8, 9);
		    }
		} catch (IOException e){
			System.out.println("Could not open grid.txt");
			throw new RuntimeException();
		}
	}
	
	/**
	 * Return the GridCell at position x,y
	 * <p>
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public GridCell gridCellAt(int x, int y){
		return directionGrid[x][y];
	}
	
	/**
	 * Return the GridCell at posn
	 * <p>
	 * 
	 * @param p
	 * @return
	 */
	public GridCell gridCellAt(Posn p){
		return gridCellAt(p.getX(), p.getY());
	}
	
	/**
	 * Returns DirectionGrid as a string
	 * Print out each GridCell
	 * Print out all starting posns
	 * Print out ending posn
	 * Print out size of grid
	 */
	public String toString(){
		String str = "";
		str += "Direction Grid\n";
		str += "Size of Grid is " + Integer.toString(gridSize) + "\n";
		str += "The Spawning Positions are:\n";
		for(Posn p : spawnPositions){
			str += "\t" + p.toString() + "\n";
		}
		str += "The Last Position in Stream is:\n";
		str += "\t" + lastPosn.toString() + "\n";
		str += "The Grid Cells are as follows:\n";
		for(int i = 0; i < gridSize; i++){
			for(int j = 0; j < gridSize; j++){
				str += "\tAt (" + Integer.toString(j) + ", " + Integer.toString(i) + ") : " + directionGrid[j][i].toString();
				if(i != gridSize - 1 || j != gridSize - 1){ // print a newline on every row but the last
					str += "\n";
				}
			}
		}
		return str;
	}
	
	public void draw(Graphics g){
		for(int i = 0; i < gridSize; i++){
			for(int j = 0; j < gridSize; j++){
				Grid.getInstance().getPixelGrid().draw(g, directionGrid[i][j]);
			}
		}
	}

	public int getGridSize() {
		return gridSize;
	}

	public void setGridSize(int gridSize) {
		this.gridSize = gridSize;
	}

	public GridCell[][] getDirectionGrid() {
		return directionGrid;
	}

	public void setDirectionGrid(GridCell[][] directionGrid) {
		this.directionGrid = directionGrid;
	}

	public List<Posn> getSpawnPositions() {
		return spawnPositions;
	}

	public void setSpawnPositions(List<Posn> spawnPositions) {
		this.spawnPositions = spawnPositions;
	}

	public Posn getLastPosn() {
		return lastPosn;
	}

	public void setLastPosn(Posn lastPosn) {
		this.lastPosn = lastPosn;
	}
}
