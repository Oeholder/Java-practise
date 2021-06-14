package com.wrapper_vs_string;

public class WrapperVsString {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//包装类Integer ——> String
		Integer i =100;//自动装箱
		//方式1
		String str = i + "0";
		System.out.println(str);
		//方式2
		String str2 = i.toString() + "1";
		System.out.println(str2);
		//方式3
		String str3 = String.valueOf(i) + "2";
		System.out.println(str3);
		
		//String ——> 包装类Integer
		String str4 = "12345";
		//方式1
		Integer i2 = Integer.parseInt(str4);//自动装箱
		System.out.println(i2);
		//方式2
		Integer i3 = new Integer(str4);//构造器
		System.out.println(i3);
	}

}
