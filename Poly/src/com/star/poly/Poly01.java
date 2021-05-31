package com.star.poly;

/**
 * 
 *项目名称：Poly
 *类名称：Poly01
 *类描述：多态
 *传统方法代码复用性不高
 *创建人： 郝鸿儒
 *创建时间：2021年5月25日 下午4:45:37
 * @version
 */
public class Poly01 {

	public static void main(String[] args) {
		Master tom = new Master("汤姆");
		Animal animal = new Dog("大黄");
		Food food = new Food("排骨");
		tom.feed(animal, food);
		
		animal = new Cat("大橘");
		food = new Fish("炸鱼");
		tom.feed(animal, food);
		
	}

}
