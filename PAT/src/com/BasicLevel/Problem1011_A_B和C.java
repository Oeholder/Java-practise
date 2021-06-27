package com.BasicLevel;

import java.util.Scanner;
/**
 * 
 *项目名称:PAT
 *类名称:Problem1011_A_B和C
 *类描述:给定区间的 3 个整数 A、B 和 C，请判断 A+B 是否大于 C。
 *创建人:郝鸿儒
 *创建时间:2021年6月27日 上午10:12:59
 *版本: 1.0
 */
@SuppressWarnings("all")
public class Problem1011_A_B和C {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        long[][] nums = new long[n][3];
        boolean[] judge = new boolean[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                nums[i][j] = scanner.nextLong();
            }
        }
        
        for(int i = 0; i < n; i++){
             if(nums[i][0] + nums[i][1] > nums[i][2]){
                 judge[i] = true;
             }else{
                 judge[i] = false;
             }
        }
        
        for(int i = 0; i < n; i++){
            System.out.println("Case #" + (i + 1) + ": " + judge[i]);
        }
    }
}
