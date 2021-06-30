package com.hhr.single;

import com.hhr.AbstractList;

/**
 * 
 *项目名称:LinkedList
 *类名称:SingleCircularLinkedList
 *类描述:单向循环链表
 *创建人:郝鸿儒
 *创建时间:2021年6月30日 下午10:00:03
 *版本: 1.0
 */
@SuppressWarnings("all")
public class SingleCircularLinkedList<E> extends AbstractList<E>{
	private Node first;
	
	public SingleCircularLinkedList() {
		
	}
	
	public SingleCircularLinkedList(int size) {
		this.first = first;
	}

	private static class Node<E>{
		E element;
		Node<E> next;
		
		public Node(E element, Node<E> next) {
			this.element = element;
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
		if (index == 0) {
			first = new Node<E>(element, first);
		}else {
			Node<E> prve = node(index - 1);
			if(index == size) {
				prve.next = new Node<E>(element, first.next);
			}else {
				prve.next = new Node<E>(element, prve.next);
			}
		}
		size++;
	}

	@Override
	public E remove(int index) {
		rangeCheck(index);
		E oldElement = node(index).element;
		if (index == 0) {
			first = first.next;
			node(size - 1).next = first.next;
		}else {
			Node<E> prve = node(index - 1);
			prve.next = prve.next.next;
			
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
			for (int i = 0; i < size; i++) {
				if(node.element == null) return i;
				node = node.next;
			}
		}else {
			for (int i = 0; i < size; i++) {
				if(node.element.equals(element)) return i;
				node = node.next;
			}
		}
		
		return ELEMENT_NOT_FOUND;
	}

	@Override
	public void clear() {
		size = 0;
		first = null;
	}
	
	/**
	 * 获取index值对应节点对象
	 * @param index
	 * @return
	 */
	private Node<E> node(int index) {
		rangeCheck(index);
		Node<E> node = first;
		for (int i = 0; i < index; i++) {
			node = node.next;
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
