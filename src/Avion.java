
public class Avion {
	
	private Package[] packages =  new Package[3];
	
	public Package[] getPackage() {
		return packages;
	}
	
	public double getTotalWeight() {
		double total =0;
		 for (Package p : packages)
			 total+= p.getWeight();	
		 return total;
	}
	
	

}
