package BlackJack;
/*
 * Zadaci za samostani rad
 */

public class HandTest {
	public static void main(String[] args) {
		
		Deck cards = new Deck();
		
		Hand player = new Hand();
		Hand dealer = new Hand();
		
//		System.out.println("Igraceva prva karta: " + "\n"+ player.addCard(cards.getNext()).getValue());
//		System.out.println("Igraceva druga karta: " + "\n"+ player.addCard(cards.getNext()).getValue());
		
		// Nisam znala dalje - Pogledala malo kod Gordana 
		
		int sumP;
		int sumD;
		int odgovor;

		do {
			
			Card kartaP = cards.getNext();
			System.out.println("Karta igraca je: " + kartaP.toString());
			player.addCard(kartaP);
			sumP = player.getSum();
			
			Card kartaD = cards.getNext();
			System.out.println("Karta dealera je: " + kartaD.toString());
			dealer.addCard(kartaD);
			sumD = dealer.getSum();
			
			System.out.println("Unesite '1' ako zelite sljedecu kartu: ");
			odgovor = TextIO.getlnInt();
			
			if ( sumP>21){
				System.out.println("Igrac je izgubio!");
			} else if (sumD>21){
				System.out.println("Dealer je izgubio!");
			} else if ( (sumP=sumD)==21){
				System.out.println("Oba igraca su pobijedila");
			} else {
				System.out.println("Nerjeseno!");
			}
			
		} while  ( odgovor == 1);
		
		
		

	}

}
