package com.hhr;

/**
 * 
 *项目名称:Stack
 *类名称:Stack
 *类描述:栈
 *创建人:郝鸿儒
 *创建时间:2021年7月1日 上午10:35:04
 *版本: 2.0
 */
public class Stack<E> {
	private List<E> list = new ArrayList<>();
	
	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return false;
	}


	public void push(E element) {
		list.add(element);
	}

	public E pop() {
		return list.remove(size() - 1);
	}

	public E top() {
		return list.get(size() - 1);
	}
	
	public void clear() {
		list.clear();
	}

	@Override
	public String toString() {
		return list.toString();
	}
}
