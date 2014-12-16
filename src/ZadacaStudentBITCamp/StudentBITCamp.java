package ZadacaStudentBITCamp;

/*
 * Zadaci za samostalni rad
 * Ucionica BitCampa
 */

public class StudentBITCamp {
	public static void main(String[] args) {

		Student[][] ucionica = new Student[6][4];

		// napraviMatricu();
		popuniUcionicu(ucionica);
		print(ucionica);

	}

	/**
	 * Funkcija koja popunjava dvodimenzionalni niz ucionisa sa objektima
	 * student
	 * 
	 * @param ucionica
	 *            = dvodimenzionalni niz ucionza sa imenima i prezimenima
	 *            studenata
	 */

	// ne radi mi ovo kako treba, a ne mogu da skontam gresku

	public static void popuniUcionicu(Student[][] ucionica) {

		for (int i = 0; i < ucionica.length; i++) {
			for (int j = 0; i < ucionica[j].length; j++) {

				System.out.println("Unesi ime i prezime studenta: ");

				String ime = TextIO.getlnString();
				String prezime = TextIO.getlnString();
				ucionica[i][j] = new Student(ime, prezime);

			}
			System.out.println();
		}
	}

	/**
	 * Funkcija koja ispisuje - dvodimenzionalni niz objekata - ucionica
	 * 
	 * @param ucionica
	 */

	public static void print(Student[][] ucionica) {

		for (int i = 0; i < ucionica.length; i++) {
			for (int j = 0; i < ucionica[j].length; j++) {
				System.out.print(ucionica[i][j].toString());
			}
			System.out.println();
		}
	}

	// private static String[][] napraviMatricu() {
	// String [][] bitCamp = new String [6][4];
	// return bitCamp;
	// }
}
