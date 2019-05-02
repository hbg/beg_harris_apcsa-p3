//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,30,30,0);
	}

	public Alien(int x, int y)
	{
		//add code here
		this(x, y, 0);
	}

	public Alien(int x, int y, int s)
	{
		//add code here
		this(x,y,30,30,s);
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			URL url = getClass().getResource("/images/alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println(e);
		}
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
	{
	   //add code here
	   switch (direction) {
		case "LEFT":
			super.setX(Math.max(this.getX() - this.getSpeed(), 0)); break;
		case "RIGHT":
			super.setX(Math.min(this.getX() + this.getSpeed(), 750)); break;
		case "UP":
			super.setY(Math.max(0, this.getY() - this.getSpeed())); break;
		case "DOWN":
			super.setY(Math.min(this.getY() + this.getSpeed(), 500)); break;
		}
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString();
	}
}
