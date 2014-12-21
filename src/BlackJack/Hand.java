package BlackJack;
/*
 *Zadaci za samostalni rad
 */
public class Hand {

	private Card[] hand;
	private int counter;
	private int numAces;

	/**
	 * Konstruktor koji kreira ruku
	 */
	public Hand() {
		hand = new Card[counter];
		// for (int i=0; i<hand.length; i++){
		// hand[i]=new Card(i);
		// }
		int counter = 0;
		int numAces = 0;
	}
    /*
     *  Metoda koja dodaje kartu
     */
	public Card addCard(Card card) {  
	//	int counter =0;
		Card [] temp = new Card[counter];
		for ( int i=0; i<hand.length; i++){
			hand[i] = card;
            if (card.getValue() == 11) {
    			numAces++;
    		}
            counter++;	
		}
		
		return card;
	}
    
	/**
	 * Metoda koja vraca sumu karata u ruci
	 * Ako je jedna od karata As i suma je veca od 21 smanjuje se vrijednost sume za 10
	 * Ako su je suma i dalje veca od 21 i dvije karte su As smanjuje se za jos 10
	 */
	public int getSum() {
		int sum = 0;
		for (int i = 0; i < hand.length; i++) { // prolazi kroz cijeli niz i svaku put dodaje vrijednost vrijednost karte koja je psotavljena na hand[0]
			sum += hand[i].getValue();
			if (sum > 21 && numAces > 1) {
				sum = sum - 10;
//				if (sum > 21 && numAces > 1) {
//					sum = sum - 10;
//				}
			}

		}
		return sum;
	}

	/*
	 * Metoda to String varaca sve vrijednosti iz clase ispisane kao String
	 */
	public String toString() {
		String str = "";
		for (int i = 0; i < hand.length; i++) {
			str += hand[i].getValue();
		}
		return str;
	}

	// public void clear(){
	//
	// }
}
