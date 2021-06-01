package com.star.equals_;

/**
 * 
 *项目名称:Object_
 *类名称:Equals01
 *类描述:equals方法
 * == 和 equals 的区别：
 * == 是比较运算符，既可以判断基本类型，也可以判断引用类型
 * 判断基本类型是判断 值 是否相等
 * 判断引用类型是判断 地址 是否相等，即判断 是不是同一个对象
 * equals 是 Object 类的一个方法，只能用来判断引用类型
 * 
 *创建人:郝鸿儒
 *创建时间:2021年5月27日 上午9:20:29
 * @version
 */
public class Equals01 {

	public static void main(String[] args) {
		B a = new B();
		B b = a;
		B c = b;
		System.out.println(a == c);//true
		System.out.println(b == c);//true
		
		A d = a;
		System.out.println(d == a);//true——判断引用类型是判断 地址 是否相等，即判断 是不是同一个对象
		System.out.println(a.equals(d));//true
		
		C e = new C();
		System.out.println(d.equals(e));//false
	}

}

class A{
	
}

class B extends A{
	
}

class C{
	
}