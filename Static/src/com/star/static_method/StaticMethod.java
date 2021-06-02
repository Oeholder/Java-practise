package com.star.static_method;

public class StaticMethod {

	public static void main(String[] args) {
		Student s1 = new Student("Tom");
		Student.feeSum(100);
		Student s2 = new Student("Tom");
		Student.feeSum(100);
		Student s3 = new Student("Tom");
		Student.feeSum(100);
	
		System.out.println(Student.feeSum(0));
		
		Student s4 = new Student("Tom");
		s4.payFee(200);
		Student s5 = new Student("Tom");
		s5.payFee(200);
		Student s6 = new Student("Tom");
		s6.payFee(230);
		
		System.out.println(s6.payFee(0));
		
	}

}

class Student{
	private String name;
	//定义静态变量，计算学费总和
	private static double fee = 0;
	private double fee1 = 0;
	
	public Student(String name) {
		this.name = name;
	}
	
	public static double feeSum(double fee) {
		//类方法中只能访问静态变量或静态方法
		//类方法中无this和super，不允许使用和对象相关的关键字
		return Student.fee += fee;
	}
	//普通成员方法都可以访问
	public double payFee(double fee) {
		return this.fee1 += fee;
	}
	
}