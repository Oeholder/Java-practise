package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 
 *项目名称:Collection
 *类名称:Iterator_
 *类描述:Collection接口遍历元素方式
 *1.使用Iterator迭代器
 *	1) Iterator对象称为迭代器,主要用于遍历Collection集合中的元素。
 *	2) 所有实现了Collection接口的集合类都有一个iterator()方法,用以返回一个实现了lterator接口的对象,即可以返回一个迭代器。
 *	3) lterator的结构.[图:]
 *	4) lterator仅用于遍历集合,Iterator本身并不存放对象。
 *创建人:郝鸿儒
 *创建时间:2021年6月18日 上午10:21:49
 *版本: 1.0
 */
public class Iterator_ {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection col = new ArrayList();
		
		col.add(new Books("三国演义", "罗贯中", 39.9));
		col.add(new Books("小李飞刀", "古龙", 29.9));
		col.add(new Books("毛泽东选集", "毛泽东", 99.9));
		
		System.out.println(col);
		
		Iterator iterable = col.iterator(); 
		
		while (iterable.hasNext()) {
			Object object = (Object) iterable.next();
			System.out.println(object);
		}
		//3．当退出while循环后，这时iterator迭代器，指向最后的元素l/iterator.next(); //NoSuchElementException
		//4．如果希望再次遍历，需要重置我们的迭代器
		iterable = col.iterator(); 
		while (iterable.hasNext()) {
			Object object = (Object) iterable.next();
			System.out.println(object);
		}
	}
	
}


class Books{
	private String name;
	private String author;
	private double price;
	
	public Books(String name, String author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Books [name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
}