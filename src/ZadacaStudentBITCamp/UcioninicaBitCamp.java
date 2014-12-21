package ZadacaStudentBITCamp;

public class UcioninicaBitCamp {

	private String imeUcionice;
	private Student [][] ucionica;
	

	public UcioninicaBitCamp(String imeUcionice) {
		this.imeUcionice = imeUcionice;
		this.ucionica = new Student[6][4];
		
	}
	
//	public Student [][] kreirajUcionicu(int red, int kolona){
//		ucionica = new Student[red][kolona];
//		return ucionica;
//	}
	
	public String getImeUcionice() {
		return imeUcionice;
	}

	public void setImeUcionice(String imeUcionice) {
		this.imeUcionice = imeUcionice;
	}

	public Student[][] getUcionica() {
		return ucionica;
	}

	public void setUcionica(Student[][] ucionica) {
		this.ucionica = ucionica;
	}

	public void addStudent (Student s, int i, int j){
//		for (int i=0; i<ucionica.length; i++){
//			for ( int j=0; j<ucionica[i].length; j++){
				ucionica[i][j] = s;
//			}
//		}
	}
	
	public String toString (){
			String str = "";
			System.out.println("Ime ucionice je: "+ imeUcionice);
		for (int i=0; i<ucionica.length; i++){
			for ( int j=0; j<ucionica[i].length; j++){
				str+=ucionica[i][j].toString(); 
			}
			System.out.println();
		}	
		return str;
	}
	 
	
}
