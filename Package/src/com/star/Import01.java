package com.star;

import java.util.Arrays;

public class Import01 {

	public static void main(String[] args) {
		int arr[] = {1, 2, 4, 66, 57, 82, 19};
		
		//使用Arrays完成排序
		Arrays.sort(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
