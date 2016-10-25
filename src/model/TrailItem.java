package model;


//Abstract class
public class TrailItem extends GridItem {
	
	//// Attributes ////
	protected int health;
	protected int speed;
	protected boolean isBad; //is bad when you click on it
	protected Color color;
	
	//// Constants ////
	protected final int CLICKDAMAGE = 1;
	
	//// Getters ////
	public int getHealth(){
		return this.health;
	}
	public int getSpeed(){
		return this.speed;
	}
	public boolean getIsBad(){
		return this.isBad;
	}
	public Color getColor(){
		return this.color;
	}
	
	//// Methods ////
	public void damage(){
		// TODO
	}
	public void click(){
		// TODO
	}
	
	@Override
	public void update() {
		// TODO Fix method calls when methods become implemented - Gifan
		// TODO Need Direction Enum
		// Adjust pixel position based on position of the grid cell and speed
		switch (Grid.getCellFromPosn(gridPosn).getDirection()){
			case NORTH:
				pixelPosn.setY(pixelPosn.getY() - speed);
				break;
			case SOUTH:
				pixelPosn.setY(pixelPosn.getY() + speed);
				break;
			case EAST:
				pixelPosn.setX(pixelPosn.getX() + speed);
				break;
			case WEST:
				pixelPosn.setX(pixelPosn.getX() - speed);
				break;
		}
		
		// Check if new pixel position requires a change in grid position
		Posn newCellPosn = Grid.getCellPosnFromPixelPosn(pixelPosn);
		if(!(newCellPosn.equals(gridPosn))){
			gridPosn = newCellPosn;
		}
		
	}

}
