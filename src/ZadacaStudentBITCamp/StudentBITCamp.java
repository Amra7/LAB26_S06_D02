package ZadacaStudentBITCamp;

/*
 * Zadaci za samostalni rad
 * Ucionica BitCampa
 */

public class StudentBITCamp {
	public static void main(String[] args) {


		UcioninicaBitCamp ucionica = new UcioninicaBitCamp ("Nasa ucionica");
		
		
		Student s1 = new Student("Jesenko"," Gavric");
		Student s2 = new Student("Sanela", " Grcic");
		Student s3 = new Student("Amra", " Poprzanovic");
		Student s4 = new Student("Gorjan", " Kalauzovic");
		Student s5 = new Student("Davor", " Stankovic");
		Student s6 = new Student("Emir", " Imamovic");
		Student s7 = new Student("Nedzad", " Hamzic");
		Student s8 = new Student("Haris", " Arifovic");
		Student s9 = new Student("Selma", " Tabakovic");
		Student s10 = new Student("Adnan", " Spahic");
		Student s11= new Student("Neldin", " Dzeko");
		Student s12 = new Student("Nermin", " Graca");
		Student s13 = new Student("Haris", " Krkalic");
		Student s14 = new Student("Gordan", " Sajevic");
		Student s15 = new Student("Edib", " Imamovic");
		Student s16 = new Student("Mustafa", " Admerovic");
		Student s17 = new Student("Nermin", " Vucinic");
		Student s18 = new Student("Mirza", " Becic");
		Student s19 = new Student("Hikmet", " Durgutovic");
		Student s20 = new Student("Nedim", " Omerovic");
		Student s21 = new Student();
		Student s22 = new Student();
		Student s23 = new Student("Vedad", " Zornic");
		Student s24 = new Student("Emina", " Muratovic");
		
		Student [] studenti = {s1,s2,s3,s3,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24};
		
		for (int i =0; i<6 ; i++){
			for ( int j=0; j<4; j++){
				ucionica.addStudent(studenti[i], i, j);
			}
		}

		
//		ucionica.addStudent(s1);
//		ucionica.addStudent(s2);
//		ucionica.addStudent(s3);
//		ucionica.addStudent(s4);
//		ucionica.addStudent(s5);
//		ucionica.addStudent(s6);
//		ucionica.addStudent(s7);
//		ucionica.addStudent(s8);
//		ucionica.addStudent(s9);
//		ucionica.addStudent(s10);
//		ucionica.addStudent(s11);
//		ucionica.addStudent(s12);
//		ucionica.addStudent(s13);
//		ucionica.addStudent(s14);
//		ucionica.addStudent(s15);
//		ucionica.addStudent(s16);
//		ucionica.addStudent(s17);
//		ucionica.addStudent(s18);
//		ucionica.addStudent(s19);
//		ucionica.addStudent(s20);
//		ucionica.addStudent(new Student());
//		ucionica.addStudent(new Student());
//		ucionica.addStudent(s21);
//		ucionica.addStudent(s22);
		
		
		ucionica.toString();

		
	}
	}
		
//		// napraviMatricu();
//		popuniUcionicu(ucionica);
//		print(ucionica);
//
//	}
//
//	/**
//	 * Funkcija koja popunjava dvodimenzionalni niz ucionisa sa objektima
//	 * student
//	 * 
//	 * @param ucionica
//	 *            = dvodimenzionalni niz ucionza sa imenima i prezimenima
//	 *            studenata
//	 */
//
//	// ne radi mi ovo kako treba, a ne mogu da skontam gresku
//
//	public static void popuniUcionicu(Student[][] ucionica) {
//
//		for (int i = 0; i < ucionica.length; i++) {
//			for (int j = 0; i < ucionica[i].length; j++) {
//
//				System.out.println("Unesi ime i prezime studenta: ");
//
////				String ime = TextIO.getlnString();
////				String prezime = TextIO.getlnString();
//				ucionica[i][j] = studenti[i];
//
//			}
//			System.out.println();
//		}
//	}
//
//	/**
//	 * Funkcija koja ispisuje - dvodimenzionalni niz objekata - ucionica
//	 * 
//	 * @param ucionica
//	 */
//
//	public static void print(Student[][] ucionica) {
//
//		for (int i = 0; i < ucionica.length; i++) {
//			for (int j = 0; i < ucionica[j].length; j++) {
//				System.out.print(ucionica[i][j].toString());
//			}
//			System.out.println();
//		}
//	}
//
//	// private static String[][] napraviMatricu() {
//	// String [][] bitCamp = new String [6][4];
//	// return bitCamp;
//	// }

