
public class AvionPrompt {

	public static void main(String[] args) {
	
		Avion a = new Avion();
		Package [] packages = a.getPackage();
		
		for (int i = 0; i < a.getPackage().length; i++) {
			a.getPackage()[i] = getPackage();
		}

		for (Package p : a.getPackage()) {
			System.out.println(p);
		}

	}
	
	public static Package getPackage() {
		Package p = new Package();

		System.out.println("\nUnesi sirinu paketa: ");
		p.setWidth(TextIO.getDouble());

		System.out.println("Unesi duzinu paketa: ");
		p.setLenght(TextIO.getDouble());

		System.out.println("Unesi tezinu paketa: ");
		p.setHeight(TextIO.getDouble());

		System.out.println("Unesi tezinu paketa: ");
		p.setWeight(TextIO.getDouble());

		System.out.printf("Cijena paketa je %f KM", p.getPrice());

		return p;
	}

}
