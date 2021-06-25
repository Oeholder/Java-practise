package com.hhr;
/**
 *项目名称:LinkedList
 *类名称:LinkedList
 *类描述:链表
 *创建人:郝鸿儒
 *创建时间:2021年6月24日 上午11:10:19
 *版本: 1.0
 */
@SuppressWarnings("all")
public class LinkedList<E> extends AbstractList<E>{
	private Node fistNode;
	
	public LinkedList() {
		
	}
	
	public LinkedList(int size) {
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
	}

	@Override
	public E set(int index, E element) {
		E oldElement = node(index).element;
		node(index).element = element;
		return oldElement;
	}

	@Override
	public void add(int index, E element) {
		if(index == 0) {
			fistNode = new Node<>(element, fistNode);
		}else {
			Node<E> prev = node(index - 1);
			prev.nextNode = new Node<>(element, prev.nextNode);
		}
		size++;
	}

	@Override
	public E remove(int index) {
		E oldElement = node(index).element;
		if(index == 0) {
			fistNode = fistNode.nextNode;
		}else {
			Node<E> prev = node(index - 1);
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
