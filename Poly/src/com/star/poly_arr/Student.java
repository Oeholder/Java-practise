package com.star.poly_arr;

public class Student extends Person{
	private int score;
	
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public void say() {
		System.out.println("Student " + super.getName() + " is saying");
	}

	public void study() {
		System.out.println("Student " + super.getName() + " is studying");
	}
}
