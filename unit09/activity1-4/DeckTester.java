/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] oneRanks = {"queens", "kings", "jacks"};
		String[] oneSuits = {"spades", "clubs", "hearts", "diamonds"};
		int[] oneValues = {12, 13, 11};
		Deck one = new Deck(oneRanks, oneSuits, oneValues);
		System.out.println(one);
		System.out.println(one.isEmpty());
		one.deal();
		one.deal();
		System.out.println(one);
		
		String[] twoRanks = {"ones", "twos", "threes", "fours"};
		String[] twoSuits = {"elephant", "giraffe"};
		int[] twoValues = {1,2,3,4};
		Deck two = new Deck(twoRanks, twoSuits, twoValues);
		System.out.println(two);
		System.out.println(two.isEmpty());
		two.deal();
		two.deal();
		System.out.println(two);
		
		String[] threeRanks = new String[0];
		String[] threeSuits = {"spades", "clubs", "hearts", "diamonds"};
		int[] threeValues = new int[0];
		Deck three = new Deck(threeRanks, threeSuits, threeValues);
		System.out.println(three);
		System.out.println(three.isEmpty());
		three.deal();
		three.deal();
		System.out.println(three);
		
		/* activity 4 */
		String[] fourRanks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] fourSuits = {"Spades", "Clubs", "Hearts", "Diamonds"};
		int[] fourValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
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
