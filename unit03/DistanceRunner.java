//(c) A+ Computer Science
//www.apluscompsci.com

//Name - KAILAN M
//Date - 2/3/21
//Class - AP CSA
//Lab  - DISTANCE

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		Scanner keyboard = new Scanner(in);

		out.print("Enter x1 :: ");
		int x1 = keyboard.nextInt();

		out.print("Enter y1 :: ");
		int y1 = keyboard.nextInt();

		out.print("Enter x2 :: ");
		int x2 = keyboard.nextInt();
		
		out.print("Enter y1 :: ");
		int y2 = keyboard.nextInt();
		
		Distance d = new Distance(x1,y1,x2,y2);
		d.calcDistance();
		d.print();
	}
}
