package model;

public class Posn {
	
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

}
