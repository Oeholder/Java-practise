package com.BasicLevel;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/**
 * 
 *项目名称:PAT
 *类名称:Problem1005_继续Callatz猜想
 *类描述:卡拉兹(Callatz)猜想已经在1001中给出了描述。在这个题目里，情况稍微有些复杂。
 *当我们验证卡拉兹猜想的时候，为了避免重复计算，可以记录下递推过程中遇到的每一个数。
 *例如对 n = 3 进行验证的时候，我们需要计算 3、5、8、4、2、1，
 *则当我们对 n = 5、8、4、2 进行验证的时候，就可以直接判定卡拉兹猜想的真伪，而不需要重复计算，
 *因为这 4 个数已经在验证3的时候遇到过了，我们称 5、8、4、2 是被 3“覆盖”的数。
 *如果 n 不能被数列中的其他数字所覆盖，我们称一个数列中的某个数 n 为“关键数”。
 *现在给定一系列待验证的数字，我们只需要验证其中的几个关键数，就可以不必再重复验证余下的数字。
 *你的任务就是找出这些关键数字，并按从大到小的顺序输出它们。
 *创建人:郝鸿儒
 *创建时间:2021年6月25日 下午10:02:31
 *版本: 1.0
 */
public class Problem1005_继续Callatz猜想 {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List list = new ArrayList();
		List<Integer> list2 = new ArrayList<>();
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			list2.add(scanner.nextInt());
		}
		
		for (int i = 0; i < list2.size(); i++) {
			n = list2.get(i);
			while (n != 1) {
				if (n % 2 == 0) {
					n /= 2; 
				} else {
					n = (3 * n + 1) / 2; 
				}
				if (list.contains(n)) {
					break;
				} else {
					list.add(n);
				}
			}
		}

		for (int j = 0; j < list.size(); j++) {
			if (list2.contains(list.get(j))) {
				list2.remove(list.get(j));
			} 
		}
		
		Integer[] num = list2.toArray(new Integer[list2.size()]);
		Arrays.sort(num, Collections.reverseOrder());
		for (int i : num) {
			System.out.print(i);
			if (i != num[num.length - 1]) {
				System.out.print(" ");
			} 
		}
	}

}
