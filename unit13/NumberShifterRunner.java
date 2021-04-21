//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		NumberShifter test = new NumberShifter();
		int[] random = test.makeLucky7Array(6);
		test.shiftEm(random);
		
		random = test.makeLucky7Array(4);
		test.shiftEm(random);
	}
}



