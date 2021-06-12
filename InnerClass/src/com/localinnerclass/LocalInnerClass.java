package com.localinnerclass;

/**
 * 
 *项目名称:InnerClass
 *类名称:LocalInnerClass
 *类描述:演示局部内部类的使用
 *创建人:郝鸿儒
 *创建时间:2021年6月5日 上午10:12:59
 * @version
 */
public class LocalInnerClass {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		out.m1();//就近原则n1 = 400；
		
	}

}

class Outer{//外部类
	private int n1 = 100;
	public void m1() {//方法
		/**
		 *项目名称:InnerClass
		 *类名称:inner02
		 *类描述:
		 * 1.局部内部类(有类名)定义在外部类局部位置上(比如方法内)
		 * 2.不能添加访问修饰符,因为它的地位就是一个局部变量。
		 *   局部变量是不能使用修饰符的。但是可以使用final修饰，因为局部变量也可以使用finalI
		 * 3.作用域:仅仅在定义它的方法或代码块中。
		 * 4.可以访问外部类的所有成员，包括private
		 * 5.外部类在方法中可以创建inner02的对象，然后调用方法
		 * 6.外部其他类---不能访问----->局部内部类（因为局部内部类地位是一个局部变量)
		 * 7.如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，则可以使用(外部类名.this.成员)去访问
		 * 【演示】:System.out.println(”外部类的n2=”+外部类名.this.n2);
		 *创建人:郝鸿儒
		 *创建时间:2021年6月5日 上午10:18:24
		 * @version
		 */
		
		class Inner02{//局部内部类
			private int n1 = 400;
			//可以访问外部类的所有方法，包括private
			public void f1() {
				System.out.println("内部类n1 = " + n1);
				System.out.println("外部类n1 = " + Outer.this.n1);//Outer.this ==> out
			}
		}
		
		final class Inner03 extends Inner02{//局部内部类inner02本质依然是个类,加final后inner03 无法被继承
			
		}
		Inner02 inner02 = new Inner02();
		inner02.f1();
	}
	
	{//代码块
		//class inner02{//与m1方法中的inner02不冲突，因为局部内部类作用域仅仅在定义它的方法或代码块中。
			
		//}
	}
}