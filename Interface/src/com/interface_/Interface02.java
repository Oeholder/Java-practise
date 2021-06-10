package com.interface_;

/**
 * 
 *项目名称:Interface
 *类名称:Interface02
 *类描述:接口
 *1.接口不能被实例化
 *2.接口中所有的方法是 public方法，接口中抽象方法，可以不用 abstract 修饰
 *3.一个普通类实现接口,就必须将该接口的所有方法都实现
 *4.抽象类实现接口时不需要实现接口的方法
 *5.一个类同时可以实现多个接口 [举例] A extends B,
 *6.接口中的属性,只能是final的，而且是 public static final修饰符。比如:int a=1;实际上是public static final int a=1;(必须初始化)
 *7.接口中属性的访问形式:接口名.属性名
 *8.一个接口不能继承其它的类,但是可以继承多个别的接口 [举例]interface A extends B,C0
 *9.接口的修饰符只能是public和默认，这点和类的修饰符是一样的。
 *
 *继承与接口：
 *当子类继承了父类,就自动的拥有父类的功能
 *如果子类需要扩展功能,可以通过实现接口的方式了扩展。
 *
 *创建人:郝鸿儒
 *创建时间:2021年6月4日 上午10:25:36
 * @version
 */
public class Interface02 {

	public static void main(String[] args) {

	}

}

/**
 * 1.如果一个类 implement 接口，需要将接口的所有抽象方法都实现
 */
class A implements Ainterface{
	
	@Override
	public void hi() {
		
	}
}