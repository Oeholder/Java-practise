package com.star;

public class ConstructorDetail {

	public static void main(String[] args) {
		Cat cat = new Cat(3, "大橘");
		System.out.println(cat.age + "\t" + cat.name);

	}

}

class Cat{
	int age;
	String name;
	public Cat(int cAge, String cName){
		System.out.println("构造器已被调用,完成对象初始化");
		age = cAge;
		name = cName;
	}
	
	public Cat(int cAge){
		System.out.println("构造器已被调用,完成对象初始化");
		age = cAge;
	}
	/*
	 * 1.构造器修饰符可以是默认的，也可以是public，private，protected
	 * 2.构造器没有返回值
	 * 3.构造方法名和类名必须一样
	 * 4.参数列表规则和成员方法一样
	 * 5.构造器调用由系统完成
	 * 6.构造器可以重载
	 * 7.如果没有定义构造器，系统会自动生成默认无参构造器，一旦定义自己的构造器，默认构造器就被覆盖掉，除非显式的定义，比如：Cat(){};
	 */
	
}
