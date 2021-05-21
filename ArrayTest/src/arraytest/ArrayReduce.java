package arraytest;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayReduce {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		do {
			System.out.println("是否缩减数组？(y/n)");
			Scanner input = new Scanner(System.in);
			char ch = input.next().charAt(0);
			if(ch == 'n') break;
			if(arr.length == 1) {
				System.out.println("不能再缩减！");
				break;
			}
			int arrReduce[] = new int[arr.length - 1];
			for (int i = 0; i < arrReduce.length; i++) {
				arrReduce[i] = arr[i];
			}
			arr = arrReduce;
		} while (true);
		System.out.println("缩减结束！");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
