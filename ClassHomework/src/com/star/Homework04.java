package com.star;

public class Homework04 {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
		A03 a03 = new A03();
		int newArr[] = a03.copyArr(arr);
		newArr[3] = 6;
		for (int i : newArr) {
			System.out.print(i + " ");
		}
	}

}

class A03{
	public int[] copyArr(int arr[]) {
		int newArr[] = new int[arr.length];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}
}