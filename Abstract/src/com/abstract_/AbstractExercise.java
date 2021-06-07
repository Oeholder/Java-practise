package com.abstract_;

public class AbstractExercise {

	public static void main(String[] args) {
		
	}

}

abstract class Employee{
	private String name;
	private int id;
	private double salary;
	
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public abstract void work();

}

class Manager extends Employee{
	private double bouns;

	public Manager(String name, int id, double salary, double bouns) {
		super(name, id, salary);
		this.bouns = bouns;
	}
	
	@Override
	public void work() {
		System.out.println("经理工作中");
	}
	
}

class CommonEmployee extends Employee{
	
	public CommonEmployee(String name, int id, double salary) {
		super(name, id, salary);
	}
	
	@Override
	public void work(){
		System.out.println("普通员工工作中");
	}
}