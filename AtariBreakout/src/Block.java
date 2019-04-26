//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color = Color.black;

	public Block()
	{
		setPos(0, 0);
		setColor(Color.black);
		setDimensions(0, 0);
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y) {
		setPos(x,y);
		setColor(Color.black);
		setDimensions(0, 0);
	}
	public Block(int x, int y, int w, int h) {
		setPos(x,y);
		setColor(Color.black);
		setDimensions(w, h);
	}
	
	public Block(int x, int y, int width, int height, Color color) {
		setPos(x, y);
		setColor(color);
		setDimensions(width, height);
	}
	
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
   public void setWidth(int w) {
		width = w;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public void setDimensions(int w, int h) {
		setWidth(w);
		setHeight(h);
	}

   public void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		try {
			Block block = (Block) obj;
			if (block.getColor().equals(getColor()) && block.getX() == this.getX() && block.getY() == this.getY() && block.getHeight() == this.getHeight() && block.getWidth() == this.getWidth()) return true;
		} finally {
			
		}	
		return false;
	}

	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		this.xPos = x;
		this.yPos = y;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.xPos = x;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		this.yPos = y;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return xPos;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return yPos;
	} 
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public Color getColor() {
		return color;
	}
	public int[] getDimensions() {
		return new int[]{width, height};
	}
   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	public String toString() {
		return String.format("X: %s, Y: %s, WIDTH: %s, HEIGHT: %s, COLOR: %s", xPos, yPos, width, height, color);
	}
}