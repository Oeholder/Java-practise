package com.detail;

/**
 * 
 *项目名称:String
 *类名称:StringDetail
 *类描述:
 *1) String是一个final类，代表不可变的字符序列
 *2)字符串是不可变的。一个字符串对象一旦被分配，其内容是不可变的.
 *创建人:郝鸿儒
 *创建时间:2021年6月12日 上午8:57:54
 *版本: 1.0
 */
public class StringDetail {
	public static void main(String[] args) {
		
		String s1 = "hello";
		s1 = "haha";
		/*
		 * 创建了两个对象，先创建"hello"，s1指向"hello"，
		 * 再创建"haha"，s1又指向"haha"
		 */
		
		String s2 = "hello" + "abc";//编译器底层优化，直接生成"helloabc"一个对象
		
		String a = "hello";
		String b = "abc";
		String c = a + b;
		String d = "helloabc";
		System.out.println(c == d);//F
		/*
		 * 1.先创建 StringBuilder sb = new StringBuilder(); 
		 * 2.执行 sb.append("hello");
		 * 3.执行 sb.append("abc");
		 * 4.执行 String c = sb.toString();
		 * 最后其实是 c ——> 堆中的对象 (String)value[] ——> 池中的"helloabc"
		 */
		
		
	}
}
