package com.star.dynamicbinding;

public class Base {
	public int i = 10;
	
	public int sum() {
		return getI() + 10;//base运行类型是Sub,调用Sub中的getI()
	}
	
	public int getI() {
		return i;
	}
	
	public int sum1() {
		return i + 10;
	}
}
