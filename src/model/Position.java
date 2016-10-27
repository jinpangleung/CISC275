package model;

public class Position {
	private Color color;
	private boolean isTrail;
	private Posn position;
	private Direction direction;
	
	public Position(Posn posn, Direction dir, boolean b) {
		position = posn;
		direction = dir;
		isTrail = b;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isTrail() {
		return isTrail;
	}

	public void setTrail(boolean isTrail) {
		this.isTrail = isTrail;
	}

	public Posn getPosition() {
		return position;
	}

	public void setPosition(Posn position) {
		this.position = position;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}
}
