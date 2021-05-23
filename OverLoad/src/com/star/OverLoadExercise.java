package com.star;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class OverLoadExercise {

	public static void main(String[] args) {
		Methods methods = new Methods();
		System.out.println(methods.m(5));
		System.out.println(methods.m(5, 6));
		methods.m("nice");
		System.out.println(methods.max(5, 6));
		System.out.println(methods.max(6.6, 8.6));
		System.out.println(methods.max(1.2, 8.2, 0.2));

	}

}
class Methods{
	public int m(int n) {
		return n * n;
	}
	
	public int m(int n1, int n2) {
		return n1 * n2;
	}
	
	public void m(String s) {
		System.out.println(s);
	}
	
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	
	public double max(double n1, double n2) {
		if(n1 > n2) return n1;//return n1 > n2 ? n1 : n2;
		return n2;
	}
	
	public double max(double n1, double n2, double n3) {
//		if(n1 > n2) {
//			if(n1 > n3) return n1;
//			return n3;
//		}else {
//			if(n2 > n3) return n2;
//			return n3;
//		}
		double max = n1 > n2 ? n1 : n2;
		return max > n3 ? max : n3;
	}
}
