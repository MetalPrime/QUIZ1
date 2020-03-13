package model;

import processing.core.PApplet;

public class Rect extends Figure {

	public Rect(PApplet app,int size, float posX, float posY, float dir) {
		super(app, size, posX, posY, dir);
		// TODO Auto-generated constructor stub
		this.app = app;
		this.size = size;
		this.posX = posX;
		this.posY = posY;
		this.dir = dir;
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		app.circle(getPosX(), getPosY(), size);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}
