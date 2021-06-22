package com.exercise;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExercise {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(new Dog("TOM", 2));
		list.add(new Dog("JHON", 5));
		list.add(new Dog("JACK", 8));
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		for (Object object : list) {
			System.out.println(object);
		}
	}

}

class Dog{
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	
	
}