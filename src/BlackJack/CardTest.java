package BlackJack;

public class CardTest {
public static void main(String[] args) {
	
//	System.out.println("Unesi neku vrijednost od 0 do 52!");
//	
//	int broj = TextIO.getlnInt();
//	Card karta = new Card(broj);
//	
//	System.out.println(karta.toString());
	
	for ( int i=0; i<52; i++){
		Card karta = new Card(i);
		System.out.println(karta);
	}
}
}
