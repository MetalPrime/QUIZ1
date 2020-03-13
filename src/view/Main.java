package view;

import model.Logic;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	Logic logic;
	
	public void settings() {
		size(700,700);
	}
	
	public void setup() {
		logic = new Logic(this);
	}
	
	public void draw() {
		background(0);
		logic.paint();
		logic.move();
		logic.collision();
	}
	
	public void mouseClicked() {
		logic.clicked();
	}

}
