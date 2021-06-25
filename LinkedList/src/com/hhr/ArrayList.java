package com.hhr;

import java.util.Iterator;
/**
 *项目名称:DynamicArray
 *类名称:ArrayList
 *类描述:动态数组
 *创建人:郝鸿儒
 *创建时间:2021年6月24日 上午11:09:50
 *版本: 1.0
 */
@SuppressWarnings("all")
public class ArrayList<E> extends AbstractList<E>{
	
	public ArrayList(int capacity) {
		capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
		elements = (E[]) new Object[capacity];//向下转型
	}
	
	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}
	
	@Override
	public E get(int index) {
		rangeCheck(index);
		return elements[index];
	}
	
	@Override
	public E set(int index, E element) {
		rangeCheck(index);
		E old = elements[index];
		elements[index] = element;
		return old;
	}
	
	@Override
	public void add(int index, E element) {
		rangeCheckForAdd(index);
		ensureCapacity(size + 1);
		
		for (int i = size - 1; i >= index; i--) {
			elements[i + 1] = elements[i];
		}
		elements[index] = element;
		size++;
	}
	
	@Override
	public E remove(int index) {
		rangeCheck(index);
		E old = elements[index];
		for (int i = 0; i < size - index; i++) {
			elements[index] = elements[index + 1];
		}
		elements[--size] = null;
		return old;
	}
	
	@Override
	public void remove(E element) {
		remove(indexOf(element));
	}
	
	@Override
	public int indexOf(E element) {
		if(element == null) {
			for(int i = 0; i < size; i++) {
				if(elements[i] == null) return i;
			}
		}else {
			for(int i = 0; i < size; i++) {
				if(element.equals(elements[i])) return i;
			}
		}
		return ELEMENT_NOT_FOUND;
	}
	
	@Override
	public void clear() {
		for (int i = 0; i < size; i++) {
			elements[i] = null;
		}
		size = 0;
	}
	
	
	@Override//equals方法可以重写
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	/**
	 * 保证数组容量
	 * @param capacity
	 */
	private void ensureCapacity(int Capacity) {
		int oldCapacity = elements.length;
		if(oldCapacity > Capacity) return;
		//新容量为旧容量的1.5倍
		//int newCapacity = oldCapacity * 1.5;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		E[] newElements = (E[]) new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newElements[i] = elements[i];
		}
		elements = newElements;
		//System.out.println(oldCapacity + "扩容为：" + newCapacity);
	}
	
	@Override
	/**
	 * 打印输出
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("size=").append(size).append(", [");
		for (int i = 0; i < size; i++) {
			if(i != 0) str.append(", ");
			str.append(elements[i]);
			//if(i != size - 1) str.append(", ");
		}
		str.append("]");
		return str.toString();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Finliaze");
	}
	
}
