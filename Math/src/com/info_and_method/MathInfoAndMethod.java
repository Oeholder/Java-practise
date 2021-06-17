package com.info_and_method;

/**
 * 
 *项目名称:Math
 *类名称:MathInfoAndMethod
 *类描述:Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。
 *创建人:郝鸿儒
 *创建时间:2021年6月14日 下午3:49:21
 *版本: 1.0
 */
public class MathInfoAndMethod {

	public static void main(String[] args) {
		//1.abs绝对值
		int abs = Math.abs(9);
		System.out.println(abs);
		//2.pow求幕
		double pow = Math.pow(2, 4);
		System.out.println(pow);
		//3.ceil向上取整,返回>=该参数的最小整数;
		double ceil =Math.ceil(-3.0001);
		System.out.println(ceil);
		//4.floor向下取整,返回<=该参数的最大整数
		double floor = Math.floor(-4.999);
		System.out.println(floor);
		//5.round四舍五入Math.floor(该参数+0.5)
		long round = Math.round(-5.001);
		System.out.println(round);
		//6.sqrt求开方
		double sqrt = Math.sqrt(-9.0);
		System.out.println(sqrt);
		sqrt = Math.sqrt(9.0);
		System.out.println(sqrt);
		//7.random返回随机数(0 — 1 之间的随机小数)
		//[a-b]:int num =(int)(Math.randomo* (b-a+1) +a)
		//(1) (int)(a) <= x <= (int)(a + Math.random() * (b - a + 1))      0 <= Math.random() * (b - a) < (b - a)
		double random = Math.random();
		System.out.println(random);
		int num =(int)(Math.random() * (8 - 4 + 1) + 4);
		System.out.println(num);
	}

}
