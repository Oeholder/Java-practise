package com.hhr;

import com.hhr.LinkedList.Node;

/**
 * 
 *项目名称:LinkedList
 *类名称:CircularLinkedList
 *类描述:双向循环链表
 *创建人:郝鸿儒
 *创建时间:2021年6月30日 下午11:00:38
 *版本: 1.0
 */
@SuppressWarnings("all")
class CircularLinkedList<E> extends AbstractList<E>{
	private Node first;
	private Node last;
	
	public CircularLinkedList() {
		
	}

	public CircularLinkedList(int size) {
		super();
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
				last.next = first;
				first.prev = last;
			}
		}else {
			Node<E> next = node(index);
			Node<E> prev = next.prev;
			Node<E> node = new Node<>(element, prev, next);
			
			if (prev == null) {
				first = node;
				last.next = first;
				first.prev = last;
			}else{
				prev.next = node;
				next.prev = node;
			}
		}
	}



	@Override
	public E remove(int index) {
		
	}



	@Override
	public void remove(E element) {
		remove(indexOf(element));
	}



	@Override
	public int indexOf(E element) {
		Node<E> node = first;
		if (element == null) {
			for (int i = 0; i < size; i++) {
				if (node.element == null) return i;
				node =node.next;
			}
		}else {
			for (int i = 0; i < size; i++) {
				if (node.element.equals(element)) return i;
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
			for (int i = size; i > index; i++) {
				node = node.prev;
			}
		}
		return node;
	}
}
