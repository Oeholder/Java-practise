package com.exception_exercise;

import java.util.Scanner;

public class Try_Catch_Exercise {

	public static void main(String[] args) {
		Try_Catch_Exercise tce = new Try_Catch_Exercise();
		System.out.println(tce.input());
	}
	
	public int input() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		try {
			return input.nextInt();
		} catch (Exception e) {
			System.out.println("请输入整数！");
			return input();
		}
	}
}
