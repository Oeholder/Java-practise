package com.staticinnerclass;


/**
 * 
 *项目名称:InnerClass
 *类名称:StaticInnerClass
 *类描述:静态内部类
 *说明:静态内部类是定义在外部类的成员位置，并且有static修饰
 *1.可以直接访问外部类的所有 静态成员 ，包含私有的，但不能直接访问非静态成员
 *2.可以添加任意访问修饰符(public、protected、默认、private),因为它的地位就是一个成员。
 *3.作用域:同其他的成员，为整个类体
 *创建人:郝鸿儒
 *创建时间:2021年6月6日 上午10:16:11
 * @version
 */
public class StaticInnerClass {

	public static void main(String[] args) {
		Outer.InnerClass inner3 = Outer.getInnerClass_();
		
		Outer out = new Outer();
		
		Outer.InnerClass inner1 = new Outer.InnerClass();
		
		Outer.InnerClass inner2 = out.getInnerClass();
		
	}

}

class Outer{//外部类
	private int n1 = 120;
	public static String name = "Tom";
	
	static class InnerClass{//静态内部类
		public void say() {
			System.out.println(name);
			cry();
		}
	}
	
	public static void cry() {
		System.out.println("cry");
	}

	public InnerClass getInnerClass() {
		return new InnerClass();
	}
	
	public static InnerClass getInnerClass_() {
		return new InnerClass();
	}
}