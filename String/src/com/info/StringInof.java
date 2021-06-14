package com.info;

/**
 * 
 *项目名称:String
 *类名称:StringInof
 *类描述:https://www.runoob.com/java/java-string.html
 *1) String对象用于保存字符串,也就是一组字符列
 *2)字符串常量对象是用双引号括起的字符序列。例如:"你好"、“12.97"."boy"等
 *3)字符串的字符使用Unicode字符编码，一个字符(不区分字母还.汉六)占两个空苦
 *4) String类较常用构造方法(其它看手册);
. String s1 = new String();
. String s2 = new String(String original);
· String s3 = new String(char[] a);
. String s4 = new String(charla,int startIndex,int count)
 *创建人:郝鸿儒
 *创建时间:2021年6月11日 上午9:46:03
 *版本: 1.0
 */
public class StringInof {
/*
 * 5)Serializable String实现了Serializable，说明String可以串行化
 * 6)Comparable	String实现了Comoerable，说明String可以比较/指定大小
 * CharSequence
 * 7)String是final，不能被继承
 * 8)String有属性private final char value[];用于存放字符串内容,赋值之后地址不能更改,内容可以修改
 */
	public static void main(String[] args) {
		String name = "Jack";
		/*
		 * 1．方式一:先从常量池查看是否有"Jack”数据空间，
		 * 如果有，直接指向;如果没有则重新创建,然后指向。name最终指向的是常量池的空间地址
		 */
		String name2 = new String("Tom");
		/*
		 * 2方式二:先在堆中创建空间，里面维护了value属性，指向常量池的Tom空间。
		 * 如果常量池没有"Tom",重新创建，如果有，直接通过value指向。最终指向的是堆中的空间地址。
		 */
	}

}
