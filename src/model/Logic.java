package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	private String[] txtload; 
	private ArrayList <Circle> circle;
	private ArrayList <Rect> rect;
	
	public Logic(PApplet app) {
		this.app = app;
		txtload = app.loadStrings("./../data/text.txt");
		System.out.println(txtload.length);
		for(int i=0; i<txtload.length;i++) {
			if(txtload[i].contains("Circulo")) {
				circle.add(new Circle(i, i, i, i));
			}
			if(txtload[i].contains("Cuadrado")) {
				rect.add(new Rect(i, i, i, i));
			}
		}
		
	}

	

	public void paint() {
		// TODO Auto-generated method stub
		
	}

	public void move() {
		// TODO Auto-generated method stub
		
	}

	public void collision() {
		// TODO Auto-generated method stub
		
	}

	public void clicked() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
