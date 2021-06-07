package com.abstract_;

/**
 * 
 *项目名称:Abstract
 *类名称:Abstract
 *类描述:抽象类
 *1.抽象方法：没有实现的方法，即没有方法体
 *2.当一个类中存在抽象方法时，需要将该类声明为abstract类
 *3.抽象类不能被实例化
 *4.抽象类不一定要抽象方法
 *5.abstract只能修饰类和方法，不能修饰属性和其他
 *6.如果一个类继承了抽象类，他必须实现抽象类的所有抽象方法，除非它也是抽象类
 *7.抽象方法不能被private， final， static修饰
 *创建人:郝鸿儒
 *创建时间:2021年6月1日 上午11:33:16
 * @version
 */
public class Abstract {

	public static void main(String[] args) {

	}

}

abstract class animal{
	
	public abstract void eat();
	
}