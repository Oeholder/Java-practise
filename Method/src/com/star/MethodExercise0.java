package com.star;

public class MethodExercise0 {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.age = 18;
		person1.name = "jack";
		Person person2 = new Person();
		MyTools tool = new MyTools();
		person2 = tool.copyPerson(person1);
		person2.age = 25;
		System.out.println(person1.age + "  " + person1.name);
		System.out.println(person2.age + "  " + person2.name);
		
	}

}
class MyTools{
	/**
	 * 打印二维数组
	 * @param arr
	 */
	public void printTwoDimArr(int arr[][]) {
		for (int i[] : arr) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
	/**
	 * 复制一个Person类
	 * @param person
	 * @return
	 */
	public Person copyPerson(Person person) {
		Person copyPerson = new Person();
		copyPerson.age = person.age;
		copyPerson.name = person.name;
		return copyPerson;
	}
	
}
class Person{
	int age;
	String name;
}