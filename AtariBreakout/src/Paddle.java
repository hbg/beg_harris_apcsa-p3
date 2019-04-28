//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	  super(10,10);
      speed=2;
   }
   public Paddle(int x, int y) {
	   super(x, y);
	   speed=2;
   }
   public Paddle(int x, int y, int speed) {
	   super(x, y);
	   this.speed = speed;
   }
   public Paddle(int x, int y, int wid, int ht) {
	   this(x, y, 5, wid, ht);
   }
   public Paddle(int x, int y, int speed, int width, int height) {
	   super(x, y, width, height, Color.BLACK);
	   this.speed=speed;
   }
   public Paddle(int x, int y, int width, int height, Color c) {
	   super(x, y, width, height, c);
	   speed = 5;
   }
   public Paddle(int x, int y, int width, int height, Color c, int speed) {
	   super(x, y, width, height, c);
	   this.speed = speed;
   }

   //add the other Paddle constructors










   public void moveUpAndDraw(Graphics window)
   {
	   super.draw(window, Color.WHITE);
	   super.setY(getY() + speed);
	   super.draw(window, Color.RED);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   super.draw(window, Color.WHITE);
	   super.setY(getY() - speed);
	   super.draw(window, Color.RED);
   }
   public void moveRightAndDraw(Graphics window)
   {
	   super.draw(window, Color.WHITE);
	   super.setX(getX() + speed);
	   super.draw(window, Color.RED);
   }
   public void moveLeftAndDraw(Graphics window)
   {
	   super.draw(window, Color.WHITE);
	   super.setX(getX() - speed);
	   super.draw(window, Color.RED);
   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   //add a toString() method
   public String toString() {
	   return super.toString() + ", Speed: " + speed;
   }
}