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
		String[] ranks = new String[]{"A","B","C"};
		String[] suits =  new String[]{"Giraffes","Lions"};
		int[] points =  {2,1,6};
		Deck deck = new Deck(ranks, suits, points);
		deck.deal();
		System.out.println(deck);
	}
}
