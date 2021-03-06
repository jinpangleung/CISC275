package model;
import java.awt.*;

import drawing.Animation;

public abstract class GridItem {
	
	//// Attributes ////
	protected Posn gridPosn;
	protected Posn pixelPosn;
	protected Animation animation;
	
	//// Setters and Getters ////
	public Posn getPosn(){
		return gridPosn;
	}
	public Posn getPixelPosn(){
		return pixelPosn;
	}
	public Animation getAnimation(){
		return animation;
	}
	public void setPosn(Posn p){
		gridPosn = p;
	}
	public void setPixelPosn(Posn pp){
		pixelPosn = pp;
	}
	public void setAnimation(Animation ani){
		animation = ani;
	}
	
	//// Methods ////
	public void draw(Graphics g){
		animation.draw(g, pixelPosn);
	}
	
	abstract public void update();

}
