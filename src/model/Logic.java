package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	private String[] txtload; 
	private String[] dataCircle;
	private String[] dataRect;
	private ArrayList <Circle> circle;
	private ArrayList <Rect> rect;
	
	public Logic(PApplet app) {
		this.app = app;
		
		txtload = app.loadStrings("./../data/text.txt");
		circle = new ArrayList <Circle>();
		rect = new ArrayList<Rect>();
	
		for(int i=0; i<txtload.length;i++) {
			//System.out.println(txtload[i]);
			if(txtload[i].contains("Circulo")) {
				
				dataCircle = txtload[i].split(" ");
				for (int j = 0; j < dataCircle.length; j++) {
					System.out.println(dataCircle[j]);
					System.out.println(dataCircle[0]);
					int size = Integer.parseInt(dataCircle[1]);
					int posX =(int) Integer.parseInt(dataCircle[2]);
					int posY = Integer.parseInt(dataCircle[3]);
					int dir = Integer.parseInt(dataCircle[4]);
					circle.add(new Circle(app, size, posX, posY, dir));
				}
				
			}
			if(txtload[i].contains("Cuadrado")) {
				
				dataRect = txtload[i].split(" ");
				for (int j = 0; j < dataRect.length; j++) {
					System.out.println(dataRect[j]);
					int size = Integer.parseInt(dataRect[1]);
					int posX = Integer.parseInt(dataRect[2]);
					int posY = Integer.parseInt(dataRect[3]);
					int dir = Integer.parseInt(dataRect[4]);
					rect.add(new Rect(app, size, posX, posY, dir));
				}
				
			}
		//System.out.println(circle.size());
		}
		
	}

	

	public void paint() {
		// TODO Auto-generated method stub
		for (int i = 0; i < rect.size(); i++) {
			rect.get(i).paint();
		}
		
		for (int i = 0; i < circle.size(); i++) {
			circle.get(i).paint();
		}
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
