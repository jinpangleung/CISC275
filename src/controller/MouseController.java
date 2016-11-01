package controller;

import java.awt.event.*;

import model.Grid;

public class MouseController implements MouseListener,
	MouseMotionListener{
	
	public MouseController(){}
	
	public void mouseClicked(MouseEvent event){
		
	}
	
	public void mousePressed(MouseEvent event){
		Grid.getInstance().clickHandler(event.getX(), event.getY());
	}
	
	public void mouseReleased(MouseEvent event){
		Grid.getInstance().getTouch().releaseHandler(event.getX(), event.getY());
	}
	
	public void mouseDragged(MouseEvent event){
		Grid.getInstance().getTouch().dragHandler(event.getX(), event.getY());
	}
	
	public void mouseMoved(MouseEvent event){
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}