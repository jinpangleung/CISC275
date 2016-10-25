package model;

public class Posn {
	
	public Posn(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Posn(){}
	
	public String toString(){
		return (x + " , " + y);
	}
	
	
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
