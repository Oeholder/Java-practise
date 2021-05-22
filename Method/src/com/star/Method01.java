package com.star;

public class Method01 {
	/**
	 * 输出:我是一个好人
	 */
	public void speak() {
		System.out.println("我是一个好人");
	}
	/**
	 * 计算1+...+1000的结果
	 * @return
	 */
	public int cal01() {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}
		return sum;
	}
	/**
	 * 计算1+...+n的结果
	 * @param num
	 * @return
	 */
	public int cal02(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
	/**
	 * 计算两个数的和
	 * @return
	 */
	public int getSum(int num1, int num2) {
		return num1 + num2;
	}
}
