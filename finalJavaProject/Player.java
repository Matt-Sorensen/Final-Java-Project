package finalJavaProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;

	Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	public void describe() {
		System.out.println(name);
		System.out.println();
		System.out.println("This player has the following cards in their hand:");
		System.out.println();
		for (Card card : hand) {
			System.out.println(card.describe());
		}
	}

	public Card flip() {
		Card card = hand.remove(0); 
		return card;
	}
	
	public void draw(Deck deck) {
		Card card = deck.draw();
		hand.add(card);
	}
	
	public void incrementScore() {
		score += 1;
	}
	
}
