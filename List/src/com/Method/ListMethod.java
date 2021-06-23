package com.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *项目名称:List
 *类名称:ListMethod
 *类描述:List接口的常用方法
 *List集合里添加了一些根据索引来操作集合元素的方法
 *1) void add(int index, Object ele):在index位置插入ele元素
 *2) boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
 *3) Object get(int index):获取指定index位置的元素
 *4) int indexOf(Object obj):返回obj在集合中首次出现的位置
 *5) int lastIndexOf(Object obj):返向obj在当前集合中末次出现的位詈
 *6) Object remove(int index):移除指定index位置的元素，并返回此元素
 *7) Object set(int index,Object ele);设置指定index位置的元素为ele ,相当于是替换.
 *8) List subList(int fromlndex, int tolndex):返回从fromIndex到tolndex位置的子集合
 *创建人:郝鸿儒
 *创建时间:2021年6月19日 上午10:59:33
 *版本: 1.0
 */
public class ListMethod {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("Tom");
		list.add("Anni");
		list.add(1,"Mary");
		System.out.println(list);

		List list2 = new ArrayList();
		list2.add("Jack");
		list2.addAll(list);	
		System.out.println(list2);
		System.out.println(list2.subList(1, 3));//List subList(int fromlndex, int tolndex):返回从fromIndex到tolndex位置的子集合
		
	}

}
