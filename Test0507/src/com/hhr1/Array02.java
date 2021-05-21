package com.hhr1;

import java.util.Scanner;

public class Array02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//(1)第一种动态分配方式
		/*double[] nums = new double[5];*/
		//(2)第二种动态分配方式
		double nums[];//声明数组
		nums = new double[5];//分配内存空间
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < nums.length; i++) {
			nums[i] = input.nextDouble();
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
