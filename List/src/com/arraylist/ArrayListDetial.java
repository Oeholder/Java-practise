package com.arraylist;

import java.util.ArrayList;

/**
 * 
 *项目名称:List
 *类名称:ArrayListDetial
 *类描述:ArrayList的注意事项
 *1)permits all elements, including null ,ArrayList可以加入null,并且多个
 *2)ArrayList是由数组来实现数据存储的
 *3)ArrayList基本等同于Vector,除了ArrayList是线程不安全(执行效率高)看源码，在多线程情况下，不建议使用ArrayList
 *创建人:郝鸿儒
 *创建时间:2021年6月20日 上午8:44:19
 *版本: 1.0
 */
public class ArrayListDetial {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(null);
		arrayList.add("Tom");
		arrayList.add(null);
		System.out.println(arrayList);
		/*
		 * ArrayList的底层操作机制源码分析:
		 * 1) ArrayList中维护了一个Object类型的数组elementData.transient Object[] elementData;//transient表示该属性不会被序列化
		 * 2)当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData容量为0，第1次添加，则扩容elementData为10，如需要再次扩容，则扩容elementData为1.5倍。
		 * 3)如果使用的是指定大小的构造器，则初始elementData容量为指定大小，如果需要扩容，则直接扩容elementData为1.5倍。
		 */
	}

}
