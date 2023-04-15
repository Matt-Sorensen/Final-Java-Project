package finalJavaProject;

public class App {

	public static void main(String[] args) {

		Deck deck = new Deck();
		
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");

		deck.shuffle();

		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}

		System.out.println("=================================================");
		System.out.println("Welcome to the game of War!!");
		System.out.println("=================================================");
		System.out.println();
		
		player1.describe();
		
		System.out.println("=================================================");
		
		player2.describe();
		
		System.out.println("=================================================");
		System.out.println();
		System.out.println("Let's begin!");
		System.out.println();
		System.out.println("=================================================");

		
		for (int i = 0; i < 26; i++) {
			Card p1Flip = player1.flip();
			Card p2Flip = player2.flip();
			
			System.out.println(player1.getName() + " plays " + p1Flip.describe());
			System.out.println(player2.getName() + " plays " + p2Flip.describe());
	
			if (p1Flip.getValue() > p2Flip.getValue()) {
				player1.incrementScore();
				System.out.println();
				System.out.println("			" + player1.getName() + " wins round");
				System.out.println(player1.getName() + " - Score: " + player1.getScore());
				System.out.println(player2.getName() + " - Score: " + player2.getScore());
				System.out.println("=================================================");
			
			} else if (p1Flip.getValue() < p2Flip.getValue()) {
				player2.incrementScore();
				System.out.println();
				System.out.println("			" + player2.getName() + " wins round");				
				System.out.println(player1.getName() + " - Score: " + player1.getScore());
				System.out.println(player2.getName() + " - Score: " + player2.getScore());				
				System.out.println("=================================================");
			
			} else {
				System.out.println();
				System.out.println("				Draw");
				System.out.println(player1.getName() + " - Score: " + player1.getScore());
				System.out.println(player2.getName() + " - Score: " + player2.getScore());
				System.out.println("=================================================");
			}
		}

		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " Wins!");
			System.out.println();
			System.out.println("Final Score");
			System.out.println(player1.getName() + ": " + player1.getScore());
			System.out.println(player2.getName() + ": " + player2.getScore());
		
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName() + " Wins!");
			System.out.println();
			System.out.println("Final Score");
			System.out.println(player1.getName() + ": " + player1.getScore());
			System.out.println(player2.getName() + ": " + player2.getScore());
		
		} else {
			System.out.println("Game Ends With a Draw!");
			System.out.println();
			System.out.println("Final Score" );
			System.out.println(player1.getName() + ": " + player1.getScore());
			System.out.println(player2.getName() + ": " + player2.getScore());
		}

	}
}
