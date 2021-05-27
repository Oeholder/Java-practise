package com.star.override_;

public class Dog extends Animal{
	
	/**
	 * Dog的cry()和Animal的cry()定义形式一样，就说Dog的cry()重写了Animal的cry()
	 * 子类重写方法不能缩小父类的权限
	 */
	public void cry() {
		System.out.println("小狗汪汪叫");
	}
	
	public String m1() {//String是Object的子类，构成重写
		return " m1";
	}
}
