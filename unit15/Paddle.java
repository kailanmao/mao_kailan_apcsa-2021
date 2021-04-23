//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed = 5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y)
   {
	   super(x,y);
   }
   public Paddle(int x, int y, int s)
   {
	   super(x,y);
	   speed = s;
   }
   public Paddle(int x, int y, Color c, int s)
   {
	   super(x,y,c);
	   speed = s;
   }
   public Paddle(int x, int y, int w, int h, Color c, int s)
   {
	   super(x,y,w,h,c);
	   speed = s;
   }
   public Paddle(int x, int y, int w, int h, int s)
   {
	   super(x,y,w,h);
	   speed = s;
   }



   public void moveUpAndDraw(Graphics window)
   {
	   setY(getY() - speed);
	   draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   setY(getY() - speed);
	   draw(window);
   }

   //add get methods
   public int getSpeed()
   {
	   return speed;
   }
   
 
   //add a toString() method
   public String toString()
   {
	   return "x: " + getX() + "\ny: " + getY() + "\nwidth: " + getWidth()
		+ "\nheight: " + getHeight() + "\ncolor: " + getColor().getRed()
		+ " " + getColor().getGreen() + " " + getColor().getBlue() + "\nspeed: " + getSpeed();
   }
}