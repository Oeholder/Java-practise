package com.star.polydetail;

public class PolyDetail {
	public static void main(String[] args) {
		//属性没有重写之说，属性的值看编译类型；
		//a instanceof A 判断 a 的 运行类型 是否为 A类型或者A类型的子类
		Base base = new Sub();//向上转型————编译类型为Base 运行类型为Sub
		System.out.println(base.count);
		System.out.println(base instanceof Base);
		System.out.println(base instanceof Sub);
		Sub sub = (Sub) base;//向下转型————编译类型为Sub 运行类型为Sub
		System.out.println(sub.count);
		System.out.println(sub instanceof Base);
		
		
	}

}

class Base{
	int count = 10;
}

class Sub extends Base{
	int count = 20;
}