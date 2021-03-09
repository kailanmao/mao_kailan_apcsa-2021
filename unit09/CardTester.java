/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card("5", "Spades", 5);
		Card two = new Card("Queen", "Hearts", 12);
		Card three = new Card("5", "Spades", 5);
		
		System.out.println(one.matches(three));
		System.out.println(one);
		System.out.println(two);
		System.out.println(two.matches(three));
		System.out.println(three.suit());
		System.out.println(three.rank());
		System.out.println(three.pointValue());
		
	}
}
