package drawing;
import java.awt.*;
import java.awt.image.*;

import model.Posn;

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
	/*
	 * Return true if the image that was just drawn is the last image in the animation
	 * Draw image to Graphics based on the animation index
	 * Update the animation index
	 * <@param> g Graphics to be drawn to
	 * <@param> x X coordinate to draw to
	 * <@param> y Y coordinate to draw to
	 */
	public boolean draw(Graphics g, int x, int y){
		int currentIndex = index;
		index = (index + 1) % length;
		BufferedImage image = ImageLibrary.getImage(sprites[currentIndex]);
		int drawX = x - xOffset;
		int drawY = y - yOffset;
		g.drawImage(image, drawX, drawY, null);
		return index == 0;
	}
	
	// Draw based on Posn rather than individual x, y coordinates
	public boolean draw(Graphics g, Posn posn){
		return this.draw(g, posn.getX(), posn.getY());
	}
	
	// Draw without updating the animation index
	public void drawStatic(Graphics g, int x, int y){
		BufferedImage image = ImageLibrary.getImage(sprites[index]);
		int drawX = x - xOffset;
		int drawY = y - xOffset;
		g.drawImage(image, drawX, drawY, null);
	}
	
	// Draw statically with a Posn rather than x, y coordinates
	public void drawStatic(Graphics g, Posn posn){
		drawStatic(g, posn.getX(), posn.getY());
	}
	

}
