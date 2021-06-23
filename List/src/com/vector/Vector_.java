package com.vector;

import java.util.Vector;

/**
 * 
 *项目名称:List
 *类名称:Vector_
 *类描述:Vector的基本介绍
 *1) Vector类的定义说明
 *public class vector<E>
 *extends AbstractList<E>
 *implements List<E>，RandomAccess,cloneable，serializable
 *2) Vector底层也是一个对象数组protected Object[] elementData;
 *3) Vector是线程同步的，即线程安全, Vector类的操作方法带有synchronized
 *public synchronized E get(int index){
 *	if (index >= elementCount)
 *	throw new ArraylndexOutOfBoundsException(index);
 *return elementData(index);
 *4) 在开发中,需要线程同步安全时,考虑使用Vector
 *创建人:郝鸿儒
 *创建时间:2021年6月21日 下午4:02:06
 *版本: 1.0
 */
public class Vector_ {
	public static void main(String[] args) {
		Vector vector = new Vector();
		System.out.println(vector);
		for (int i = 0; i < 10; i++) {
			vector.add(i);
		}
		/*
		 * 1. Vector vector = new Vector();底层:
		 * public Vector(){
		 * 	   this(10);
		 * }
		 * vector.length
		 */
	}
}
