package com.star.override_exercise;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String say() {
		return "我的名字是" + name + "，今年" + age + "岁。" ;
	}

}
