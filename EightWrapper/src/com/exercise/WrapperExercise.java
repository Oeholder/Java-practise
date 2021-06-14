package com.exercise;

public class WrapperExercise {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i==j);//false
		
		/**
		 * 源码:
	
		public static Integer valueOf(int i) {
	        if (i >= IntegerCache.low && i <= IntegerCache.high)
	            return IntegerCache.cache[i + (-IntegerCache.low)];
	        return new Integer(i);
    	}
		 */
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);//true
		//这里主要是看范围-128 ~127就是直接返回Integer,
		//否则，就new Integer(xx); m=1;
		
		Integer x = 128;//底层Integer.valueof(1);
		Integer y = 128;//底层Integer.valueOf(1);
		System.out.println(x == y);//false
		
		Integer k = 128;
		int l = 128;
		System.out.println(k == l);//基本数据类型 == 操作时会自动拆箱
	}

}
