package com.star;

public class Homework07 {

	public static void main(String[] args) {
		Dog dog = new Dog("大白", "黑色", 66);
		dog.show();

	}

}


class Dog{
	String name;
	String color;
	int age;
	
	Dog(String name, String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	public void show() {
		System.out.println(this.name + "\t" + this.color + "\t" + this.age);
	}
}