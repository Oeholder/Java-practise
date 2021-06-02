package com.star;

public class ChildGame {

	public static void main(String[] args) {
		Child c1 = new Child("Tom");
		c1.join();
		System.out.println(c1.count);
		
		Child c2 = new Child("Jack");
		c2.join();
		System.out.println(c2.count);
		
		Child c3 = new Child("James");
		c3.join();
		
		System.out.println(c1.count);
		System.out.println(c2.count);
		System.out.println(c3.count);
		System.out.println(Child.count);//类变量可以用类名访问
		
	}

}

class Child{
	private String name;
	public static int count;//static变量是同一个类所有对象共享，在类变量加载的时候就生成了
	
	public Child(String name) {
		this.name = name;
	}
	
	public void join() {
		System.out.println(this.name + "加入了游戏");
		count++;
	}
	
}