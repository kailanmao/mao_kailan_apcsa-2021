//(c) A+ Computer Science
//www.apluscompsci.com
import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		 Scanner keyboard = new Scanner(in);

	     System.out.print("Enter a String :: ");
	     String word = keyboard.next();
	     System.out.println(new StringOddOrEven(word));
	}
}