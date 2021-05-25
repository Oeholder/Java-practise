package com.star;

public class Account {	
	private String name;
	private double balance;
	private String password;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name.length() >= 2 && name.length() <= 4) {
			this.name = name;
		}else {
			System.out.println("请输入长度为2-4的姓名");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		if(balance > 20) {
			this.balance = balance;
		}else {
			System.out.println("余额最小为20");
		}
		
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		if(password.length() == 6) {
			this.password = password;
		}else {
			System.out.println("密码长度必须为6");
		}	
	}
	
	public String info() {
		return "信息如下：\n姓名： " + name + " 余额：" + balance;
	}
	
}
