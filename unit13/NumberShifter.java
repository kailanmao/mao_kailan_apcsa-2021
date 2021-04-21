//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] out = new int[size];
		for (int i=0; i<size; i++)
		{
			out[i] = (int)(Math.random()*11);
		}
		return out;
	}
	public static void shiftEm(int[] array)
	{
		for (int i=0; i<array.length; i++)
		{
			int seven = i;
			for (int j=i+1; j<array.length; j++)
			{
				if (array[j]==7)
				{
					seven = j;
				}
				if(seven != i) {
			         array[seven] = array[i];
			         array[i] = 7; 
				}
			}
		}
	}
}