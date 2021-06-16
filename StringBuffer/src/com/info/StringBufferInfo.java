package com.info;

/**
 * 
 *项目名称:StringBuffer
 *类名称:StringBufferInfo
 *类描述:StringBuffer基本介绍
 *java.lang.StringBuffer代表可变的字符序列，可以对字符串内容进行增删。
 *很多方法与String相同，但StringBuffer是可变长度的。StringBuffer是一个容器。
 *创建人:郝鸿儒
 *创建时间:2021年6月12日 下午4:32:35
 *版本: 1.0
 */
public class StringBufferInfo {

	public static void main(String[] args) {
		/*
		 * 1.StringBuffer的直接父类是 AbstractStringBuilder
		 * 2.StringBuffer实现了 Serializable，即StringBuffer的对象可以串行化
		 * 3.在父类中 AbstractStringBuilder有属性char[] value,不是final
		 * 	 该 value[] 存放字符串内容，因此存放在堆中的
		 * 4.StringBuffer 是一个final类,不能被继承
		 */
		StringBuffer sb = new StringBuffer();
		
		/*
		 * String Vs StringBuffer
		 * 1) String保存的是字符串常量，里面的值不能更改，每次String类的更新实际上就是更改地址，效率较低//private final char value[];
		 * 2) StringBuffer保存的是字符串变量，里面的值可以更改，每次StringBuffer的更新实际上可以更新内容，不用每次更新地址，效率较高 //char[] value; 
		 */
		//1.创建一个大小为16的char[],用于存放字符内容
		StringBuffer sb1 = new StringBuffer();
		//2.通过构造器指定char[]大小
		StringBuffer sb2 = new StringBuffer(100);
		//3.通过给一个String 创建StringBuffer,char[]大小就是 str.length() +16
		StringBuffer sb3 = new StringBuffer("hello");
		
	}

}
