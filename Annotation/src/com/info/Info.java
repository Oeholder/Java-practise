package com.info;

/**
 * 
 *项目名称:Annotation
 *类名称:Info
 *类描述:基本注解介绍
 *使用Annotation时要在其前面增加符号，并把该Annotation当成一个修饰符使用。用于修饰它支持的程序元素
 *三个基本的Annotation:
 *1.@Override:限定某个方法，是重写父类方法,该注解只能用于方法
 *2.@Deprecated:用于表示某个程序元素(类,方法等)已过时 ，不推荐使用，但还是可以用
 *3.@SuppressWarnings:抑制编译器警告，里面可以填希望抑制的警告，比如：all所有,unused未使用
 *
 *创建人:郝鸿儒
 *创建时间:2021年6月7日 上午11:26:05
 *版本: 1.0
 */
public class Info {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Person p = new Person();//中间划线，表示Person类过时了
	}

}

@Deprecated
class Person{
	
}