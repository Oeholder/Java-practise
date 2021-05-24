package com.star;

public class ThisExercise {

	public static void main(String[] args) {
		Person person = new Person("Tom", 5);
		TestPerson tPerson01 = new TestPerson("Jack", 5);
		TestPerson tPerson02 = new TestPerson("Tom", 5);
		System.out.println(person.compareTo(tPerson02));
		System.out.println(person.compareTo(tPerson01));

	}

}

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean compareTo(TestPerson tP){
		return tP.name.equals(this.name) && tP.age == this.age;
	}
	
}

class TestPerson{
	String name;
	int age;
	
	public TestPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
}