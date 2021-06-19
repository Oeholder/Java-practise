package com.exercise;

import java.util.Arrays;

public class ArraySortCustom{
	public static void main(String[] args) {
		Integer [] newArr = {1, 45, 2, 80, 3, 6};
		BubbleSort  bs = new BubbleSort ();
		bs.sort(newArr);
		System.out.println(Arrays.toString(newArr));
		bs.sort(newArr, new IA() {
			@Override
			public Integer compare(Integer o1, Integer o2) {
				return o2 -o1;
			}
		});
		System.out.println(Arrays.toString(newArr));
	}

}

interface IA{
	Integer compare(Integer o1, Integer o2);
}

class BubbleSort implements IA{
	@Override
	public Integer compare(Integer o1, Integer o2) {
		return o1 - o2;
		}
	
	public Integer[] sort(Integer[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i ; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	public Integer[] sort(Integer[] arr, IA ia) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i ; j++) {
				if(ia.compare(arr[j], arr[j + 1]) > 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}


