package com.star;

public class AccoubtTest {

	public static void main(String[] args) {
		Account account = new Account();
		account.setName("Tommmm");
		account.setName("Tom");
		account.setBalance(15);
		account.setBalance(150);
		account.setPassword("123");
		account.setPassword("124563");
		System.out.println(account.info());
	}

}
