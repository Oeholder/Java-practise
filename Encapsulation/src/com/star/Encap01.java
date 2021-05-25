package com.star;

/**
 * 
 *项目名称：Encapsulation
 *类名称：Encapsulation
 *类描述：封装
 *封装的好处：1.可以隐藏实现细节
 *		   2.可以对数据进行验证，保证安全合理
 *创建人： 郝鸿儒
 *创建时间：2021年5月23日 下午4:04:28
 * @version
 */
public class Encap01 {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Tom");
		person.setAge(25);
		person.setSalary(1000);
		person.setJob("Worker");
		System.out.println(person.info());

	}

}

class Person{
	public String name;
	private int age;
	private double salary;
	private String job;
	
	public String getName() {
		return name;
	}
	
	public String setName(String name) {
		if(name.length() <= 2 || name.length() >= 6) {
			return this.name;
		}
		return this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int setAge(int age) {
		if(age <= 1 || age >= 120) {
			return this.age;
		}
		return this.age = age;
	}
	
	public double setSalary(double salary) {
		return this.salary = salary;
	}
	
	public String getJob() {
		return job;
	}
	
	public String setJob(String job) {
		return this.job = job;
	}
	
	public String info() {
		return "信息如下：\n姓名:" + name + " 年龄:" + age + " 薪水:" + salary + " 职业:" + job;
	}
}