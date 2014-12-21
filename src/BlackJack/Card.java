package BlackJack;
/*
 * Clasa karta
 */
public class Card {

	private int num;
	private int sign;
	private int value;
	
	/**
	 * Konstruktor koji kreira kartu
	 */
	public Card ( int broj){

		
		this.num= broj %13;
		//this.num++;
		
		if( this.num == 1){
			this.value = 11;
		} else if (this.num >= 10){
			this.value = 10;
		} else {
			this.value=this.num;
		}
		
		if ( this.num>=11){
			this.num++;
		}
		
		this.sign=num/13;
		
	/**
	 * Konstruktor koji kopira jedan objekat u drugi
	 */
	}
	
	public Card (Card other){
		this.num=other.num;
		this.sign=other.sign;
		this.value=other.value;
	}
	
	/**
	 * Getter koji vraca vrijednost karte
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * Metoda to String varaca sve vrijednosti iz clase ispisane kao String
	 */
	public String toString(){
		String str ="";
		str += "Karta: " +this.num;
		str += "\nZnak: " +this.sign; 
		str += "\nVrijednost: "+this.value+"\n";
		return str;
	}
	
}
