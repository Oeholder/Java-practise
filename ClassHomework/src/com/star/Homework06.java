package com.star;

public class Homework06 {

	public static void main(String[] args) {
		Cale cale = new Cale(6.6, 5.8);
		System.out.println(cale.add() + " " +
						   cale.minus() + " " +
						   cale.multiple() + " " +
						   cale.divide());
		cale.num2 = 0;
		cale.divide();

	}

}

class Cale{
	double num1,num2;
	
	public Cale(double num1,double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double add() {
		return num1 + num2;
	}
	
	public double minus() {
		return num1 - num2;
	}
	
	public double multiple() {
		return num1 * num2;
	}
	
	public double divide() {
		if(num2 == 0) System.err.println("error");
		return num1 / num2;
	}
}
