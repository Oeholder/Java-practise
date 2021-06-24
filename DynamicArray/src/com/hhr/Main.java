package com.hhr;

public class Main {

	public static void main(String[] args) {
		ArrayList<Person> person = new ArrayList<>();
		person.add(new Person(10, "Jack"));
		person.add(new Person(2, "Ham"));
		person.add(new Person(15, "Rick"));
		System.out.println(person);
		person.clear();
		//提醒JVM进行垃圾回收
		System.gc();
		
	}
	
	static void test() {
		//Integer 是 int 包装类
			ArrayList<Integer> list = new ArrayList<>();
			
			list.add(-10);
			list.add(20);
			list.add(30);
			list.remove(1);
			list.add(list.size(), 5);
			list.set(0, 99);
			System.out.println(list);
			
	}

}
