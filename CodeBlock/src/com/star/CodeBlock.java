package com.star;

public class CodeBlock {

	public static void main(String[] args) {

	}

}

class Movie{
	private String name;
	private double price;
	private String director;
	
	/**
	 * 下面三个构造器都有相同的语句，代码比较冗余
	 * 将相同的语句放入一个代码块中
	 * 不管我们调用哪个构造器，创建对象，都会先调用代码块
	 * 
	 * 代码块相当于构造器的补充机制
	 * 当构造器中有大量重复语句时，可以抽取到代码块中，提高代码复用性
	 * 
	 * 1.static修饰的代码块随类的加载而执行，只会执行一次，普通代码块每创建一个对象就加载一次
	 * add：类加载的情况：
	 * 		(1)创建新的对象时
	 * 		(2)通过类调用静态变量和静态方法时
	 * 		(3)子类实例化时，父类会加载
	 * 
	 * 2.调用顺序：
	 * (1)调用静态代码块和静态属性初始化
	 * (注意:静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化,则按他们定义的顺序调用)口
	 * (2)调用普通代码块和普通属性的初始化
	 * (注意:普通代码块和普通属性初始化调用的优先级一样,如果有多个普通代码块和多个普通属性初始化，则按定义顺序调用)
	 * (3)调用构造方法。
	 * 
	 * 3.构造器调用时先调用super()；然后调用普通代码块
	 * 
	 * 4.调用子类时顺序：
	 * (1)父类的静态代码块和静态属性(优先级一样,按定义顺序执行)
	 * (2)子类的静态代码块和静态属性(优先级一样,按定义顺序执行)	
	 * (3)父类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行)
	 * (4)父类的构造方法
	 * (5)子类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行)
	 * (6)子类的构造方法
	 * 
	 * 5.静态代码块只能调用静态变量和静态方法，普通代码块都可以调用
	 */
	
	{
		System.out.println("广告开始。。。");
		System.out.println("电影开始。。。");
	}
	
	public Movie(String name) {
		super();
		//
//		System.out.println("广告开始。。。");
//		System.out.println("电影开始。。。");
		this.name = name;
	}

	public Movie(String name, double price) {
		super();
//		System.out.println("广告开始。。。");
//		System.out.println("电影开始。。。");
		this.name = name;
		this.price = price;
	}

	public Movie(String name, double price, String director) {
		super();
//		System.out.println("广告开始。。。");
//		System.out.println("电影开始。。。");
		this.name = name;
		this.price = price;
		this.director = director;
	}
	
	
	
}