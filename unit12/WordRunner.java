//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		ArrayList<Word> list = new ArrayList<Word>();
		for (int i=0; i<size; i++)
		{
			String s = (String) file.nextLine();
			Word w = new Word(s);
			list.add(w);
		}
		Collections.sort(list);
		for (int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		











	}
}