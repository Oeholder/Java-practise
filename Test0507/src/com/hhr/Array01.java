package com.hhr;

//引出数组
public class Array01 {

	public static void main(String[] args) {
		//静态初始化
		double array[] = {3, 5, 1, 3.4, 2, 50};//定义数组 
		double sum = 0;
		double average = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		average = sum / array.length;
		System.out.println(average);
	}

}
