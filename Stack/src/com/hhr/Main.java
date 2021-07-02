package com.hhr;

public class Main {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		testList(stack);
		
	}
	

	static void testList(Stack<Integer> stack) {
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);
		stack.pop();
		System.out.println(stack.top());
		System.out.println(stack);
			
	}

}
