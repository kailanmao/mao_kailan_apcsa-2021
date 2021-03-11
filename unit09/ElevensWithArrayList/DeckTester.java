/**
 * This is a class that tests the Deck class.
 * 
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		ArrayList<String> oneRanks = new ArrayList<String>
		(Arrays.asList("queens", "kings", "jacks"));
		
		ArrayList<String> oneSuits = new ArrayList<String>
		(Arrays.asList("spades", "clubs", "hearts", "diamonds"));
	
		ArrayList<Integer> oneValues = new ArrayList<Integer>
		(Arrays.asList(12,13,11));

		Deck one = new Deck(oneRanks, oneSuits, oneValues);
		System.out.println(one);
		System.out.println(one.isEmpty());
		one.deal();
		one.deal();
		System.out.println(one);
		
		ArrayList<String> twoRanks = new ArrayList<String>
		(Arrays.asList("ones", "twos", "threes", "fours"));
		ArrayList<String> twoSuits = new ArrayList<String>
		(Arrays.asList("elephants", "giraffe"));
		ArrayList<Integer> twoValues = new ArrayList<Integer>
		(Arrays.asList(1,2,3,4));
		Deck two = new Deck(twoRanks, twoSuits, twoValues);
		System.out.println(two);
		System.out.println(two.isEmpty());
		two.deal();
		two.deal();
		System.out.println(two);
		
		ArrayList<String> threeRanks = new ArrayList<String>();
		ArrayList<String> threeSuits = new ArrayList<String>
		(Arrays.asList("spades", "clubs", "hearts", "diamonds"));
		ArrayList<Integer> threeValues = new ArrayList<Integer>();
		Deck three = new Deck(threeRanks, threeSuits, threeValues);
		System.out.println(three);
		System.out.println(three.isEmpty());
		three.deal();
		three.deal();
		System.out.println(three);
		
		/* activity 4 */
		ArrayList<String> fourRanks = new ArrayList<String>
		(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"));
		ArrayList<String> fourSuits = new ArrayList<String>
		(Arrays.asList("Spades", "Clubs", "Hearts", "Diamonds"));
		ArrayList<Integer> fourValues = new ArrayList<Integer>
		(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		Deck four = new Deck(fourRanks, fourSuits, fourValues);
		System.out.println(four);
		System.out.println();

		four.shuffle();
		System.out.println(four);
		System.out.println();

		four.shuffle();
		System.out.println(four);


		
	}
}
