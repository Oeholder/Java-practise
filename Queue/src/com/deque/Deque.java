package com.deque;

import com.hhr.LinkedList;

public class Deque<E> {
	LinkedList<E> list = new LinkedList<>();
	/**
	 * 元素数量
	 * @return
	 */
	public int size() {
		return list.size();
	}
	/**
	 * 是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}
	/**
	 * 从队尾入队
	 * @param element
	 */
	public void enQueueRear(E element) {
		list.add(element);
	}
	/**
	 * 从对头出队
	 * @param element
	 * @return
	 */
	public E deQueueFront() {
		return list.remove(0);
	}
	/**
	 * 从对头入队
	 * @param element
	 */
	public void enQueueFront(E element) {
		list.add(0,element);
	}
	/**
	 * 从队尾出队
	 * @return
	 */
	public E deQueueRear() {
		return list.remove(list.size() - 1);
	}
	/**
	 * 获取队列的头元素
	 * @return
	 */
	public E front() {
		return list.get(0);
	}
	/**
	 * 获取队列的尾元素
	 * @return
	 */
	public E rear() {
		return list.get(list.size() - 1);
	}
	/**
	 * 打印队列
	 */
	@Override
	public String toString() {
		return list.toString();
	}
}
