package com.star;

public class B extends A{
	/*
	 * 访问父类的属性，但不能访问父类的private属性
	 */
	public int n1 = 600;
	public void m1() {
		System.out.println(this.n1 + " " + super.n1 + " " + super.n2 + " "+ super.n3 + " " );//+ super.n4);//super.n4无法访问
	}
	
	/*
	 * 访问父类的属性，但不能访问父类的private方法
	 */
	public void h2() {
		super.m1();//直接查找父类的m1方法，跳过本类
		//super.m4();//super.m4无法访问
	}
}
