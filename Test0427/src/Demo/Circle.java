package Demo;

public class Circle {
	double radius;
	double area;
	public Circle() {
		this.radius = 1;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		area = 3.14*radius*radius;
		return area;
	}
}
