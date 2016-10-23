package cisc275_final;
import java.awt.*;

public class Animation {
	
	//// Attributes ////
	private String[] sprites;
	private int length;
	private int index;
	private int xOffset;
	private int yOffset;
	private int imageWidth;
	private int imageHeight;
	
	//// Getters and Setters ////
	public int getImageWidth(){
		return imageWidth;
	}
	public int getImageHeight(){
		return imageHeight;
	}
	
	//// Methods ////
	public boolean draw(Graphics g, int x, int y){
		return true;
		// TODO
	}
	public boolean draw(Graphics g, Posn posn){
		return true;
		// TODO
	}
	public void drawStatic(Graphics g, int x, int y){
		// TODO
	}
	public void drawStatic(Graphics g, Posn posn){
		// TODO
	}
	

}
