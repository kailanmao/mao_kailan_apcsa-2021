//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		System.out.println(new StringEquality("hello" , "goodbye"));
		System.out.println(new StringEquality("ABC" , "CBA"));
		System.out.println(new StringEquality("ABC" , "ABC"));
		System.out.println(new StringEquality("Same" , "Same"));
		System.out.println(new StringEquality("three" , "four"));
	}
}