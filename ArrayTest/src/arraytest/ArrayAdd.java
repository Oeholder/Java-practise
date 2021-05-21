package arraytest;

import java.util.Scanner;

public class ArrayAdd {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		while(true) {
			System.out.println("请输入要添加的数字：");
			Scanner input = new Scanner(System.in); 
			int newNum = input.nextInt();
			int arrNew[] = new int[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];
			}
			arrNew[arr.length] = newNum;
			arr = arrNew;
			System.out.println("添加成功\n是否继续？(y/n)");
//			String ch = input.next();
//			char ch1 = ch.charAt(0);
			char ch = input.next().charAt(0);
			if(ch == 'n') break;
			System.out.println("继续添加");
		}
		System.out.println("添加结束");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
