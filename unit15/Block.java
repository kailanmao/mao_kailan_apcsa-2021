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

	private Color color;

	public Block()
	{
		xPos = 0;
		yPos = 0;
		width = 1;
		height = 1;
		color = new Color(0,0,0);
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int w, int height, Color c)
	{
		setPos(x,y);
		setWidth(w);
		setHeight(height);
		setColor(c);
	}
	public Block(int x, int y, int w, int height)
	{
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(height);
	}
	public Block(int x, int y)
	{
		setX(x);
		setY(y);
	}
	public Block(int x, int y, Color c)
	{
		setX(x);
		setY(y);
		setColor(c);
	}
	
   //add the other set methods
	public void setPos(int x, int y)
	{
		setX(x);
		setY(y);
	}
    public void setX(int x)
	{
		xPos = x;
	}
	public void setY(int y)
	{
		yPos = y;
	}
	public void setWidth(int w)
	{
		width = w;
	}
	public void setHeight(int h)
	{
		height = h;
	}
    public void setColor(Color col)
   {
	   color = new Color(col.getRed(), col.getGreen(), col.getBlue());
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
		Ball other = (Ball)obj;
		if (super.equals(other) && getX() == other.getX() && getY() == other.getY()
				&& getWidth() == other.getWidth() && getHeight() == other.getHeight()
				&& getColor() == other.getColor())
		{
			return true;
		}
		return false;
	}   

   //add the other get methods
	public int getX()
	{
		return xPos;
	}
    public int getY()
    {
    	return yPos;
    }
    public int getWidth()
    {
    	return width;
    }
    public int getHeight()
    {
    	return height;
    }
    public Color getColor()
    {
    	return color;
    }
    
   //add a toString() method  - x , y , width, height, color
	public String toString()
	{
		return "x: " + getX() + "\ny: " + getY() + "\nwidth: " + getWidth()
		+ "\nheight: " + getHeight() + "\ncolor: " + getColor().getRed()
		+ " " + getColor().getGreen() + " " + getColor().getBlue();
	}
}