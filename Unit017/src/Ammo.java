//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,0);
	}

	public Ammo(int x, int y)
	{
		//add code
		super(x, y, 10, 10);
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x, y, 10, 10);
		speed = s;
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

	public void draw( Graphics window )
	{
		//add code to draw the ammo

		window.setColor(Color.YELLOW);
		window.fillRect(getX(),getY(),getWidth(),getHeight());
		window.setColor(Color.black);
	}
	public void remove( Graphics window )
	{
		//add code to draw the ammo

		window.setColor(Color.black);
		window.fillRect(getX(),getY(),getWidth(),getHeight());
	}
	
	public void move( String direction )
	{
		//add code to draw the ammo
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

	public String toString()
	{
		return super.toString();
	}
}
