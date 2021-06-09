package com.enumeration02;

/**
 * 
 *项目名称:Enumeration
 *类名称:enumeration02
 *类描述:自定义类实现枚举
 *1.不需要提供setXxx方法，因为枚举对象值通常为只读.
 *2.对枚举对象/属性使用final + static共同修饰，实现底层优化.
 *3.枚举对象名通常使用全部大写，常量的命名规范.
 *4.枚举对象根据需要，也可以有多个属性
 *
 *创建人:郝鸿儒
 *创建时间:2021年6月6日 上午11:09:08
 *版本: 1.0
 */
public class Enumeration02 {

	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		System.out.println(Season.AUTUMN);
		System.out.println(Season.SUMMER);
	}

}

//改造Enumeration01，演示自定义枚举实现
class Season{
	private String name;
	private String desc;
	
	//定义了四个对象
	public final static Season SPRING = new Season("春天", "春风拂过泸沽湖");
	public final static Season SUMMER = new Season("夏天", "映日荷花别样红");
	public final static Season AUTUMN = new Season("秋天", "秋雨浸润九寨沟");
	public final static Season WINTER = new Season("冬天", "千树万树梨花开");
	
	//1.将构造器私有化，目的是防止直接被new
	//2.去掉setXxx方法，目的是防止属性被修改
	//3.在Season类内部创建固定的对外暴露的对象
	private Season(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return "Season [name=" + name + ", desc=" + desc + "]";
	}
	
	
	
}
