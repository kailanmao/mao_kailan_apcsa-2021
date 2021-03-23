//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Monster 1 Name: ");
		String name1 = keyboard.next();
		System.out.println("Monster 1 Size: ");
		int size1 = keyboard.nextInt();
		
		//instantiate monster one
		Skeleton one = new Skeleton(name1, size1);
		
		//ask for name and size
		System.out.println("Monster 2 Name: ");
		String name2 = keyboard.next();
		System.out.println("Monster 2 Size: ");
		int size2 = keyboard.nextInt();
		
		//instantiate monster two
		Skeleton two = new Skeleton(name2, size2);
		
		System.out.println(one);
		System.out.println(two);
		System.out.println("Is one bigger? " + one.isBigger(two));
		System.out.println("Same name? " + one.namesTheSame(two));
	}
}