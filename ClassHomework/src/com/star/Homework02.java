package com.star;

import java.util.Iterator;

public class Homework02 {

	public static void main(String[] args) {
		String s[] = {"abc", "yom", "666"};
		A02 a02= new A02();
		System.out.println(a02.find(s, "666"));
		
	}

}

class A02{
	public int find(String s[], String string) {
		int index = -1;
		for (int i = 0; i < s.length; i++) {
			if(s[i] == string) return i;
		}
		return index;
	}
}
