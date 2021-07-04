package com.hhr;

/**
 * 
 *项目名称:Queue
 *类名称:Queue
 *类描述:队列
 *创建人:郝鸿儒
 *创建时间:2021年7月4日 上午9:33:29
 *版本: 1.0
 */
public class Queue<E> {

	LinkedList<E> list = new LinkedList<>();
	
	public int size() {
		return list.size;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void enQueue(E element) {
		list.add(element);
	}
	
	public E deQueue() {
		return list.remove(0);
	}
	
	public E front() {
		return list.get(0);
	}
	
	public void clear() {
		list.clear();
	}
	
	@Override
		public String toString() {
			return list.toString();
		}
}
