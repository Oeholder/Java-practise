package com.BasicLevel;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 *项目名称:PAT
 *类名称:Problem1014_福尔摩斯的约会
 *类描述:大侦探福尔摩斯接到一张奇怪的字条：我们约会吧！ 3485djDkxh4hhGE 2984akDfkkkkggEdsb s&hgsfdk d&Hyscvnm。
 *大侦探很快就明白了，字条上奇怪的乱码实际上就是约会的时间星期四 14:04，
 *因为前面两字符串中第 1 对相同的大写英文字母（大小写有区分）是第 4 个字母 D，代表星期四；
 *第2对相同的字符是 E ，那是第 5 个英文字母，代表一天里的第 14 个钟头（于是一天的 0 点到 23 点由数字 0 到 9、以及大写字母 A 到 N 表示）；
 *后面两字符串第 1 对相同的英文字母 s 出现在第 4 个位置（从 0 开始计数）上，代表第 4 分钟。
 *现给定两对字符串，请帮助福尔摩斯解码得到约会的时间。
 *创建人:郝鸿儒
 *创建时间:2021年6月27日 下午11:34:07
 *版本: 1.0
 */
@SuppressWarnings("all")
public class Problem1014_福尔摩斯的约会 {

	public static void main(String[] args) throws NullPointerException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = new String[4];
		for (int i = 0; i < 4; i++) {
			str[i] = br.readLine();
		}
		
		char[] ch1 = new char[str[0].length() + str[1].length()];
		char[] ch2 = new char[str[2].length() + str[3].length()];
		int index1 = 0;
		int index2 = 0;
		/*
		 * 将字符串转换为char数组
		 */
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				char ch[] = str[i].toCharArray();
				if (i < 2) {
					ch1[index1] = ch[j];
					index1++;
				} else {
					ch2[index2] = ch[j];
					index2++;
				}
			}
		}
		
		char[] ch = new char[index1 / 2];
		char day = ' ';
		char h = ' ';
		int m = 0;
		int index = 0;
		
		for (int i = 0;i < index1; i++) {
			
			if(ch1[i] >= 'A' && ch1[i] <= 'G') {
				for (int j = i + 1; j < index1; j++) {
					if(ch1[i] == ch1[j]) {
						ch[index] = ch1[i];
						index++;
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < index2; i++) {
			if(ch2[i] >= 'a' && ch2[i] <= 'z' || ch1[i] >= 'A' && ch1[i] <= 'Z') {
				for (int j = i + 1; j < index2; j++) {
					if(ch2[i] == ch2[j]) {
						m = j;
						i = index2 - 1;
						break;
					}
				}
			}
		}
		
		int n = 0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]  >= 'A' && ch[i] <= 'G') {
				day = ch[n];
				n++;
				break;
			}
		}
		
		for (int i = n; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'N' || ch[i] >= 0 && ch[i] <= 9) {
				h = ch[i];
				break;
			}
		}
		
		switch (ch[0]) {
		case 'A': System.out.print("MON ");break;
		case 'B': System.out.print("TUE ");break;
		case 'C': System.out.print("WED ");break;
		case 'D': System.out.print("THU ");break;
		case 'E': System.out.print("FRI ");break;
		case 'F': System.out.print("SAT ");break;
		case 'G': System.out.print("SUN ");break;
		default:
			break;
		}
		
		List list = new ArrayList<>(24);
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		char t = 'A';
		for (int i = 10; i < 24; i++) {
			list.add(t);
			t++;
		}

		System.out.print(list.indexOf(h) + ":" + String.format("%02d", m));
		
	}
	
}
