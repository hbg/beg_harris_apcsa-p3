//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables

   public SpeedUpBall()
   {

	   this(0, 0);
   }

   public SpeedUpBall(int x, int y)
   {

	   super(x, y, 0, 0);
   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {

	   super(x, y, xSpd, ySpd);
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, xSpd, ySpd);

   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {

	   super(x, y, wid, ht, xSpd, ySpd, col);


   }

   public void setXSpeed( int xSpd )
   {


	   super.setXSpeed(xSpd);

   }

   public void setYSpeed( int ySpd )
   {

	   super.setYSpeed(ySpd);


   }
}

