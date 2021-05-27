package com.star.override_exercise;

public class Student extends Person{
	private int id;
	private int score;
	
	public Student(String name, int age, int id, int score) {
		super(name, age);
		this.id =id;
		this.score = score;
	}
	
	public String say() {
		return super.say() + "我的ID号码是：" + id +"，这次的成绩是：" + score + "分。"; 
	}
}
