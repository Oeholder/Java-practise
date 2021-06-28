package com.BasicLevel;

import java.util.Scanner;
/**
 * 
 *项目名称:PAT
 *类名称:Problem1012_数字分类
 *类描述:给定一系列正整数，请按要求对数字进行分类，并输出以下 5 个数字：
 *A1 = 能被 5 整除的数字中所有偶数的和；
 *A2 = 将被 5 除后余 1 的数字按给出顺序进行交错求和，即计算 n1 − n2 + n3 − n4 ⋯；
 *A3 = 被 5 除后余 2 的数字的个数；
 *A4 = 被 5 除后余 3 的数字的平均数，精确到小数点后 1 位；
 *A5 = 被 5 除后余 4 的数字中最大数字。
 *创建人:郝鸿儒
 *创建时间:2021年6月27日 下午4:12:20
 *版本: 1.0
 */
@SuppressWarnings("all")
public class Problem1012_数字分类 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] nums = new int[n];
        int[] arr = new int[5];
        int count1 = 0,count2 = 0;
       
        
        for(int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        
        for(int i = 0; i < n; i++){
        	int a = nums[i] % 5;
        	
        	switch(a){
            case 0: 
            	if(nums[i] % 2 == 0) arr[0] += nums[i]; 
            	break;
            case 1: 
            	arr[1] = (count1 % 2) == 0 ? (arr[1] + nums[i]) : (arr[1] - nums[i]); 
            	count1++; 
            	break;
            case 2: 
            	arr[2]++; 
            	break;
            case 3: 
            	arr[3] += nums[i]; 
            	count2++; 
            	break;
            case 4: 
            	arr[4] = (nums[i] > arr[4]) ? nums[i] : arr[4];
            	break;
            default : 
            	break;
        	}
        }
        
        double avg = (double)arr[3] / count2;
        
        for (int i = 0; i < 5; i++) {
        	if(i == 1 && count1 != 0) {
        		System.out.print(arr[1] + " ");
				continue;
        	}else if(i == 1 && count1 == 0){
                System.out.print("N ");
                continue;
            }
        	
			if (arr[i] == 0 || count1 == 0) {
				System.out.print("N");
				if(i != arr.length - 1) {
					System.out.print(" ");
				}
				continue;
			}
			
			if (i == 3) {
				System.out.print(String.format("%.1f", avg) + " ");
				continue;
			}
			
			System.out.print(arr[i]);
			if(i != 4) {
				System.out.print(" ");
			}
		}
    }
}
