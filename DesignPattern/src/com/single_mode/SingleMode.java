package com.single_mode;

/**
 * 
 *项目名称:DesignPattern
 *类名称:SingleMode
 *类描述:单例设计模式 如：java.lang.Runtime
 * 1．所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，
 * 对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法
 * 2.单例模式有两种方式:
 * (1)饿汉式:(提前创建好对象，没有线程安全的问题，存在浪费资源的问题)
 * 1)构造器私有化->防止直接new一个对象
 * 2)类的内部创建对象
 * 3)向外暴露一个静态的公共方法：getlnstance()
 * 4)代码实现:HungryManStyle
 * 
 * (2)懒汉式:(用的时候再创建对象，有线程安全的问题)
 * 1)构造器私有化->防止直接new一个对象
 * 2)类的内部定义一个静态属性对象,但不创建SluggardStyle对象
 * 3)向外暴露一个静态的公共方法：getlnstance()，
 *   判断：如果定义的属性对象为空，创建一个对象，如果不为空，返回原来的对象，从而保证单例
 * 4)代码实现:HungryManStyle
 *创建人:郝鸿儒
 *创建时间:2021年6月1日 上午9:11:56
 * @version
 */
public class SingleMode {

	public static void main(String[] args) {

	}

}

class HungryManStyle{
	
	private HungryManStyle() {
	}
	
	private static HungryManStyle hms = new HungryManStyle();
	
	public static HungryManStyle getInstance() {
		return hms;
	}
}

class SluggardStyle{
	
	private SluggardStyle() {
	}
	
	private static SluggardStyle hms;
	
	public static SluggardStyle getInstance() {
		if(hms == null) {
			return hms = new SluggardStyle();
		}
		return hms;
	}
}
