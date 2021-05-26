package com.detail;

public class Sub extends Base{
	public Sub() {
		System.out.println("Sub()...");
	}
	
	public Sub(int n){
		super(5);
		System.out.println("Sub(" + n + ")...");
	}
	
	public Sub(double n){
		//super();
		System.out.println("Sub(" + n + ")...");
	}
	
}
