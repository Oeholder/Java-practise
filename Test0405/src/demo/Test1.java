package demo;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		System.out.println("录入的整数是：" + i);
		if(i%2 == 0) {
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}
		double d = input.nextDouble();
		System.out.println("录入的小数是：" + d);
		//输入agshajsj sghjahsj显示agshajsj/n sghjahsj
		String s1 = input.next();
		System.out.println("录入的字符串是：" + s1);
		String s2 = input.nextLine();
		System.out.println("录入的字符串是：" + s2);
		input.close();
	}
}
