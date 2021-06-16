package com.string_and_stringbuffer;

public class StringAndStringBuffer {

	public static void main(String[] args) {
		/*
		 * String ——> StringBuffer
		 */
		String str = "hello Tom";
		//方式1 使用构造器
		//注意:返回的才是StringBuffer好象，对str 本身没有影响
		StringBuffer stringBuffer = new StringBuffer(str);
		//方式2 使用append方法
		StringBuffer stringBuffer2 = new StringBuffer();
		stringBuffer2 = stringBuffer2.append(str);
		
		/*
		 * StringBuffer ——> String
		 */
		StringBuffer stringBuffer3 = new StringBuffer("hspedu");
		//方式1 使用StringBuffer提供的toString方法
		String str2 = stringBuffer3.toString();
		//方式2 使用构造器
		String str3 = new String(stringBuffer3);
	}
}
