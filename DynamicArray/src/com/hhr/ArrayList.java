
package com.hhr;

import java.util.Iterator;
@SuppressWarnings({ "unchecked", "unused" })
public class ArrayList<E> {
	/**
	 * 元素数量（数组长度）
	 */
	private int size;
	/**
	 * 所有元素（数组）
	 */
	//java中所有类最终继承java.lang.Object(除了Object)
	private E[] elements;
	
	private static final int DEFAULT_CAPACITY = 10;
	private static final int ELEMENT_NOT_FOUND = -1;
	
	public ArrayList(int capacity) {
		capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
		elements = (E[]) new Object[capacity];//向下转型
	}
	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}
	/**
	 * 元素数量
	 * @return
	 */
	public int size() {
		return size;
	}
	/**
	 * 是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	/**
	 * 是否包含某个元素
	 * @param element
	 * @return
	 */
	public boolean contains(E element){
		return indexOf(element) != ELEMENT_NOT_FOUND;
	}
	/**
	 * 添加元素到尾部
	 * @param element
	 */
	public void add(E element){
		add(size, element);
		//elements[size] = element;
		//size++;
		//elements[size++] = element;
	}
	/**
	 * 获取index位置的元素
	 * @param index
	 * @return
	 */
	public E get(int index) {
		rangeCheck(index);
		return elements[index];
	}
	/**
	 * 设置index位置的元素
	 * @param index
	 * @param element
	 * @return 原来在index位置的元素
	 */
	public E set(int index, E element) {
		rangeCheck(index);
		E old = elements[index];
		elements[index] = element;
		return old;
	}
	/**
	 * 在index位置插入元素
	 * @param index
	 * @param element
	 */
	public void add(int index, E element) {
		rangeCheckForAdd(index);
		ensureCapacity(size + 1);
		
		for (int i = size - 1; i >= index; i--) {
			elements[i + 1] = elements[i];
		}
		elements[index] = element;
		size++;
	}
	/**
	 * 删除index位置的元素
	 * @param index
	 * @return 删除的元素
	 */
	public E remove(int index) {
		rangeCheck(index);
		E old = elements[index];
		for (int i = 0; i < size - index; i++) {
			elements[index] = elements[index + 1];
		}
		size--;
		return old;
	}
	/**
	 * 查看元素索引
	 * @param element
	 * @return
	 */
	public int indexOf(E element) {
		for(int i = 0; i < size; i++) {
			if(elements[i] == element) return i;
		}
		return ELEMENT_NOT_FOUND;
	}
	/**
	 * 清除所有元素
	 */
	public void clear() {
		for (int i = 0; i < size; i++) {
			elements[i] = null;
		}
		size = 0;
		//与elements = null;效果不同，
		//如果采用elements = null;数组下一次要重新开辟空间，
		//如果采用elements[i] = null;数组可以循环利用
	}
	@Override
	/**
	 * 改变默认值
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
	
	/**
	 * 抛出index异常
	 * @param index
	 */
	private void outOfBounds(int index) {
		throw new IndexOutOfBoundsException("Index" + index + ",Size:" + size);
	}
	/**
	 * 检测index异常
	 * @param index
	 */
	private void rangeCheck(int index) {
		if(index < 0||index >= size) outOfBounds(index);
	}
	private void rangeCheckForAdd(int index) {
		if(index < 0||index > size) outOfBounds(index);
	}
}
