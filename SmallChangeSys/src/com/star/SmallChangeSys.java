package com.star;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 *项目名称:SmallChangeSys
 *项目需求:使用Java开发零钱通项目，可以完成收益入账，消费，查看明细，退出系统等功能
 *类名称:SmallChangeSys
 *类描述:零钱通项目实现过程编程
 *创建人:郝鸿儒
 *创建时间:2021年5月27日 上午10:39:22
 * @version
 */
public class SmallChangeSys {
	public static void main(String[] args) {
		/**
		 * 1.打印菜单界面,并根据选择给出相应提示
		 * 2.完成零钱通明细
		 *	(1).将收益入账和消费保存到数组
		 *	(2).使用对象
		 *	(3).使用String拼接
		 * 3.完成收益入账
		 * 4.完成消费
		 * 
		 */
		
		System.out.println("----------零钱通菜单----------\n" 
						 	+ "\t1.零钱通明细\n" 
						 	+ "\t2.收益入账\n" 
						 	+ "\t3.消费\n" 
						 	+ "\t4.退    出" );
						 	
		
		Scanner scanner = new Scanner(System.in);
		
		double money;
		double balance = 0;
		Date date = null;
		SimpleDateFormat sdf = null;
		
		String details = "----------零钱通明细----------";
		boolean loop = true;
		while (loop) {
			System.out.println("请选择(1-4):");
			int key = scanner.nextInt();
//			if(key == 1) {
//				System.out.println("----------零钱通明细----------");
//			}else if(key == 2){
//				System.out.println("-----------收益入账----------");
//			}else if(key == 3){
//				System.out.println("------------消费------------");
//			}else if(key == 4){
//				System.out.println("------------退出------------");
//				break;
//			}else {
//				System.out.println("请重新选择。");
//		    }
			switch (key) {
			case 1:
				System.out.println(details);
				break;
			case 2:
				System.out.println("-----------收益入账----------");
				System.out.println("请输入收益入账金额:");
				money = scanner.nextDouble();
				//校验money值的范围
				if(money <= 0) {
					System.out.println("请检查输入金额!");
					break;
				}
				balance += money; 
				date = new Date();
				sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化
				details += "\n收益明细\t+" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
				break;
			case 3:
				System.out.println("------------消费------------");
				System.out.println("请输入消费金额:");
				money = scanner.nextDouble();
				if(money < 0 || balance < money) {
					System.out.println("请检查输入金额!");
					break;
				}
				balance -= money;
				date = new Date();
				sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化
				details += "\n消费  \t-" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
				break;
			case 4:
				String judge;
				while (true) {
					System.out.println("您确定要退出吗?(y/n)");
					judge = scanner.next();
					if(judge.equals("y") || judge.equals("n")) {
						loop = false;
						break;
					}
					System.out.println("请输入正确的字母!");
				}
				
				if(judge.equals("y")) {
					loop = false;
				}
				break;
			default:
				System.out.println("请重新选择。");
			}
		
		}
		System.out.println("----------退出零钱通----------");
	}
}
