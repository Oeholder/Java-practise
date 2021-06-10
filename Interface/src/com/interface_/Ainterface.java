package com.interface_;

public interface Ainterface {
	public int n1 = 10;
	//在接口中，抽象方法可以省略public abstract关键字
	void hi();//jdk7之前，所有方法都是抽象方法
	//jdk8之后，可以有默认实现方法，需要使用default关键字
	default public void ok() {
		System.out.println("ok");
	}
	//jdk8之后，可以有静态方法，需要使用static关键字
	static public void good() {
		System.out.println("good");
	}
}
