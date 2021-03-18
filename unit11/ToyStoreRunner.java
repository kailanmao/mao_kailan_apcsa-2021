//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test = new ToyStore();
		test.loadToys("teddy hi hi teddy jerry hi jerry");
		System.out.println(test.getThatToy("teddy"));
		System.out.println(test.getThatToy("carl"));
		System.out.println(test.getMostFrequentToy());
		System.out.println(test);
		test.sortToysByCount();
		System.out.println(test);
		

	}
}