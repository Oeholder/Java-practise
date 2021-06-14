package com.integer_;

/**'
 * 
 *项目名称:EightWrapper
 *类名称:Integer01
 *类描述:演示包装类和基本数据类型的相互转换,这里以 int 和 Integer 演示。
 *1) jdk5前的手动装箱和拆箱方式，装箱:基本类型->包装类型,反之，拆箱
 *2) jdk5以后(含jdk5)的自动装箱和拆箱方式
 *3) 自动装箱底层调用的是valueOf方法,比如Integer.valueOf0
 *4) 其他包装类使用方法类似
 *
 *创建人:郝鸿儒
 *创建时间:2021年6月10日 上午8:10:16
 *版本: 1.0
 */
public class Integer01 {
	@SuppressWarnings({ "deprecation", "static-access", "unused" })
	public static void main(String[] args) {
		//手动装箱
		int n1 = 100;
		Integer integer = new Integer(n1);
		Integer integer2 = integer.valueOf(n1);
		//手动拆箱
		int i = integer.intValue();
		
		//jdk5以后(含jdk5)的自动装箱
		int n2 = 200;
		Integer integer3 = n2;//底层使用Integer.valueOf(n2);
		//自动拆箱
		int j = integer3;//底层使用Integer.intValue();
		
		Object object = true ? new Integer(1) : new Double(3);//三元运算符是一个整体
		System.out.println(object);
	}
}
