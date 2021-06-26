package com.BasicLevel;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * 
 *项目名称:PAT
 *类名称:Problem1002_写出这个数
 *类描述:读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
 *创建人:郝鸿儒
 *创建时间:2021年6月25日 下午3:52:01
 *版本: 1.0
 */
@SuppressWarnings("all")
public class Problem1002_写出这个数 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		BigInteger num = new BigInteger(String.valueOf(str));
		BigInteger n = new BigInteger("10");
		BigInteger sum = new BigInteger("0");
		BigInteger zero = new BigInteger("0");
		StringBuilder s = new StringBuilder();
		
		while (!(num.equals(zero))) {
			
			sum = sum.add(num.mod(n));
			System.out.println(sum);
			num = num.divide(n);
		}
		while (!(sum.equals(zero))) {
			switch (sum.mod(n).intValue()) {
			case 0: s.insert(0, "ling ");break;
			case 1: s.insert(0, "yi ");break;
			case 2: s.insert(0, "er ");break;
			case 3: s.insert(0, "san ");break;
			case 4: s.insert(0, "si ");break;
			case 5: s.insert(0, "wu ");break;
			case 6: s.insert(0, "liu ");break;
			case 7: s.insert(0, "qi ");break;
			case 8: s.insert(0, "ba ");break;
			case 9: s.insert(0, "jiu ");break;

			default:break;
			}
			sum = sum.divide(n);
		}
		s.delete(s.length() -1, s.length());
		System.out.println(s);
	}

}
