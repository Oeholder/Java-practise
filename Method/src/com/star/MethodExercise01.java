package com.star;

public class MethodExercise01 {

	public static void main(String[] args) {
		AA aa =new AA();
		System.out.println(aa.oddOrEven(8));
		aa.printChar(5, 10, '?');

	}

}

class AA{
	public boolean oddOrEven(int num) {
		if(num % 2 == 0) return false;
		return true;
	}
	public void printChar(int row,int col,char ch) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(ch);
			}
			System.out.println("");
		}
	}
}