package com.star.poly;

public class Master {
	String name;
	public Master(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//主人给小狗喂骨头
	public void feed(Animal animal, Food food) {
		System.out.println("主人" + name + "给" + animal.getName() + "喂" + food.getName());
	}
}
