package com.BasicLevel;

import java.io.*;

/**
 * 
 *项目名称:PAT
 *类名称:Problem1013_数素数
 *类描述:令 P[i] 表示第 i 个素数。现任给两个正整数 M≤N≤10000 ，请输出 P[M] 到 P[N] 的所有素数。
 *创建人:郝鸿儒
 *创建时间:2021年6月27日 下午10:07:56
 *版本: 1.0
 */
@SuppressWarnings("all")
public class Problem1013_数素数 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		
		String[] str = br.readLine().split(" ");
		int[] nums = new int[2];
		for (int i = 0; i < 2; i++) {
			nums[i] = Integer.parseInt(str[i]);
		}
		
		int m = nums[0];
		int n = nums[1];
		
		int[] p = new int[10000];
		int index = 2;
		p[0] = 2;
		p[1] = 3;
		for (int i = 2; index < 10000; i++) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					break;
				}else if(i % j != 0 && j == (int)Math.sqrt(i)) {
					p[index] = i;
					index++;
					break;
				}
			}
		}
		
		int i = m;
		do {
			
			for (int j = 0; j < 10; j++) {
				if(i == n + 1) break;
				System.out.print(p[i - 1]);
				if(j < 9 && i != n) {
					System.out.print(" ");
				}
				i++;
			}
			System.out.println();
		}while(i <= n);
	}

}
