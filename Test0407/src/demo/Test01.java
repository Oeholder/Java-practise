package demo;

import java.security.PublicKey;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] score = new int[5];
		int i = 0;
		int j = 0;
		int t = 0;
		for(i = 0;i < score.length;i++) {
			score[i] = input.nextInt();
		}
		input.close();
		j = 0;
		t = score[0];
		for(i = 0;i < score.length - 1;i++) {
			if(t < score[i+1]) {
				j = i + 2;
				t = score[i+1];
			}
		}
		System.out.println(t);
		System.out.println(j);
		
	}
}
