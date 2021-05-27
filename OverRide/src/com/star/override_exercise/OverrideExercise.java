package com.star.override_exercise;

public class OverrideExercise {

	public static void main(String[] args) {
		Person p = new Person("小明", 12);
		System.out.println(p.say());
		
		Student s = new Student("小强", 8, 9527, 99);
		System.out.println(s.say());
		
	}

}
