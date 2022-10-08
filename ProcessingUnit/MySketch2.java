package ProcessingUnit;

import processing.core.PApplet;
import java.util.ArrayList;
import java.lang.Math;

public class MySketch2 extends PApplet{
    private ArrayList<Ball> balls = new ArrayList<>();
	
	public void settings(){
		size(500, 500);
		//balls.add(new Ball(this,width/2, height/2,100));
	}
	
	public void draw(){
		background(64);
		for(Ball b : balls){
			b.step();
			b.render();
		}
	}
	
	public void mouseDragged(){
		balls.add(new Ball(this,mouseX, mouseY, Math.abs(mouseX-mouseY)));
	}
	
	public static void main(String[] args){
		String[] processingArgs = {"MySketch2"};
		MySketch2 mySketch = new MySketch2();
		PApplet.runSketch(processingArgs, mySketch);
	}
}
