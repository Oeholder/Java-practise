package com.exercise;

public class ArrayExercise {

	public static void main(String[] args) {
		Book[] books = new Book[4];
		books[0] = new Book("红楼梦", 40);
		books[1] = new Book("青年文摘", 5);
		books[2] = new Book("去依附", 39.90);
		books[3] = new Book("Java从放弃到入门", 300);
		Book.sort(books, new Compare() {
			
			@Override
			public Double compare(Double n1, Double n2) {
				return n2 - n1;
			}
		});
		Book.printBooks(books);
	}

}

interface Compare{
	Double compare(Double n1, Double n2);
}

class Book implements Compare{
	private String name;
	private double price;
	
	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public Double compare(Double n1, Double n2) {
		return n1 - n2;
	}
	
	public static Book[] sort(Book[] books, Compare c) {
		for (int i = 0; i < books.length - 1; i++) {
			for (int j = 0; j < books.length - 1 - i ; j++) {
				if(c.compare(books[j].price, books[j + 1].price) > 0) {
					Book temp = books[j];
					books[j] = books[j + 1];
					books[j + 1] = temp;
				}
			}
		}
		return books;
	}
	
	public static void printBooks(Book[] books) {
		for (Book book : books) {
			System.out.println(book.name + " " + book.price);
		}
	}

}