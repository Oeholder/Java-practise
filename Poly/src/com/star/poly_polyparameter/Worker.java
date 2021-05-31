package com.star.poly_polyparameter;

public class Worker extends Employee{
	
	public Worker(String name, double salary) {
		super(name, salary);
	}
	
	public void work() {
		System.out.println("working");
	}
	
	@Override
	public double getAnnual() {
		return super.getSalary() * 12;
	}
	
}
