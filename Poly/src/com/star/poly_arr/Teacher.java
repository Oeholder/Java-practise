package com.star.poly_arr;

public class Teacher extends Person{
	private double salary;
	
	public Teacher(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void say() {
		System.out.println("Teacher " + super.getName() + " is saying");
	}

	public void teach() {
		System.out.println("Teacher " + super.getName() + " is teaching");
	}
}
