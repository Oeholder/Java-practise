package com.star;

public class B {
	public void say() {
		A a = new A();
		System.out.println(a.n1 + " " + a.n2 + " " + a.n3 + " " + a.n4);//同包不同类无法访问private
	}

}
