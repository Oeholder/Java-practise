package com.anonymous_innerclass;

/**
 * 
 *项目名称:InnerClass
 *类名称:AnnoymousInnerClass
 *类描述:匿名内部类的使用
 *1.(1)本质是类(2)是内部类(3)没有类名(4)同时是一个对象
 *匿名内部类是定义在外部类的局部位置，比如方法中，并且没有类名
 *2.匿名内部类的基本语法: new类或接口(参数列表){类体};
 *创建人:郝鸿儒
 *创建时间:2021年6月5日 下午3:50:47
 * @version
 */
public class AnnoymousInnerClass {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.method();
	}

}

class Outer{//外部类
	private int n1 = 10;//属性
	public void method() {//方法
		/**
		 * 基于接口的匿名内部类
		 * 1.需求:想使用IA接口，并创建对象
		 * 2.传统方式,是写一个类，实现该接口，并创建对象
		 * 3.需求:Tiger类,dog类只使用一次
		 * 4.解决方法：可以使用匿名类简化代码
		 * 5.Tiger的编译类型是IA(接口类型)，运行类型是匿名内部类Outer$1
		 * 7.jdk底层创建了匿名内部类，立即就创建了 Outer$1 的实例，并把地址返回给 tiger
		 * 8.匿名内部类使用一次就不能再使用了
		 */
//		IA tiger = new Tiger();
//		tiger.cry();
		
		IA tiger = new IA() {
			@Override
			public void cry() {
				System.out.println("tiger cry");
			}
		};
		System.out.println("tiger的运行类型 = " + tiger.getClass());
		tiger.cry();
		tiger.cry();
		tiger.cry();//对象可以反复使用
		/**
		 * 匿名内部类的底层：会分配一个类名
		 * class Outer$1 implenents IA{
		 * 		@Override
		 * 		public void cry() {
		 * 			System.out.println("tiger cry");
		 * 		}
		 * }
		 */
		
		/**
		 * 基于类的匿名内部类
		 * 1.father编译类型是Father，运行类型是匿名内部类Outer$2
		 * class Outer$1 extends Father{
		 * 		@Override
		 * 		public void test() {
		 * 			System.out.println("匿名内部类重写了test方法");
		 * 		}
		 * }
		 */
		Father father = new Father("Tom") {//形参会传递到构造器
			
			@Override
			public void test() {
				System.out.println("匿名内部类重写了test方法");
			}
		};
		System.out.println("father的运行类型 = " + father.getClass());
		father.test();
		
		/**
		 * 基于抽象类的匿名内部类
		 */
		Animal animal = new Animal() {
			
			@Override
			void eat() {
				System.out.println("匿名内部类重写了抽象方法eat");
			}
		};
		animal.eat();
	}
}

interface IA{//接口
	public void cry();
}

//class Tiger implements IA{
//	@Override
//	public void cry() {
//		System.out.println("tiger cry");
//	}
//}
//
//class Dog implements IA{
//	@Override
//	public void cry() {
//		System.out.println("dog cry");
//	}
//}

class Father{
	public Father(String name) {//构造器
	}
	public void test() {//方法
		
	}
}

abstract class Animal{//抽象类
	abstract void eat();
}