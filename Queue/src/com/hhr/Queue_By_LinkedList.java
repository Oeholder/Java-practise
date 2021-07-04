package com.hhr;

public class Queue_By_LinkedList<E> extends LinkedList<E>{
	
//	@Override
//	public int size() {
//		return super.size;
//	}
//	
//	@Override
//	public boolean isEmpty() {
//		return super.isEmpty();
//	}

	public void enQueue(E element) {
		super.add(element);
	}
	
	public E deQueue() {
		return super.remove(0);
	}
	
	public E front() {
		return super.get(0);
	}
	
	public void clear() {
		super.clear();
	}
	
	@Override
		public String toString() {
			return super.toString();
		}
}
