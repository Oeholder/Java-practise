package com.BasicLevel;

import java.util.Scanner;

/**
 * 
 *项目名称:PAT
 *类名称:Problem1006_换个格式输出整数
 *类描述:让我们用字母 B 来表示“百”、字母 S 表示“十”，
 *用 12...n 来表示不为零的个位数字 n（<10），换个格式来输出任一个不超过 3 位的正整数。
 *例如 234 应该被输出为 BBSSS1234，因为它有 2 个“百”、3 个“十”、以及个位的 4。
 *创建人:郝鸿儒
 *创建时间:2021年6月26日 上午12:05:19
 *版本: 1.0
 */
@SuppressWarnings("all")
public class Problem1006_换个格式输出整数 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        StringBuffer str = new StringBuffer();
        int single_digit = num % 10;
        for(int i = 0; i < single_digit; i++){
            str.append(i + 1);
        }
        num = num / 10;
        int ten_figures = num % 10;
        for(int i = 0; i <ten_figures; i++){
            str.insert(0, "S");
        }
        num = num / 10;
        int hundred_figures =num % 10;
        for(int i = 0; i <hundred_figures; i++){
            str.insert(0, "B");
        }
        System.out.println(str);
	}

}
