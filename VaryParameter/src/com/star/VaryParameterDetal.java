package com.star;

public class VaryParameterDetal {

	public static void main(String[] args) {
		HspMethod m = new HspMethod();
		System.out.println(m.sum(1, 2, 5.6, 7.8, 9.0));

	}

}

class HspMethod{
	//可变参数实参可以是0个也可以是任意多个
	//可变参数实参可以是数组
	//可变参数可以和普通参数一起放在形参列表，但要放在最后
	//一个形参列表只能出现一个可变参数
	public double sum(double... nums) {
		//nums为一个数组
		System.out.println("接收参数个数为：" + nums.length);
		double sum = 0;
		for (double d : nums) {
			sum += d;
		}
		return sum;
	}
}