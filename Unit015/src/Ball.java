//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y, int xSpeed, int ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public Ball(int x, int y, int wid, int ht, int xSpeed, int ySpeed) {
		super(x, y, wid, ht);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public Ball(int x, int y, int wid, int ht, int xSpeed, int ySpeed, Color c) {
		super(x, y, wid, ht, c);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	   
   //add the set methods
   public void setXSpeed(int speed) {
	   xSpeed = speed;
   }
   public void setYSpeed(int speed) {
	   ySpeed = speed;
   }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   super.draw(window, Color.WHITE);

      setX(getX()+xSpeed);
		//setY
      setY(getY() + ySpeed);
      super.draw(window, Color.RED);
		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{
		try {
			Ball b = (Ball) obj;
			return (b.getXSpeed() == this.getXSpeed() && b.getYSpeed() == this.getYSpeed());
		} finally {
			return false;
		}
	}   

   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	public int getYSpeed() {
		return ySpeed;
	}
   //add a toString() method
}