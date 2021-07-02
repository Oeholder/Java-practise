package com.hhr;

import java.util.Scanner;

@SuppressWarnings("all")
public class StackExercist {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		Stack<String> stackBak = new Stack<>();
		System.out.println("请输入网址：");
		stack.push(scanner.next());
		while(true) {
			System.out.println("继续输入(Y) 前进(F) 后退(B) 退出(Q)");
			String flag = scanner.next();
			if (flag.equals("Q")) {
				break;
			}else if (flag.equals("Y")) {
				System.out.println("请输入网址：");
				String www = scanner.next();
				stack.push(www);
				continue;
			}else if(flag.equals("B")) {
				System.out.println("后退到");
				stackBak.push(stack.pop());
				System.out.println(stack.top());
				continue;
			}else if (flag.equals("F")) {
				System.out.println("前进到");
				stack.push(stackBak.pop());
				System.out.println(stack.top());
				continue;
			}else {
				System.out.println("请输入正确指令！");
				continue;
			}
		}
		System.out.println("浏览结束！");
	}

}
