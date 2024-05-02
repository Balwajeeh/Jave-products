import java.security.SecureRandom;
public class DeckOfCards {
	private static final SecureRandom randomNumber=new SecureRandom();
	private static final int NUMBER_OF_CARDS=52;
	private Card[]deck=new Card[NUMBER_OF_CARDS];
	private int currentCard=0;
	public DeckOfCards() {
		String[] faces= {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[]suits= {"Hearts", "Diamonds", "Clubs", "Spades"};
		for (int count =0; count< deck.length; count++) {
			deck[count]=
					new Card
		}
			
	}

}
