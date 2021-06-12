package com.memberinnerclass;

/**
 * 
 *项目名称:InnerClass
 *类名称:MemberInnerClass
 *类描述:成员内部类的使用说明:
 *成员内部类是定义在外部类的成员位置，并且没有static修饰。
 *1.可以直接访问外部类的所有成员，包含私有的
 *2.可以添加任意访问修饰符(public、protected、默认、private),因为它的地位就是一个成员。
 *3.作用域:和外部类的其他成员一样,作用域为整个类体
 *  比如以下案例，在外部类的成员方法中创建成员内部类对象，再调用方法.
 *4.成员内部类访问外部类(比如:属性)[访问方式:直接访问]
 *5.外部类访问内部类[访问方式:创建对象,再访问]
 *6.外部其他类访问成员内部类[三种方式,如下]
 *
 *创建人:郝鸿儒
 *创建时间:2021年6月6日 上午9:26:00
 * @version
 */
public class MemberInnerClass {//外部其他类

	public static void main(String[] args) {
		Outer out = new Outer();
		out.t1();
		
		//外部其他类访问成员内部类
		Outer.InnerClass inner1 = out.new InnerClass();
		
		//外部其他类访问成员内部类
		Outer.InnerClass inner2 = out.getInnerClass();
		
		//外部其他类访问成员内部类
		Outer.InnerClass inner3 = new Outer().new InnerClass();
	}

}


class Outer{//外部类
	private int n1 = 120;
	public String name = "Tom";
	class InnerClass{//成员内部类
		public void say() {
			System.out.println("n1 = " + n1 + " name = " + name);
		}
	}
	
	public void t1() {
		//使用了成员内部类
		InnerClass incl = new InnerClass();
		incl.say();
	}
	
	public InnerClass getInnerClass() {
		return new InnerClass();
	}
}