package BlackJack;

public class Card {

	private int num;
	private int sign;
	private int value;
	
	public Card ( int num){
//		this.num = broj % 14 + broj/14;
//		if ((broj % 14 + broj/14) >=10){
//    	this.num++;
//		}
		
		this.num= num %13;
		this.num++;
		
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
		
		
//		int z =num/14;
//		if ( z == 0){
//			this.sign = 'S';
//		} else if ( z == 1){
//			this.sign = 'P';
//		} else if ( z == 2){
//			this.sign = 'K';
//		} else {
//			this.sign = 'T';
//		}
		
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString(){
		String str ="";
		str += "Karta: " +this.num;
		str += "\nZnak: " +this.sign; 
		str += "\nVrijednost: "+this.value+"\n";
		return str;
	}
	
}
