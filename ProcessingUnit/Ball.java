package ProcessingUnit;

import processing.core.PApplet;

public class Ball extends PApplet{
	private float x;
	private float y;
	private float diam;
	private float xSpeed;
	private float ySpeed;
    private float diamspeed;
	
    public void settings(){
        size(500,500);
    }

	public Ball(float x, float y, float diam){
		this.x = x;
		this.y = y;
		this.diam = diam;
		this.xSpeed = random(-10, 10);
		this.ySpeed = random(-10, 10);
        this.diamspeed = 5.0f;
	}
	
	public void step(){
        
		
        if(y < this.diam/2 || y > height-this.diam/2){
			ySpeed *= -1;
		}
        y += ySpeed;

		if(x < this.diam/2 || x > width-this.diam/2){
			xSpeed *= -1;
		}
		x += xSpeed;
		
		if(this.diam < 10 || this.diam > 200){
            this.diamspeed *= -1;
        }
        this.diam += this.diamspeed;
	}
	
	public void render(){
		ellipse(x, y, diam, diam);
	}

    public void draw(){
        this.step();
        this.render();
    }

    public static void main(String[] args){
        String[] processingArgs = {"MySketch"};
		Ball mySketch = new Ball(250.0f,250.0f,200.0f);
		PApplet.runSketch(processingArgs, mySketch);
    }
}