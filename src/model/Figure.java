package model;

import processing.core.PApplet;

public abstract class Figure {

	protected PApplet app;
	protected int size;
	protected float posX;
	protected float posY;
	protected float dir;

	public Figure(PApplet app,int size, float posX, float posY, float dir) {
		this.size = size;
		this.posX = posX;
		this.posY = posY;
		this.dir = dir;
	}
	
	public abstract void paint();
	
	public abstract void move();

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the posX
	 */
	public float getPosX() {
		return posX;
	}

	/**
	 * @param posX the posX to set
	 */
	public void setPosX(float posX) {
		this.posX = posX;
	}

	/**
	 * @return the posY
	 */
	public float getPosY() {
		return posY;
	}

	/**
	 * @param posY the posY to set
	 */
	public void setPosY(float posY) {
		this.posY = posY;
	}

	/**
	 * @return the dir
	 */
	public float getDir() {
		return dir;
	}

	/**
	 * @param dir the dir to set
	 */
	public void setDir(float dir) {
		this.dir = dir;
	}

	/**
	 * @return the app
	 */
	public PApplet getApp() {
		return app;
	}

	/**
	 * @param app the app to set
	 */
	public void setApp(PApplet app) {
		this.app = app;
	}
	
	
}
