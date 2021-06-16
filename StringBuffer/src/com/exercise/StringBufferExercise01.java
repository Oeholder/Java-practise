package com.exercise;

public class StringBufferExercise01 {

	public static void main(String[] args) {
		String str = null;
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.append(str));//null
		System.out.println(sb.length());//4
		StringBuffer sb1 = new StringBuffer (str);
		System.out.println(sb1);// java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
	}

}
