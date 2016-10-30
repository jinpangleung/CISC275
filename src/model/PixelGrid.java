package model;

public class PixelGrid {
	
	private static Posn topLeftCorner;
	private static int squareSize;
	private static int numberOfSquares;
	private final double SCREEN_PERCENT = 0.8;
	
	public PixelGrid(int screenWidth, int screenHeight, int numSquares){
		double absoluteGridSize = screenHeight * SCREEN_PERCENT;
		int gridSize = (int) absoluteGridSize;
		this.squareSize = gridSize / numSquares;
		this.numberOfSquares = numSquares;
		// TODO
		// calculate proper left corner
	}
	
	public static Posn getTopLeftCorner(){
		return topLeftCorner;
	}
	
	public static int getSquareSize(){
		return squareSize;
	}
	
	public static int getNumberOfSquares(){
		return numberOfSquares;
	}
	
	public static GridCell getGridCell(int x, int y){
		int xPos = (x - topLeftCorner.getX()) / squareSize;
		int yPos = (y - topLeftCorner.getY()) / squareSize;
		if(xPos >= numberOfSquares || yPos >= numberOfSquares){
			throw new OutOfGridException();
		}
		GridCell[][] positions = Grid.getCells();
		return positions[xPos][yPos];
	}
	
	public static GridCell getGridCell(Posn p){
		return getGridCell(p.getX(), p.getY());
	}
}
