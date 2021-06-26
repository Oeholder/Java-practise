package com.BasicLevel;

import java.util.Scanner;

/**
 * 
 *项目名称:PAT
 *类名称:Problem1009_说反话
 *类描述:给定一句英语，要求你编写程序，将句中所有单词的顺序颠倒输出。
 *创建人:郝鸿儒
 *创建时间:2021年6月26日 上午11:57:49
 *版本: 1.0
 */
@SuppressWarnings("all")
public class Problem1009_说反话 {

    public static void main(String[] args){
        
		Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        
        String[] strs = str.split(" ");
        
        for (int i = strs.length - 1; i >= 0; i--) {
        	System.out.print(strs[i]);
        	if (i != 0) {
				System.out.print(" ");
			}
		} 
        
	}
               
}
