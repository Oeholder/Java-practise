package com.info;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 
 *项目名称:BigIntegerAndBigDrcimal
 *类名称:BigIntegerAndBigDrcimal
 *类描述:Biglnteger和BigDecimal介绍应用场景;
 *1) Biglnteger适合保存比较大的整型
 *2) BigDecimal适合保存精度更高的浮点型(小数)
 *创建人:郝鸿儒
 *创建时间:2021年6月16日 上午8:37:09
 *版本: 1.0
 */
public class BigIntegerAndBigDrcimal {
	public static void main(String[] args) {
		BigInteger bigInteger = new BigInteger("99999999999999999999999999999999999999999");
		BigInteger bigInteger1 = new BigInteger("1000000000001");
		System.out.println(bigInteger);
		//加减乘除要使用对应的方法
		System.out.println(bigInteger.add(bigInteger1));//加
		System.out.println(bigInteger.subtract(bigInteger1));//减
		System.out.println(bigInteger.multiply(bigInteger1));//乘
		System.out.println(bigInteger.divide(bigInteger1));//除
		
		BigDecimal bigDecimal = new BigDecimal("1.1234567895178512486521478524178585211447565211455");
		System.out.println(bigDecimal);
	}
}
