public class Package {

	protected double width;
	protected double length;
	protected double height;
	protected double weight;

	// public Package (){
	// this.width=width;
	// this.length=length;
	// this.height = height;
	// this.weight=weight;
	// }

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLenght(double length) {
		this.length = length;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return getWeight() * 3;

	}

	@Override
	public String toString() {
		return "Paket (" + getWidth() + "x" + getHeight() + "x" + getLength()
				+ "), tezina" + getWeight() + ", cijena:" + getPrice();
	}

}
