package finalJavaProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();
	
	Deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numberNames = {"Two","Three","Four","Five","Six","Seven",
				  				"Eight","Nine","Ten","Jack","Queen", "King","Ace"};
	
		for(String suit : suits) {
			for(int i = 0; i < numberNames.length; i++) {
				String name = numberNames[i] + " of " + suit;
				int value = i + 2;
				this.cards.add(new Card(name, value));
			}	
		}
	}
	
	public Card draw() {
		Card card = this.cards.remove(0); 
		return card;
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}
}
