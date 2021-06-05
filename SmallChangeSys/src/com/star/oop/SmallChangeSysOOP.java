package com.star.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 *项目名称:SmallChangeSysOOP
 *项目需求:使用Java开发零钱通项目，可以完成收益入账，消费，查看明细，退出系统等功能
 *类名称:SmallChangeSysOOP
 *类描述:零钱通项目实现对象编程
 *创建人:郝鸿儒
 *创建时间:2021年5月27日 上午10:39:22
 * @version
 */
public class SmallChangeSysOOP {
	private int key;
	private String details = "----------零钱通明细----------";
	private double money;
	private double balance = 0;
	private boolean loop = true;
	Date date = null;
	SimpleDateFormat sdf;
	Scanner scanner = new Scanner(System.in);
	
	public void run() {
		this.menu();
		while (this.loop) {
			System.out.println("请选择(1-4):");
			this.input();
			this.judge();
		}
		
		
	}
	
	public void menu() {
		System.out.println("----------零钱通菜单----------\n" 
			 	+ "\t1.零钱通明细\n" 
			 	+ "\t2.收益入账\n" 
			 	+ "\t3.消费\n" 
			 	+ "\t4.退    出");
	}
	
	public void input() {
		this.key = scanner.nextInt();
		
	}
	
	public void judge() {
		switch (this.key) {
		
		case 1:
			this.details();
			break;
		case 2:
			this.income();
			break;
		case 3:
			this.consume();
			break;
		case 4:
			this.exit();
			break;
		default:
			System.out.println("请重新输入!");
		}
	}
	
	public void details() {
		System.out.println(details);
	}
	
	public void income() {
		System.out.println("-----------收益入账----------");
		System.out.println("请输入收益入账金额:");
		double money = scanner.nextDouble();
		//校验money值的范围
		if(money <= 0) {
			System.out.println("请检查输入金额!");
			return;
		}
		balance += money; 
		date = new Date();
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化
		this.details += "\n收益明细\t+" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
	}
	
	public void consume() {
		System.out.println("------------消费------------");
		System.out.println("请输入消费金额:");
		money = scanner.nextDouble();
		if(money < 0 || balance < money) {
			System.out.println("请检查输入金额!");
			return;
		}
		balance -= money;
		date = new Date();
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化
		details += "\n消费  \t-" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
	}
	
	public void exit() {
		String judge;
		while (true) {
			System.out.println("您确定要退出吗?(y/n)");
			judge = scanner.next();
			if(judge.equals("y") || judge.equals("n")) {
				this.loop = false;
				break;
			}
			System.out.println("请输入正确的字母!");
		}
		
		if(judge.equals("y")) {
			this.loop = false;
			System.out.println("----------退出零钱通----------");
		}
		
	}
	
}
