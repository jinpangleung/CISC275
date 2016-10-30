package model;

import java.awt.Graphics;

public class Storm {
	protected boolean isStorming;
	protected int damage;
}

public Storm(){
	isStorming = true;
	damage = 2;
}


public void dealDamage(){
	//TODO
}

public boolean isStorming() {
	return isStorming;
}

public void setStorming(boolean isStorming) {
	this.isStorming = isStorming;
}

static public void draw(Graphics g){
	// TODO

}

