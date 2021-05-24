package com.star;

/**
 * 
 *项目名称：Modifier
 *类名称：A
 *类描述：
 *				同类			同包			子类			不同包
 *public		 O			 O			 O			 O
 *protected		 O			 O			 O			 X
 *默认		 	 O			 O			 X			 X
 *private		 O			 X			 X			 X
 *创建人： 郝鸿儒
 *创建时间：2021年5月23日 上午11:38:15
 * @version
 */
public class A {
	//四个属性分别使用不同的修饰符访问；
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;
	
	public void m1() {
		//该方法可以访问四个属性
		System.out.println(n1 + " " + n2 + " "+ n3 + " " + n4);
	}
}
