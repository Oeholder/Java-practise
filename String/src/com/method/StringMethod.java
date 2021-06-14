package com.method;

/**
 * 
 *项目名称:String
 *类名称:StringMethod
 *类描述:String常用方法
 *创建人:郝鸿儒
 *创建时间:2021年6月12日 上午9:47:37
 *版本: 1.0
 */
public class StringMethod {

	/*
	 * equals 				//区分大小写，判断内容是否相等
	 * equalslgnoreCase		//忽略大小写，判断内容是否相等
	 * length				//获取字符的个数，字符串的长度
	 * indexOf				//获取字符在字符串中第1次出现的索引,索引从0开始,如果找不到,返回-1
	 * lastIndexOf			//获取字符在字符串中最后1次出现的索引,索引从0开始,如找不到,返回-1
	 * substring 			//截取指定范围的子串
	 * trim					//去前后空格
	 * charAt				//获取某索引处的字符,注意不能使用Str[index]这种方式.
	 * toUpperCase			//转换成大写
	 * toLowerCase			//转换成小写
	 * replace				//替换字符串中的字符
	 * splist				//分割字符串，指定分割符号
	 * toCharArry			//转成字符数组
	 */
	public static void main(String[] args) {
		//substring截取指定范围的子串
		String name = "hello,张三";
		//下面name.substring(6)从索引6开始截取后面所有的内容
		System.out.println(name.substring(6));
		//截取后面的字符l/name.substring(0,5)表示从索引0开始截取，截取到索引5 - 1 = 4位置
		System.out.println(name.substring(2,5));//llo
		System.out.println(name.substring(4,7));
		
		//replace替换字符串中的字符
		String s1 = "aaavbnbbn";
		System.out.println(s1.replace("a", "w"));//本身对s1没有影响
		System.out.println(s1);
	}

}
