
public class PackageTest {
public static void main(String[] args) {
	
	Package p = new Package();
	

	System.out.println("Unesi sirinu paketa: ");
	p.setWidth(TextIO.getDouble());

	System.out.println("Unesi duzinu paketa: ");
	p.setLenght(TextIO.getDouble());

	System.out.println("Unesi visinu paketa: ");
	p.setHeight(TextIO.getDouble());
	
	System.out.println("Unesi tezinu paketa: ");
	p.setWeight(TextIO.getDouble());
	
	System.out.printf("Cijena paketa je %f KM\n",  p.getPrice());
}
}
