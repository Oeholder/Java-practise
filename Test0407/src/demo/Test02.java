package demo;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.close();
		int[] arr = {23,45,78,95,24,47};
		int[] newArr = new int[arr.length + 1];
		for(int i = 0;i < newArr.length;i++) {
			if(i > 3) {
				newArr[i] = arr[i - 1];
			}else if(i == 3) {
				newArr[i] = t;
			}else {
				newArr[i] = arr[i];
			}
		}
		for(int x:newArr) {
			System.out.println(x);
		}
	}
}
