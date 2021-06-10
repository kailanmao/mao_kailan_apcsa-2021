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
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}
	

	public List<Alien> getList()
	{
		return aliens;
	}
	
	public void drawEmAll( Graphics window )
	{
		for (int i=0; i<aliens.size(); i++)
		{
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		for (int i=0; i<aliens.size(); i++)
		{
			aliens.get(i).setX(aliens.get(i).getX()+5);
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i=0; i<aliens.size(); i++)
		{
			for (int j=0; j<shots.size(); j++)
			{
				if (aliens.get(i).getX()==shots.get(j).getX() && aliens.get(i).getY()==shots.get(j).getY())
				{
					aliens.remove(i);
				}
			}
		}
	}

	public String toString()
	{
		return "" + aliens.size();
	}
}
