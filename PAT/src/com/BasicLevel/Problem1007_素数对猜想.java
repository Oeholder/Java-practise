package com.BasicLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 *项目名称:PAT
 *类名称:Problem_1007_素数对猜想
 *类描述:素数对猜想”认为“存在无穷多对相邻且差为2的素数”。
 *现给定任意正整数N < 100000，请计算不超过 N 的满足猜想的素数对的个数。
 *创建人:郝鸿儒
 *创建时间:2021年6月26日 上午8:27:06
 *版本: 1.0
 */
@SuppressWarnings("all")
public class Problem1007_素数对猜想 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		int count = 0;
		
		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					break;
				}else if(i % j != 0 && j == (int)Math.sqrt(i)) {
					list.add(i);
					break;
				}
			}
			
		}
		
		for (int i = 0; i < list.size() - 1; i++) {
			if(list.get(i + 1) - list.get(i) == 2) {
				count ++;
			}
		}
		System.out.println(count);
	}
	
}
