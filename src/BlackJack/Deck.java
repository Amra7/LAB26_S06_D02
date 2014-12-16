package BlackJack;


public class Deck {

	private Card[] cards;
	private int brojac =0;
	
	public int getBrojac() {
		return brojac;
	}

	public Deck() {
		cards = new Card[52];
		for (int i=0; i<52; i++){
			cards[i] = new Card(i);
		}
		suffleCards();
	}
	
	public String toString(){
		String str = "";
		for (int i=0; i<52; i++){
			str += cards[i].toString();

		}
		return str;
	}
	
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

	private int random(int i, int length) {
		return (int)(i+ Math.random()* cards.length);
	}
	
	public Card getNext(){
		if ( brojac < 52) {
			return cards[brojac++];
		} else {
			throw new IllegalArgumentException("Nema vise karata!");
		}		
	}
	
	
}
