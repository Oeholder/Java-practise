package com.hhr.single;

import com.hhr.AbstractList;

/**
 *项目名称:LinkedList
 *类名称:LinkedList
 *类描述:链表
 *创建人:郝鸿儒
 *创建时间:2021年6月24日 上午11:10:19
 *版本: 1.0
 */
/*
 * 虚拟头结点:有时候为了让代码更加精简，统一所有节点的处理逻辑，可以在最前面增加一个虚拟的头结点（不存储数据)
 */
@SuppressWarnings("all")
public class SingleLinkedList<E> extends AbstractList<E>{
	private Node fistNode;
	
	public SingleLinkedList() {
		
	}
	
	public SingleLinkedList(int size) {
		super();
		this.fistNode = fistNode;
	}
	
	private static class Node<E>{
		E element;
		Node<E> nextNode;

		
		public Node(E element, Node<E> nextNode) {
			super();
			this.element = element;
			this.nextNode = nextNode;
		}
				
	}

	@Override
	public E get(int index) {
		return node(index).element;
		/* 
		 * 最好复杂度O(1)
		 * 最坏复杂度O(n)
		 * 平均复杂度O((1+2+3+...+n)/n) = O(n/2) = O(n)
		 */
	}

	@Override
	public E set(int index, E element) {
		E oldElement = node(index).element;
		node(index).element = element;
		/* 
		 * 最好复杂度O(1)
		 * 最坏复杂度O(n)
		 * 平均复杂度O((1+2+3+...+n)/n) = O(n/2) = O(n)
		 */
		return oldElement;
	}

	@Override
	public void add(int index, E element) {
		rangeCheckForAdd(index);
		if(index == 0) {
			fistNode = new Node<>(element, fistNode);//最好复杂度O(1)
		}else {
			Node<E> prev = node(index - 1);
			/* 
			 * 最坏复杂度O(n)
			 * 平均复杂度O((1+2+3+...+n)/n) = O(n/2) = O(n)
			 */
			prev.nextNode = new Node<>(element, prev.nextNode);
		}
		size++;
	}

	@Override
	public E remove(int index) {
		rangeCheck(index);
		E oldElement = node(index).element;
		if(index == 0) {
			fistNode = fistNode.nextNode;//最好复杂度O(1)
		}else {
			Node<E> prev = node(index - 1);
			/* 
			 * 最坏复杂度O(n)
			 * 平均复杂度O((1+2+3+...+n)/n) = O(n/2) = O(n)
			 */
			prev.nextNode = node(index).nextNode;
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
		
		Node<E> node = fistNode;
		if(element == null) {
			for(int i = 0; i < size; i++) {
				if(node.element == null) return i;
				node = node.nextNode;
			}
		}else {
			for(int i = 0; i < size; i++) {
				if(element.equals(node.element)) return i;
				node = node.nextNode;
			}
		}
		return ELEMENT_NOT_FOUND;
	}

	@Override
	public void clear() {
		size = 0;
		fistNode = null;
	}
	
	/**
	 * 获取index值对应节点对象
	 * @param index
	 * @return
	 */
	private Node<E> node(int index) {
		rangeCheck(index);
		Node<E> node = fistNode;
		for (int i = 0; i < index; i++) {
			/* 
			 * 最好复杂度O(1)
			 * 最坏复杂度O(n)
			 * 平均复杂度O((1+2+3+...+n)/n) = O(n/2) = O(n)
			 */
			node = node.nextNode;
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
		Node<E> node = fistNode;
		for (int i = 0; i < size; i++) {
			if(i != 0) str.append(", ");
			str.append(node.element);
			node = node.nextNode;
		}
		str.append("]");
		return str.toString();
	}
}
