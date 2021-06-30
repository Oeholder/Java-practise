package com.hhr;

@SuppressWarnings("all")
public class Main {

	public static void main(String[] args) {
		//test();
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.get(2));
		list.remove(1);
		list.add(list.size(), 5);
		list.set(0, 99);
		list.add(3,5);
		System.out.println(list);
	}
	
	static void test() {
		//Integer 是 int 包装类
			List<Integer> list = new ArrayList<>();
			
			list.add(-10);
			list.add(20);
			list.add(30);
			list.remove(1);
			list.add(list.size(), 5);
			list.set(0, 99);
			System.out.println(list);
			
	}

}
