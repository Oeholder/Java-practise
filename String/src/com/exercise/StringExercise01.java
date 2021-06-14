package com.exercise;

public class StringExercise01 {

	public static void main(String[] args) {
		String a = "hsp";//a指向常量池的“hsp"
		String b =new String("hsp");//b指向堆中对象
		System.out.println(a.equals(b));//T  equals比较常量池的内容
		System.out.println(a==b);//F
		/*
		 * 当调用intern方法时，如果池已经包含一个等于此String对象的字符串
		 * (用equals(Object)方法确定)，则返回池中的字符串。
		 * 否则，将此String对象添加到池中，并返回此 String对象的引用
		 */
		System.out.println(a==b.intern());//T  b.intern()指向常量池,
		System.out.println(b==b.intern());//F
	}

}
