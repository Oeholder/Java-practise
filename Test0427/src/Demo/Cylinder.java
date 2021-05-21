package Demo;

public class Cylinder {
	Circle circleArea = new Circle();
	double length;
	double volume;
	public Cylinder() {
		this.length = 1;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double findVolume() {
		volume = circleArea.findArea()*this.length;
		return volume;
	}
}
