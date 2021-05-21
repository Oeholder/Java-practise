package test;

import java.util.Scanner;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
        nums = new int[1000];
        target = 0;
        int[] ans = new int[]{0,0};
        int i = 0,j = 0;
        Scanner input = new Scanner(System.in);
        String str = input.next().toString();
        String[] Arrays=str.split(",");   //通过“,”分离
        for(i = 0; i < Arrays.length; i++){
            nums[i]=Integer.parseInt(Arrays[i]);   //将String型转化成int型
        }
        target = input.nextInt();
        for(i = 0; i < Arrays.length; i++){
            for(j = i;j < Arrays.length - i; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    System.out.println(ans[0]);
                    System.out.println(ans[1]);
                    return ans;
                }
            }
        }
        return ans;
    }
}
