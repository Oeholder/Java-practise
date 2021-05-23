package com.star;

public class RecursionExercise01 {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		@SuppressWarnings("unused")
		int fib = f.fib(6);
		//System.out.println(fib);
	}

}

class Fibonacci{
	int i;
	/**
	 * 打印斐波那契数列
	 * @param n
	 * @return
	 */
	public int fib(int n) {
		int fib = 1;
		if(n == 1 || n == 2) {
			fib = 1;
		}else {
			fib = fib(n - 2) + fib(n - 1);
		}
		for (int j = 0; j < n; j++) {
			if(j == i) {
				System.out.print(fib + " ");
				i++;
			}
		}		
		return fib;
	}
}
	
