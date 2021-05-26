package com.star;

import java.lang.invoke.ConstantBootstraps;

public class Homework05 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 6;
		c1.printArea();
		c1.printCir();

	}

}

class Circle{
	double radius;
	public static final double PI = 3.14;
	
	public void printCir() {
		double cir = radius * 2 * PI;
		System.out.println(cir);
	}
	public void printArea() {
		double area = PI * radius * radius;
		System.out.println(area);
	}
}