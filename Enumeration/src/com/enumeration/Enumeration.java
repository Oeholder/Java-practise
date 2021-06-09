package com.enumeration;


/**
 * 
 *项目名称:Enumeration
 *类名称:Enumeration
 *类描述:enum关键字实现枚举类
 *enum关键字实现枚举注意事项:
 * 1.当我们使用enum关键字开发个枚举类时，默认会继承Enum类[证明:javap反编译]
 * 2.传统的public static final Season2 SPRING = new Season2("春天","温暖");简化成SPRING("春天"，"温暖")，这里必须知道，它调用的是哪个构造器.
 * 3.如果使用无参构造器创建枚举对象，则实参列表和小括号都可以省略
 * 4.当有多个枚举对象时，使用,间隔，最后有一个分号结尾
 * 5.枚举对象必须放在枚举类的行首.
 *
 *创建人:郝鸿儒
 *创建时间:2021年6月6日 上午11:24:46
 *版本: 1.0
 */
public class Enumeration {

	public static void main(String[] args) {
		System.out.println(Season.WINTER);
	}

}

//演示enum关键字实现枚举类
enum Season{
	/**
	 * 1.使用enum替代class
	 * 2.public final static Season SPRING = new Season("春天", "春风拂过泸沽湖"); 直接使用
	 *   SPRING("春天", "春风拂过泸沽湖");  替代
	 * 3.如果有多个常量(对象)，使用逗号间隔
	 * 4.要将定义的常量对象写在最前面
	 */
	SPRING("春天", "春风拂过泸沽湖"),SUMMER("夏天", "映日荷花别样红"),
	AUTUMN("秋天", "秋雨浸润九寨沟"),WINTER("冬天", "千树万树梨花开");
	private String name;
	private String desc;
	
	//定义了四个对象
//	public final static Season SPRING = new Season("春天", "春风拂过泸沽湖");
//	public final static Season SUMMER = new Season("夏天", "映日荷花别样红");
//	public final static Season AUTUMN = new Season("秋天", "秋雨浸润九寨沟");
//	public final static Season WINTER = new Season("冬天", "千树万树梨花开");

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
