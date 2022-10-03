package ProcessingUnit;

import processing.core.PApplet;

public class MySketch extends PApplet {

	public void settings(){
		size(500, 500);
	}
	
	public void draw(){
		ellipse(mouseX, mouseY, 50, 50);
	}
	
	public void mousePressed(){
		background(64);
	}
	//}

	// public void draw(){
	// 	//background(64);
	// 	ellipse(mouseX, mouseY, 20, 20);
	// }
  
}