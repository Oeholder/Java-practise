package com.star;

public class Homework01 {

	public static void main(String[] args) {
		double nums[] = {3.3, 1.2, 5, 6.7, 1.9};
		A01 a01 = new A01();
		System.out.println(a01.max(nums));
	}

}

class A01{
	public double max(double...nums) {
		double max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > max) max = nums[i] ;
		}
		return max;
	}
}