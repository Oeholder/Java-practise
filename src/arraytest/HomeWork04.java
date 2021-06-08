package arraytest;

import java.util.Scanner;
//在升序数组中插入一个元素，该数组依旧是升序
public class HomeWork04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int arr[] = {10, 12, 45, 90};
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if(num <= arr[i]) {
				index = i;
				break;
			}else {
				index = arr.length;
			}
		}
		int arrNew[] = new int[arr.length + 1];
		for (int i = 0,j =0; i <arrNew.length; i++) {
			if(i == index) {
				arrNew[i] = num;
			}else {
				arrNew[i] = arr[j];
				j++;
			}
		}
		arr = arrNew;
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
