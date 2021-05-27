package com.star;

public class A {
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;
	
	public void m1() {
		//该方法可以访问四个属性
		System.out.println("m1" + n1 + " " + n2 + " "+ n3 + " " + n4);
	}
	
	protected void m2() {
		System.out.println("m2" + n1 + " " + n2 + " "+ n3 + " " + n4);
	}
	
	void m3() {
		System.out.println("m3" + n1 + " " + n2 + " "+ n3 + " " + n4);
	}
	
	private void m4() {
		System.out.println("m4" + n1 + " " + n2 + " "+ n3 + " " + n4);
	}
}
