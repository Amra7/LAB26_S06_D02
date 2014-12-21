package BlackJack;
/**
 * Klasa Spil karata
 */
public class Deck {

	private Card[] cards;
	private int brojac =0;
	
	public int getBrojac() {
		return brojac;
	}
 
	/**
	 * Konstriktor koji kreira spil karata i mjesa karte
	 */
	public Deck() {
		cards = new Card[52];
		for (int i=0; i<52; i++){
			cards[i] = new Card(i);
		}
		suffleCards();
	}
	
	/**
	 * Metoda to String varaca sve vrijednosti iz clase ispisane kao String
	 */
	public String toString(){
		String str = "";
		for (int i=0; i<52; i++){
			str += cards[i].toString();

		}
		return str;
	}
	
	/**
	 * Metoda koja mjesa karte
	 */
	public void suffleCards (){
		
		Card temp;
		for (int i=0; i<cards.length; i++){
			
			int idx1= random(0,cards.length);
			int idx2= random(0, cards.length);
			
			temp = cards[idx1];
			cards[idx1] = cards[idx2];
			cards[idx2] = temp;
		}
	}
	
	/**
	 * Metoda koja izvlaci naizmjenicno karte iz spila
	 */

	private int random(int i, int length) {
		return (int)(i+ Math.random()* cards.length);
	}
	
	/**
	 * Metoda koja daje sljedecu kartu iz spila
	 */
	public Card getNext(){
		if ( brojac < 52) {
			return cards[brojac++];
		} else {
			throw new IllegalArgumentException("Nema vise karata!");
		}		
	}
	
	
}
