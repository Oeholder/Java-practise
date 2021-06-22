package com.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *项目名称:Collection
 *类名称:Collection_
 *类描述:Collection接口常用方法,以实现子类ArrayList来演示. CollectionMethod.java
 *1) add:添加单个元素
 *2) remove:删除指定元素
 *3) contains:查找元素是否存在,
 *4) size:获取元素个数
 *5) isEmpty:判断是否为空
 *6) clear:清空
 *7) addAll:添加多个元素
 *8) containsAll:查找多个元素是否都存在
 *9) removeAll:删除多个元素
 *10)说明:以ArrayList实现类来演示.
 *创建人:郝鸿儒
 *创建时间:2021年6月18日 上午9:49:35
 *版本: 1.0
 */
public class Collection_ {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Tom");
		list.add(10);
		list.add(true);
		System.out.println(list);
		
		list.remove(0);
		list.remove(new Integer(10));
		System.out.println(list);
		
	}

}
