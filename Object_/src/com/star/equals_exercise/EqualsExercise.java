package com.star.equals_exercise;

public class EqualsExercise {

	public static void main(String[] args) {
		Person p1 = new Person("Tom", 19, '1');
		Person p2 = new Person("Jack", 5, '0');
		Person p3 = new Person("Tom", 19, '1');
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
	}

}
