package model;

public class Posn implements Comparable<Posn>{
	
	public Posn(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Posn(){}
	
	
	private int x, y;
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public void addX(int xVal){
		this.setX(this.getX() + xVal);
	}
	
	public void addY(int yVal){
		this.setY(this.getY() + yVal);
	}
	
	/**
	 * Returns void
	 * <p>
	 * multiply both x and y by given val
	 * 
	 * @param val
	 */
	public void multiply(int val){
		this.setX(this.getX() * val);
		this.setY(this.getY() * val);
	}
	
	/**
	 * returns int
	 * <p>
	 * returns and integer that shows which of the two posns are larger
	 * @param o
	 * @return
	 */
	public int compareTo(Posn o) {
		// Currently compares based on Euclidian Distance
		return (int) Math.signum(Math.hypot((x - o.getX()), (y - o.getY())));
	}
	
	/**
	 * toString
	 */
	public String toString(){
		return "(" +  Integer.toString(getX()) + ", " + Integer.toString(getY()) + ")";
	}

}
