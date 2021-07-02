package com.hhr;

/**
 * 
 *项目名称:LinkedList
 *类名称:DoubleLinkedList
 *类描述:双向链表
 *创建人:郝鸿儒
 *创建时间:2021年6月30日 下午2:12:14
 *版本: 1.0
 */
@SuppressWarnings("all")
public class LinkedList<E> extends AbstractList<E>{
	private Node<E> first;
	private Node<E> last;
	
	public LinkedList() {
		
	}
	
	public LinkedList(int size) {
		this.first = first;
		this.last = last;
	}
	
	private static class Node<E>{
		E element;
		Node<E> prev;
		Node<E> next;

		
		public Node(E element, Node<E> prev, Node<E> next) {
			this.element = element;
			this.prev = prev;
			this.next = next;
		}
				
	}

	@Override
	public E get(int index) {
		return node(index).element;
	}

	@Override
	public E set(int index, E element) {
		E oldElement = node(index).element;
		node(index).element = element;
		return oldElement;
	}

	@Override
	public void add(int index, E element) {
		rangeCheckForAdd(index);
		
		if (index == size) {
			Node<E> oldLast = last;
			last = new Node<>(element, oldLast, null);
			if (oldLast == null) {
				first = last;
			}else {
				oldLast.next = last;
			}
		}else {
			Node<E> next = node(index);
			Node<E> prev = next.prev;
			Node<E> node = new Node<>(element, prev, next);
			
			if (prev == null) {
				first = node;
			}else{
				prev.next = node;
				next.prev = node;
			}
		}
		
		size++;
	}

	@Override
	public E remove(int index) {
		rangeCheck(index);
		Node<E> node = node(index);
		E oldElement = node.element;
		
		Node<E> prev = node.prev;
		Node<E> next = node.next;
			
		if (prev == null) {
			 first = next;
		}else {
			 prev.next = next;
		}
			 
		if (next == null) { 
			 last = prev;
		}else {
			  next.prev = prev;
		}
			 
		size--;
		return oldElement;
	}

	@Override
	public void remove(E element) {
		remove(indexOf(element));
	}

	@Override
	public int indexOf(E element) {
		Node<E> node = first;
		if(element == null) {
			for(int i = 0; i < size; i++) {
				if(node.element == null) return i;
				node = node.next;
			}
		}else {
			for(int i = 0; i < size; i++) {
				if(element.equals(node.element)) return i;
				node = node.next;
			}
		}
		return ELEMENT_NOT_FOUND;
	}

	@Override
	public void clear() {
		size = 0;
		first = null;
		last = null;
	}
	
	/**
	 * 获取index值对应节点对象
	 * @param index
	 * @return
	 */
	private Node<E> node(int index) {
		rangeCheck(index);
		Node<E> node;
		if(index <= (size >> 1)) {
			node = first;
			for (int i = 0; i < index; i++) {
				node = node.next;
			}
		}else {
			node = last;
			for (int i = size - 1; i > index; i--) {
				node = node.prev;
			}
		}
		
		return node;
	}
	
	/**
	 * 打印输出
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("size=").append(size).append(", [");
		Node<E> node = first;
		for (int i = 0; i < size; i++) {
			if(i != 0) str.append(", ");
			str.append(node.element);
			node = node.next;
		}
		str.append("]");
		return str.toString();
	}
}
