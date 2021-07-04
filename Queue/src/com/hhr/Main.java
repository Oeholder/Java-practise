package com.hhr;

import com.deque.Deque;

public class Main {

	public static void main(String[] args) {
//		Queue_By_LinkedList<Integer> q = new Queue_By_LinkedList<>();
//		testList(q);
//		Queue<Integer> queue = new Queue<>();
//		queue.enQueue(11);
//		queue.enQueue(33);
//		queue.enQueue(44);
//		queue.enQueue(55);
//		queue.deQueue();
//		System.out.println(queue.front());
//		System.out.println(queue);
		Deque<Integer> deque = new Deque<>();
		deque.enQueueFront(11);
		deque.enQueueRear(22);
		deque.enQueueFront(44);
		deque.enQueueFront(55);
		deque.enQueueRear(33);
		deque.enQueueRear(66);
		System.out.println(deque);
		deque.deQueueFront();
		deque.deQueueRear();
		deque.deQueueFront();
		System.out.println(deque);
		System.out.println(deque.front());
		System.out.println(deque.rear());
	}

	static void testList(Queue_By_LinkedList<Integer> queue_By_LinkedList) {
		queue_By_LinkedList.enQueue(11);
		queue_By_LinkedList.enQueue(33);
		queue_By_LinkedList.enQueue(44);
		queue_By_LinkedList.enQueue(55);
		queue_By_LinkedList.deQueue();
		System.out.println(queue_By_LinkedList.front());
		System.out.println(queue_By_LinkedList);
			
	}
}
