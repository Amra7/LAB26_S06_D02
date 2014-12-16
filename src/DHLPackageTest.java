
public class DHLPackageTest {
public static void main(String[] args) {
	
	DHLPackage dhlp = new DHLPackage();
	
	System.out.println("Unesi sirinu paketa: ");
	dhlp.setWidth(TextIO.getDouble());

	System.out.println("Unesi duzinu paketa: ");
	dhlp.setLenght(TextIO.getDouble());

	System.out.println("Unesi visinu paketa: ");
	dhlp.setHeight(TextIO.getDouble());
	
	System.out.println("Unesi tezinu paketa: ");
	dhlp.setWeight(TextIO.getDouble());
	
	System.out.printf("Cijena paketa je %f KM",  dhlp.getPrice());
	
	System.out.printf("\nCijena paketa je %f KM\n",  dhlp.getDimensionalWeight());
	
	System.out.printf("Cijena dostave je: %f", dhlp.getWeight());
	
}
}
