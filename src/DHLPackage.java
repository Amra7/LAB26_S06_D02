
public class DHLPackage  extends Package {

	
	public double getDimensionalWeight (){
		 return (getWidth()*getHeight()*getLength() )/ 5000;
	}
	
	@Override
	public double getWeight (){
		return Math.max(weight, getDimensionalWeight());
	}
}
