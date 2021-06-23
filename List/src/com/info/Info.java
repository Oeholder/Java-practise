package com.info;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *项目名称:List
 *类名称:Info
 *类描述:List接口是Collection接口的子接口List_.java
 *1) List集合类中元素有序(即添加顺序和取出顺序一致)、且可重复
 *2) List集合中的每个元素都有其对应的顺序索引，即支持索引。
 *3) List容器中的元素都对应一个整数型的序号记载其在容器中的位置,可以根据序号存取容器中的元素。
 *4)JDK API中List接口的实现类有:ArrayList LinkedList Vector
 *创建人:郝鸿儒
 *创建时间:2021年6月19日 上午10:49:54
 *版本: 1.0
 */
public class Info {
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("Tom");
		list.add("Anni");
		list.add("Mary");
		list.add("Jhon");
		
		System.out.println(list);//1) List集合类中元素有序(即添加顺序和取出顺序一致)、且可重复
		System.out.println(list.get(2));//2) List集合中的每个元素都有其对应的顺序索引，即支持索引。从 0 开始
	}

}
