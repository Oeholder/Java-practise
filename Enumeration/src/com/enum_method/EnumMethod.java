package com.enum_method;

/**
 * 
 *项目名称:Enumeration
 *类名称:EnumMethod
 *类描述:Enum类的各种方法的使用
 *创建人:郝鸿儒
 *创建时间:2021年6月7日 上午10:13:12
 *版本: 1.0
 */
public class EnumMethod {

	public static void main(String[] args) {
		Season autumn = Season.AUTUMN;//创建对象
		System.out.println(autumn.name());//name()输出枚举对象的名称
		System.out.println(autumn.ordinal());//ordinal()输出该枚举的次序，从0开始
		Season[] values = Season.values();//values()返回Season定义的数组
		for (Season season : values) {
			System.out.println(season);
		}
		/**
		 * valueOf()将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
		 * 执行流程
		 * 1.根据您输入的"SUMMER"，到Season的枚举对象去找
		 * 2.如果找到就返回，没有找到就报错
		 */
		Season summer = Season.valueOf("SUMMER");
		System.out.println("summer = " + summer);
		/**
		 * comperTo()比较两个枚举常量，比较编号
		 * 1.将Season.AUTUMN和summer(Season.SUMMER)的编号进行比较
		 * 2.结果为 Season.AUTUMN编号 -  Season.SUMMER编号
		 */
		System.out.println(Season.AUTUMN.compareTo(summer));
		System.out.println(Season.AUTUMN.compareTo(Season.WINTER));
		System.out.println(Season.AUTUMN.compareTo(Season.SPRING));
		
	}

}

enum Season{
	SPRING("春天", "春风拂过泸沽湖"),SUMMER("夏天", "映日荷花别样红"),
	AUTUMN("秋天", "秋雨浸润九寨沟"),WINTER("冬天", "千树万树梨花开");
	private String name;
	private String desc;
	
	private Season(String name, String desc) {
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
