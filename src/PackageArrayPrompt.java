

public class PackageArrayPrompt {

	public static void main(String[] args) {
		Package[] packages = new Package[3];
		for (int i = 0; i < packages.length; i++) {
			packages[i] = getPackage();
		}

		for (Package p : packages) {
			System.out.println(p);
		}

	}

	public static Package getPackage() {
		Package p = new Package();

		System.out.println("\nUnesi sirinu paketa: ");
		p.setWidth(TextIO.getDouble());

		System.out.println("Unesi duzinu paketa: ");
		p.setLenght(TextIO.getDouble());

		System.out.println("Unesi visinu paketa: ");
		p.setHeight(TextIO.getDouble());

		System.out.println("Unesi tezinu paketa: ");
		p.setWeight(TextIO.getDouble());

		System.out.printf("Cijena paketa je %f KM", p.getPrice());

		return p;
	}

}
