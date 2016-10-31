package model;

public class GridCell {
	
	private Posn posn;
	private Direction direction;
	private boolean isTrail;
	
	public GridCell(Posn p, Direction d, boolean isTrail){
		this.posn = p;
		this.direction = d;
		this.isTrail = isTrail;
	}

	public Posn getPosn() {
		return posn;
	}

	public void setPosn(Posn posn) {
		this.posn = posn;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public boolean isTrail() {
		return isTrail;
	}

	public void setTrail(boolean isTrail) {
		this.isTrail = isTrail;
	}
	
	public String toString(){
		String str = "";
		switch(direction){
		case NORTH: str += "North"; break;
		case EAST: str += "South"; break;
		case WEST: str += "West"; break;
		case SOUTH: str += "South"; break;
		}
		str += " " + posn.toString();
		return str;
	}
	
	

}
