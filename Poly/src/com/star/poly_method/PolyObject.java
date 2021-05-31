package com.star.poly_method;

/**
 * 
 *项目名称：Poly
 *类名称：PolyObject
 *类描述：对象的多态
 *
 *1.一个对象的编译类型和运行类型可以不一致
 *2.编译类型在定义对象时就确定了，不能改变
 *3.运行类型是可以改变的
 *4.编译类型看定义时 = 的左边，运行类型看 = 的右边
 *比如：
 *Animal animal = new Dog();(anmial 编译类型是 Animal 运行类型是 Dog)
 *animal = new Cat();(animal 运行类型是Cat)
 *
 *创建人： 郝鸿儒
 *创建时间：2021年5月25日 下午5:41:27
 * @version
 */
public class PolyObject {
	public static void main(String[] args) {
		Animal animal = new Dog();//向上转型——父类引用调用子类对父类的重写
		animal.cry();
		animal = new Cat();
		animal.sleep();//可以调用父类方法
		animal.cry();//先调用子类对父类方法的重写
		//animal.run();//但不能调用子类特有的方法
		
		Cat cat = (Cat)animal;//向下转型——强转父类的引用为子类引用，能调用子类特有的方法，同时 子类继承了父类的方法，所以可以调用父类方法
		//cat编译类型是Cat,运行类型是Cat
		/**
		 * 若运行
		 * Dog dog = (Dog)animal;
		 * dog.run();
		 * 会报错：Exception in thread "main" java.lang.ClassCastException....
		 * 
		 * 1.只能强转父类的引用，不能强转父类的对象
		 * animal 是Animal的引用，先指向Dog对象，之后指向Cat对象
		 * Cat cat = (Cat)animal;是强转引用
		 * Dog dog = (Dog)animal;是强转对象
		 * 
		 * 2.要求父类的引用必须指向的是当前目标类型的对象——即要求Animal原先就指向Cat
		 * 
		 * 3.向下转型之后 cat 是 Cat 的引用可以调用子类类型中的所有成员,也可以调用父类方法
		 */
		cat.run();
		cat.sleep();
		cat.cry();
		
	}
}
