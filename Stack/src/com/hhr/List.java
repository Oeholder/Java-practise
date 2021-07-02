package com.hhr;

public interface List<E> {
	static final int DEFAULT_CAPACITY = 10;
	static final int ELEMENT_NOT_FOUND = -1;
	
	/**
	 * 元素数量
	 * @return
	 */
	int size();
	
	/**
	 * 是否为空
	 * @return
	 */
	boolean isEmpty();
	
	/**
	 * 是否包含某个元素
	 * @param element
	 * @return
	 */
	boolean contains(E element);
	
	/**
	 * 添加元素到尾部
	 * @param element
	 */
	void add(E element);
	
	/**
	 * 获取index位置的元素
	 * @param index
	 * @return index位置的元素
	 */
	E get(int index);
	
	/**
	 * 设置index位置的元素
	 * @param index
	 * @param element
	 * @return 原来在index位置的元素
	 */
	E set(int index, E element);
	
	/**
	 * 在index位置插入元素
	 * @param index
	 * @param element
	 */
	void add(int index, E element);
	
	/**
	 * 删除index位置的元素
	 * @param index
	 * @return 删除的元素
	 */
	E remove(int index);
	
	/**
	 * 删除指定元素
	 * @param element
	 */
	void remove(E element);
	
	/**
	 * 查看元素索引
	 * @param element
	 * @return
	 */
	int indexOf(E element);
	
	/**
	 * 清除所有元素
	 */
	void clear();

}
