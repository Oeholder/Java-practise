package com.info;

/**
 * 
 *项目名称:StringBuilder
 *类名称:StringBuilderInfo
 *类描述:StringBuilder基本介绍
 *1)一个可变的字符序列。此类提供一个与StringBuffer 兼容的API，但不保证同步。
 *该类被设计用作 StringBuffer的一个简易替换，用在字符串缓冲区被单个线程使用的时候。
 *如果可能，建议优先采用该类，因为在大多数实现中，它比StringBuffer要快。
 *2)在 StringBuilder上的主要操作是append和insert 方法，可重载这些方法,以接受任意类型的数据。
 *创建人:郝鸿儒
 *创建时间:2021年6月14日 下午3:15:27
 *版本: 1.0
 */
public class StringBuilderInfo {

	public static void main(String[] args) {
		/*
		 * 1.StringBuilder的直接父类是 AbstractStringBuilder
		 * 2.StringBuilder实现了 Serializable，即StringBuilder的对象可以串行化(可以网络传输，可以保存到文件)
		 * 3.在父类中 AbstractStringBuilder有属性char[] value,不是final
		 * 	 该 value[] 存放字符串内容，因此存放在堆中的
		 * 4.StringBuilder 是一个final类,不能被继承
		 * 5.StringBuilder 的方法没有做互斥的处理，即没有 synchronized 关键字,因此，在单线程的情况下使用 StringBuilder
		 */
		StringBuilder stringBuilder = new StringBuilder();
	}

}
