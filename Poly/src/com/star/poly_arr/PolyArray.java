package com.star.poly_arr;

/**
 * 
 *项目名称:Poly
 *类名称:PolyArray
 *类描述:多态数组——数组的定义类型为父类类型，里面保存到实际元素为子类类型
 *创建人:郝鸿儒
 *创建时间:2021年5月26日 下午4:34:10
 * @version
 */
public class PolyArray {

	public static void main(String[] args) {
		//创建1个Person，2个Student，2个Teacher，放在数组中
		Person persons[] = new Person [5];
		
		persons[0] = new Person("老王", 56);
		persons[1] = new Student("小明", 11, 95);
		persons[2] = new Student("小强", 12, 88);
		persons[3] = new Teacher("老韩", 45, 5000);
		persons[4] = new Teacher("老李", 60, 6000);
		
		for (Person person : persons) {
			person.say();//动态绑定机制
		}
		
		//persons[1].study();//无法访问
		
		for (int i = 0; i < persons.length; i++) {
			if(persons[i] instanceof Student) {
				((Student)persons[i]).study();
			}else if(persons[i] instanceof Teacher){
				((Teacher)persons[i]).teach();
			}
		}
		
	}

}
