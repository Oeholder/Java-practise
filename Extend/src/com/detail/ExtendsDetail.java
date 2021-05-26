package com.detail;

/**
 * 
 *项目名称：Extend
 *类名称：ExtendsDetail
 *类描述：继承细节
 *创建人： 郝鸿儒
 *创建时间：2021年5月24日 下午6:22:51
 * @version
 */
public class ExtendsDetail {
	public static void main(String[] args) {
		Sub sub = new Sub();
		Sub sub2 = new Sub(5);
		Sub sub3 = new Sub(5.5);
		/**
		 * 1.调用子类的构造器会先调用父类的 无参 构造器
		 * 2.如果父类没有提供无参构造器，则必须在子类的构造器中用super()指定要使用父类的哪个构造器
		 * 3.super() 和 this()都只能放在构造器第一行，两个方法不能共存在一个构造器中
		 * 4.Object(在java.lang中)是所有类的基类
		 * 5.java是单继承机制，只能有一个父类
		 */
	}
}
