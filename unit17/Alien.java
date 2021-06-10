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
		this(0,0,30,30,1);
		try
		{
			image = ImageIO.read(new File("C:\\Users\\kaila_66he3mr\\Downloads\\ap csa\\mao_kailan_apcsa-2021\\Unit17_Assignments-starfighter\\images\\alien.JPG"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("file error");
		}
	}

	public Alien(int x, int y)
	{
		//add code here
		super(x,y);
		speed = 1;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\kaila_66he3mr\\Downloads\\ap csa\\mao_kailan_apcsa-2021\\Unit17_Assignments-starfighter\\images\\alien.JPG"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("file error");
		}
	}

	public Alien(int x, int y, int s)
	{
		//add code here
		super(x,y);
		speed = s;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\kaila_66he3mr\\Downloads\\ap csa\\mao_kailan_apcsa-2021\\Unit17_Assignments-starfighter\\images\\alien.JPG"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("file error");
		}
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\kaila_66he3mr\\Downloads\\ap csa\\mao_kailan_apcsa-2021\\Unit17_Assignments-starfighter\\images\\alien.JPG"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("file error");
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
	   if (direction.equals("LEFT"))
		{
			setX(getX()-speed);
		}
		if (direction.equals("RIGHT"))
		{
			setX(getX()+speed);
		}
		if (direction.equals("DOWN"))
		{
			setY(getY()+speed);
		}
		if (direction.equals("UP"))
		{
			setY(getY()-speed);
		}
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + " " + getSpeed();
	}
}
