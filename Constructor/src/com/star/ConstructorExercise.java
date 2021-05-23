package com.star;

public class ConstructorExercise {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("张三",26);
		System.out.println(p1.age);
		System.out.println(p2.age + "\t" + p2.name);
		
	}

}

class Person{
	int age;
	String name;
	Person() {
		age = 18;
	}
	Person(String pName, int pAge){
		name =pName;
		age = pAge;
	}
}