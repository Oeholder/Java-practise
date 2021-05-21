package com.star;

public class VarScopeDetail {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.cry();

	}

}

class Cat{
	/*
	 * 1.全局变量(属性)作用域是整个类体，生命周期伴随对象的创建而创建，伴随对象的销毁而销毁，可以被其他类使用(通过对象调用)，可以加修饰符
	 * 2.name 和 age 是全局变量(属性)，有默认值可以不赋初始值
	 * 3.全局变量(属性)可以在方法中使用
	 */
	String name;
	int age;
	static int i ;
	
	public void cry() {
		/*
		 * 1.局部变量作用域在方法或者代码块中，生命周期伴随代码块的执行而创建和销毁，只能在本类本方法中使用，不可以加修饰符
		 * 2.局部变量一般指成员方法中定义的变量
		 * 3.n 和 name 就是局部变量，必须赋初始值才能使用
		 */
		System.out.println(age);
		int age = 12;//属性和局部变量可以重名访问遵循就近原则
		System.out.println(age);
		int n = age;
		String cryName = "jack";
	}
}

class Dog{
	public void eat() {
		Cat cat = new Cat();
		int dogAge = cat.age;
	}
}
