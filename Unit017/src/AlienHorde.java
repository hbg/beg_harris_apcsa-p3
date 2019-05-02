//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
		for (int i = 0; i < size; i++)
			aliens.add(new Alien(i*50,50,1));
	}

	public void add(Alien al)
	{

		aliens.add(al);
	}
	public boolean collide(Ammo a) {
		for (Alien alien : aliens)
			if (a.getX() >= alien.getX() && a.getX() + a.getWidth() <= alien.getX() + alien.getWidth() && a.getY() >= alien.getY() && a.getY() + a.getHeight() <= alien.getY() + alien.getHeight())
				return true;
		return false;
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien alien : aliens)
			alien.draw(window);
	}

	public void moveEmAll()
	{		
		for (Alien alien : aliens)
			alien.move("DOWN");
		if (aliens.get(0).getX()<=50) {
			//System.out.println("RIGHT");
			for (Alien alien : aliens)
				alien.move("RIGHT");
		}
		else {
			//System.out.println("STRANGE");
			for (int i=(aliens.size()-1); i>=0;i--)
				aliens.get(i).move("LEFT");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		List<Alien> removable = new ArrayList<Alien>();
		for (Ammo shot : shots)
			for (Alien alien : aliens)
				if (shot.getX()>=alien.getX() && shot.getX()+shot.getWidth()<=alien.getX()+alien.getWidth() && shot.getY()>=alien.getY() && shot.getY()+shot.getHeight()<=alien.getY()+alien.getHeight())
					{removable.add(alien);
					System.out.print("HIT");
					}
		aliens.removeAll(removable);
	}

	public String toString()
	{
		return super.toString();
	}
}
