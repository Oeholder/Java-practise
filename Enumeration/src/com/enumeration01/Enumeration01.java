package com.enumeration01;

/**
 * 
 *项目名称:Enumeration
 *类名称:Enumeration
 *类描述:枚举
 *1.枚举是一组常量的集合。
 *2.可以这里理解:枚举属于一种特殊的类，里面只包含一组有限的特定的对象。
 *创建人:郝鸿儒
 *创建时间:2021年6月6日 上午10:49:59
 *版本: 1.0
 */
public class Enumeration01 {

	public static void main(String[] args) {
		Season spring  = new Season("春天", "春风拂过泸沽湖");
		Season summer  = new Season("夏天", "映日荷花别样红");
		Season autumn  = new Season("秋天", "秋雨浸润九寨沟");
		Season winter  = new Season("冬天", "千树万树梨花开");
		//对于季节而言，是固定的四个季节，不会更多，
		//这种传统设计思路不能体现季节是固定的，这样的设计不好
	}

}

class Season{
	private String name;
	private String desc;
	
	public Season(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
}
