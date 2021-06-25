package com.hhr;

/**
 * 
 *项目名称:LinkedList
 *类名称:AbstractList
 *类描述:抽象类：不可以被创建，抽取公共代码，实际中并不使用，实际中一般使用List 以及它的子类，
 *所以 DEFAULT_CAPACITY 和 ELEMENT_NOT_FOUND 这种被调用的量，放在List中比较合适
 *创建人:郝鸿儒
 *创建时间:2021年6月24日 下午9:33:47
 *版本: 1.0
 */
public abstract class AbstractList<E> implements List<E>{

	/**
	 * 元素数量（数组长度）
	 */
	protected int size;
	
	/**
	 * 所有元素（数组）
	 */
	protected E[] elements;

	
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
	}
	
	/**
	 * 抛出index异常
	 * @param index
	 */
	protected void outOfBounds(int index) {
		throw new IndexOutOfBoundsException("Index" + index + ",Size:" + size);
	}
	/**
	 * 检测index异常
	 * @param index
	 */
	protected void rangeCheck(int index) {
		if(index < 0||index >= size) outOfBounds(index);
	}
	protected void rangeCheckForAdd(int index) {
		if(index < 0||index > size) outOfBounds(index);
	}
}
