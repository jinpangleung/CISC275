package model;
import java.awt.*;

import view.Animation;

public abstract class GridItem {
	
	//// Attributes ////
	private Posn posn;
	private Posn pixelPosn;
	private Animation animation;
	
	//// Setters and Getters ////
	public Posn getPosn(){
		return posn;
	}
	public Posn getPixelPosn(){
		return pixelPosn;
	}
	public Animation getAnimation(){
		return animation;
	}
	public void setPosn(Posn p){
		posn = p;
	}
	public void setPixelPosn(Posn pp){
		pixelPosn = pp;
	}
	public void setAnimation(Animation ani){
		animation = ani;
	}
	
	//// Methods ////
	public void draw(Graphics g){
		// TODO
	}
	
	public void update(){
		// TODO
	}

}
