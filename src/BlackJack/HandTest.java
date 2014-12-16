package BlackJack;
/*
 * Zadaci za samostani rad
 */

public class HandTest {
	public static void main(String[] args) {
		
		Deck cards = new Deck();
		
		Hand player = new Hand();
		Hand dealer = new Hand();
		
		System.out.println("Igraceva prva karta: " + "\n"+ player.addCard(cards.getNext()).getValue());
		System.out.println("Igraceva druga karta: " + "\n"+ player.addCard(cards.getNext()).getValue());
		
		// Nisam znala dalje
		

	}

}
