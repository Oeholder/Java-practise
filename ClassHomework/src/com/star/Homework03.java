package com.star;

public class Homework03 {

	public static void main(String[] args) {
		double bookPrice01 = 56;
		double bookPrice02 = 156;
		double bookPrice03 = 132;
		
		Book book = new Book();
		System.out.println(book.updatePrice(bookPrice01) + "\t" + book.updatePrice(bookPrice02) + "\t" + book.updatePrice(bookPrice03));

	}

}

class Book{
	public double updatePrice(double price) {
		if(price > 150) return 150;
		if(price > 100) return 100;
		return price;
	}
}