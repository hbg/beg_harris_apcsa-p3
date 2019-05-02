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

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		boolean found = false;
		for (Ammo a : ammo)
			if (a.getX() == al.getX()) found = true;
		if (!found) ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		cleanEmUp(window);
		for (Ammo am : ammo)
			am.draw(window);
		moveEmAll();
		
	}

	public void moveEmAll()
	{
		for (Ammo am : ammo) {
			am.move("UP");
		}
	}

	public void cleanEmUp(Graphics window)
	{
		List<Ammo> removable = new ArrayList<Ammo>();
		for (Ammo a : ammo) {
			a.remove(window);
			if (a.getY() <= 50) removable.add(a);
		}
		ammo.removeAll(removable);
	}
	public void remove(Ammo a) {
		ammo.remove(a);
	}
	public void removeAll(ArrayList<Ammo> a) {
		ammo.removeAll(a);
	}
	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		String s ="";
		for (Ammo a : ammo) s+=a;
		return s;
	}
}
