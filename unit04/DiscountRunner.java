//(c) A+ Computer Science
//www.apluscompsci.com

//Name - KAILAN M
//Date - 2/7/21
//Class - AP CSA
//Lab  - DISCOUNT

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		System.out.printf( "%.3f\n", Discount.getDiscountedBill(amt) );
		

	}
}
