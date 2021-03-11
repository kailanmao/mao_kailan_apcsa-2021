/**
 * This class provides a convenient way to test shuffling methods.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 8;

	/**
	 */

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		ArrayList<Integer> values1 = new ArrayList<Integer>();
		for (int i = 0; i < values1.size(); i++) {
			values1.set(i, i);
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.size(); k++) {
				System.out.print(" " + values1.get(k));
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		ArrayList<Integer> values2 = new ArrayList<Integer>();
		for (int i = 0; i < values2.size(); i++) {
			values2.set(i,i);
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.size(); k++) {
				System.out.print(" " + values2.get(k));
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(ArrayList<Integer> values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		ArrayList<Integer> shuffled = new ArrayList<Integer>();
		for (int i=0; i< (values.size()+1)/2; i++)
		{
			shuffled.add(values.get(i));
		}
		int k = 1;
		for (int i = (values.size()+1)/2; i<values.size();i++)
		{
			shuffled.add(k, values.get(i));
			k = k+2;
		}
		for (int i = 0; i<values.size(); i++)
		{
			values.set(i, shuffled.get(i));
		}
		
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(ArrayList<Integer> values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int random;
		int randomCard;
		for (int i = values.size()-1; i>0; i--)
		{
			random = (int) (Math.random()*i);
			randomCard = values.get(random);
			values.set(random, values.get(i));
			values.set(i, randomCard);
		}
	}
}
