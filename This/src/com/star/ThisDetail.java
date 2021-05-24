package com.star;

public class ThisDetail {

	public static void main(String[] args) {
		Dog dog1 = new Dog(8);
		dog1.info();
		Dog dog2 = new Dog("小黑", 8);
		dog2.info();

	}

}
/*
 * 1.this关键字可以访问本类的属性，方法，构造器
 * 2.this用于区分当前类的属性和局部变量
 * 3.访问成员方法：this.方法名(参数列表)
 * 4.访问构造器：this(参数列表)  注意：只能在构造器中使用，必须放在第一条语句
 * 5.this不能在类定义的外部使用，只能在类定义的方法中使用
 */
class Dog{
	String name;
	int age;
//	public Dog(String dName, int dAge) {
//		name = dName;
//		age = dAge;
//	}
	//构造器形参如果可以直接写成属性名就更好了
	public Dog(String name, int age) {
		this.name = name;//2.this用于区分当前类的属性和局部变量
		this.age = age;//哪个对象调用，This就代表那个对象
	}
	
	Dog(int age){
		this("jack", 5);//4.访问构造器：this(参数列表)  注意：只能在构造器中使用，必须放在第一条语句
	}
	
	public void cry(int age) {
		this.age = age;
	}
	/**
	 * 输出对象信息
	 */
	public void info() {
		this.cry(6);//3.访问成员方法：this.方法名(参数列表)
		System.out.println(name + "\t" + age);
	}
	
}