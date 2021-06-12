package com.anonymous_innerclass_detail;

/**
 * 
 *项目名称:InnerClass
 *类名称:AnonymousInnerDetail
 *类描述:匿名内部类细节
 *创建人:郝鸿儒
 *创建时间:2021年6月5日 下午5:27:03
 * @version
 */
public class AnonymousInnerDetail {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.m1();
	}
}

class Outer{
	private int n1 = 99;
	public void m1() {
		//创建一个基于类的匿名内部类
		Person person = new Person() {
			@Override
			public void hi() {
				System.out.println("匿名内部类重写了hi()");
			}
		};
		person.hi();//动态绑定
		
		//直接调用
		new Person() {
			@Override
			public void hi() {
				System.out.println("匿名内部类重写了hi()");
			}
		}.hi();
	}
}

class Person{//类
	public void hi() {
		System.out.println("Person hi()");
	}
}