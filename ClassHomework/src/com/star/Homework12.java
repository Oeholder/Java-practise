package com.star;
/**
 * 
 *项目名称：ClassHomework
 *类名称：Homework12
 *类描述：作业
 *创建人： 郝鸿儒
 *创建时间：2021年5月22日 下午4:25:43
 * @version
 */
public class Homework12 {

	public static void main(String[] args) {
		Employee employee = new Employee("Tom", "male", 10, "总监", 10000);

	}

}

class Employee{
	String name;
	String gender;
	int age;
	String position;
	int salary;
	
	public Employee(String position, int salary) {
		this.position = position;
		this.salary = salary;
	}
	
	public Employee(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public Employee(String name, String gender, int age, String position, int salary) {
		this(name, gender, age);
		this.position = position;
		this.salary = salary;
	}
	
}