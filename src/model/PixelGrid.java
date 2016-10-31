package model;

import java.awt.Graphics;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.Color;

public class PixelGrid {
	
	private Posn topLeftCorner;
	private int squareSize;
	private int numberOfSquares;
	private double SCREEN_PERCENT = 0.8;
	
	public PixelGrid(int screenWidth, int screenHeight, int numSquares){
		double absoluteGridSize = (double) screenHeight * SCREEN_PERCENT; // 80% of the screen
		int gridSize = (int) absoluteGridSize; // Rounded to an integer
		this.squareSize = gridSize / numSquares;
		this.numberOfSquares = numSquares;
		double corner = (double) screenHeight * 0.1;
		topLeftCorner = new Posn((int) corner, (int) corner);
	}
	
	/**
	 * Get Grid Cell at specified pixel x,y
	 * @param x
	 * @param y
	 * @return
	 */
	public GridCell getGridCell(int x, int y){
		int xPos = (x - topLeftCorner.getX()) / squareSize;
		int yPos = (y - topLeftCorner.getY()) / squareSize;
		if(xPos >= numberOfSquares || yPos >= numberOfSquares
				|| xPos < 0 || yPos < 0){
			throw new OutOfGridException();
		}
		return Grid.getInstance().getCells().gridCellAt(xPos, yPos);
	}
	
	/**
	 * Get Grid Cell at specified PixelPosn
	 * @param p
	 * @return
	 */
	public GridCell getGridCell(Posn p){
		return getGridCell(p.getX(), p.getY());
	}
	
	/**
	 * Get Posn of Grid Cell at specified pixel x,y
	 * @param x
	 * @param y
	 * @return
	 */
	public Posn getGridCellPosn(int x, int y){
		int xPos = (x - topLeftCorner.getX()) / squareSize;
		int yPos = (y - topLeftCorner.getY()) / squareSize;
		if(xPos >= numberOfSquares || yPos >= numberOfSquares
				|| xPos < 0 || yPos < 0){
			throw new OutOfGridException();
		}
		return Grid.getInstance().getCells().gridCellAt(xPos, yPos).getPosn();
	}
	
	/**
	 * Get Posn of Grid Cell at specified PixelPosn
	 * @param p
	 * @return
	 */
	public Posn getGridCellPosn(Posn p){
		return getGridCellPosn(p.getX(), p.getY());
	}
	
	public Posn getTopLeftCorner(){
		return topLeftCorner;
	}
	
	public int getSquareSize(){
		return squareSize;
	}
	
	public int getNumberOfSquares(){
		return numberOfSquares;
	}
	
	/**
	 * toString
	 * PixelGrid
	 * There are 10 squares of size 61
	 * The top left corner is (76, 76)
	 */
	public String toString(){
		String str = "";
		str += "PixelGrid\n";
		str += "There are " + Integer.toString(numberOfSquares) + " squares of size " + Integer.toString(squareSize) + "\n";
		str += "The top left corner is " + topLeftCorner.toString();
		return str;
	}
	
	public Posn getValidPixelPosn(Posn gridPosn){
		if(gridPosn.getX() >= numberOfSquares ||
				gridPosn.getY() >= numberOfSquares ||
				gridPosn.getX() < 0 || gridPosn.getY() < 0){
			throw new OutOfGridException();
		} else {
			int xPos = gridPosn.getX() * squareSize;
			xPos += ThreadLocalRandom.current().nextInt(0, squareSize);
			xPos += topLeftCorner.getX();
			int yPos = gridPosn.getY() * squareSize;
			yPos += ThreadLocalRandom.current().nextInt(0, squareSize);
			yPos += topLeftCorner.getY();
			return new Posn(xPos, yPos);
		}
	}
	
	public void draw(Graphics g, GridCell gc){
		int xPos = (gc.getPosn().getX() * squareSize) + topLeftCorner.getX();
		int yPos = (gc.getPosn().getY() * squareSize) + topLeftCorner.getY();
		g.setColor(Color.magenta);
		if(gc.isTrail()){
			g.drawRect(xPos, yPos, squareSize, squareSize);
		} else {
			g.fillRect(xPos, yPos, squareSize, squareSize);
		}
	}
}
