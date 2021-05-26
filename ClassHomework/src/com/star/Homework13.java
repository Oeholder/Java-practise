package com.star;

public class Homework13 {

	public static void main(String[] args) {
		Circle01 c = new Circle01();
		PassObject p = new PassObject();
		p.printArea(c, 5);
	}

}

class Circle01{
	double radius;
	public static final double PI = 3.14;
	
	public double findArea() {
		return PI * radius * radius;
	}
}

class PassObject{
	public void printArea(Circle01 c,int times) {
		for (int i = 1; i <times; i++) {
			c.radius = i;
			System.out.println("半径为：" + c.radius);
			System.out.println("面积为：" + String.format("%.2f",c.findArea()));
		}
	}
}