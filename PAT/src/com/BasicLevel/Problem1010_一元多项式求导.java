package com.BasicLevel;

import java.util.Scanner;

/**
 * 
 *项目名称:PAT
 *类名称:Problem1010_一元多项式求导
 *类描述:设计函数求一元多项式的导数。
 *创建人:郝鸿儒
 *创建时间:2021年6月26日 下午4:19:13
 *版本: 1.0
 */
@SuppressWarnings("all")
public class Problem1010_一元多项式求导 {

	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split(" ");

        int[] nums = new int[strs.length];
        
        for(int i = 0; i < strs.length; i++){
            nums[i] = Integer.parseInt(strs[i]);
        }
        
        int flag = 0;
        for(int i = 0; i < strs.length - 1; i += 2){
            nums[i] = nums[i] * nums[i + 1];
            if(nums[i + 1] == 0) {
            	flag += 2;
            }
            nums[i + 1] = nums[i + 1] - 1;
        }
        
        for (int i = 0; i < nums.length - flag; i++) {
			System.out.print(nums[i]);
			if(nums[i] != nums[nums.length - flag]) {
				System.out.print(" ");
			}
		}
    }

}
