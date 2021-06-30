package com.hhr;

import com.hhr.single.ArrayList;
import com.hhr.single.SingleCircularLinkedList;
import com.hhr.single.SingleLinkedList;

@SuppressWarnings("all")
public class Main {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		testList(arrayList);
		List<Integer> singleLinkedList = new SingleLinkedList<>();
		testList(singleLinkedList);
		List<Integer> linkedList = new LinkedList<>();
		testList(linkedList);
		List<Integer> singleCircularLinkedList = new SingleCircularLinkedList<>();
		testList(singleCircularLinkedList);
		
	}
	

	static void testList(List list) {
		
		list.add(1);
		list.add(2);
		list.add(31);
		list.add(67);
		list.add(88);
		list.add(3);
		System.out.println(list.get(2));
		list.remove(1);
		list.remove(0);
		list.remove(list.size() - 1);
		list.add(list.size(), 5);
		list.set(0, 99);
		list.add(3,5);
		System.out.println(list);
			
	}

}
