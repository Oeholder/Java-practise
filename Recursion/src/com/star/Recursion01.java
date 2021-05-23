package com.star;

public class Recursion01 {

	public static void main(String[] args) {
		Recursion01 t = new Recursion01();
		t.test(4);
		System.out.println(t.factorial(4));

	}
	
	public void test(int n) {
		if(n > 2) {
			test(n - 1);
		}
		System.out.println("n = " + n);
	}
	/**
	 * 阶乘
	 * @param n
	 * @return
	 */
	public int factorial(int n) {
		if(n == 1) {
			return 1;
		}else {
			return factorial(n - 1)*n;
		}
	}

}
