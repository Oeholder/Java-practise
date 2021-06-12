package com.innerclass;

/**
 * 
 *项目名称:InnerClass
 *类名称:Innerclass
 *类描述:类的五大成员：
 *属性，方法，构造器，代码块，内部类
 *创建人:郝鸿儒
 *创建时间:2021年6月5日 上午9:59:29
 * @version
 */
public class Innerclass {//外部其他类

	public static void main(String[] args) {

	}

}

class Outer{//外部类
	private int n1 = 100;//属性
	public Outer(int n1) {//构造器
		this.n1 = n1;
		System.out.println("构造器");
	}
	public void m1() {//方法
		System.out.println("m1()...");
	}
	{//代码块
		System.out.println("代码块");
	}
	class Inner{//内部类，在Outer的内部
		/**
		 * >定义在外部类局部位置上(比如方法内):
		 * 1)局部内部类(有类名)
		 * 2)匿名内部类(没有类名，重点！！！！！！)
		 * >定义在外部类的成员位置上:
		 * 1)成员内部类（没用static修饰)
		 * 2)静态内部类（使用static修饰)
		 */
	}
}