package BlackJack;
/*
 *Zadaci za samostalni rad
 */
public class Hand {

	private Card[] hand;
	private int counter;
	private int numAces;

	/*
	 * Konstruktor koji kreira ruku
	 */
	public Hand() {
		hand = new Card[52];
		// for (int i=0; i<hand.length; i++){
		// hand[i]=new Card(i);
		// }
		int counter = 0;
		int numAces = 0;
	}
    /*
     *  Metoda koja dodaje kartu
     */
	public Card addCard(Card newCard) {   //ovaj dio ni sama ne znam kako sam napisala treba mi obajasnjenje
		for ( int i=0; i<hand.length; i++){
			hand[i] = new Card (newCard);
            counter++;	
            if (newCard.getValue() == 11) {
    			numAces++;
    		}
		}
		
		return newCard;
	}
    
	/*
	 * Metoda koja vraca sumu karata u ruci
	 */
	public int getSum( Card newCard) {
		int sum = 0;
		for (int i = 0; i < hand.length; i++) {
			sum += hand[i].getValue();
			if (sum > 21 && numAces > 1) {
				sum = sum - 10;
				if (sum > 21 && numAces > 1) {
					sum = sum - 10;
				}
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
