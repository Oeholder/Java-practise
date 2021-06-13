package com.exercise;

public class CostomException {

	public static void main(String[] args) {
		Person p = new Person(11, "Tom");
		
	}

}

@SuppressWarnings("all")
class Person{
	private int age;
	private String name;
	
	public Person(int age, String name) throws AgeException{
		super();
		if(age < 18 || age > 120) {
			throw new AgeException("年龄需要在18-120之间");
		}
		this.age = age;
		this.name = name;
	}
	
}

@SuppressWarnings("all")
class AgeException extends RuntimeException{//把自定义异常做成运行时异常，好处是可以使用默认处理机制
	public AgeException(String message) {
		super(message);
	}
}