//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   //constructors
   public BlinkyBall()
   {
		super();
   }

   public BlinkyBall(int x, int y)
   {

	   this(x, y, 0, 0, 0, 0);

   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {

	   this(x, y, wid, ht, 0, 0);

   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {

	   this(x, y, wid, ht, Color.black, xSpd, ySpd);

   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {

	   super(x, y, wid, ht, xSpd, ySpd, col);


   }

   public Color randomColor()
   {
   	int r = (int) Math.random() * 255;		//use Math.random()
 		int g = (int) Math.random() * 255;
 		int b = (int) Math.random() * 255;
 		return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window)
   {
	   
	   super.setColor(this.randomColor());
	   this.moveAndDraw(window);

   }
}