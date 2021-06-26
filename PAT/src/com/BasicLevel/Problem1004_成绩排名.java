package com.BasicLevel;

import java.util.Scanner;

/**
 * 
 *项目名称:PAT
 *类名称:Problem1004_成绩排名
 *类描述:读入 n（>0）名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。
 *创建人:郝鸿儒
 *创建时间:2021年6月25日 下午4:53:18
 *版本: 1.0
 */
@SuppressWarnings("all")
public class Problem1004_成绩排名 {
/*
 * Java中Scanner类中的方法next()和nextLine()都是吸取输入台输入的字符，区别：
 * next()不会吸取字符前/后的空格/Tab键，只吸取字符，开始吸取字符（字符前后不算）直到遇到空格/Tab键/回车截止吸取；
 * nextLine()吸取字符前后的空格/Tab键，回车键截止。
 * https://www.cnblogs.com/chiweiming/p/9477567.html
 */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] name = new String[num];
        String[] id = new String[num];
        int[] score = new int[num];

        Student[] student = new Student[num];
        for(int i = 0; i < num; i++){
            name[i] = scanner.next();
            id[i] = scanner.next();
            score[i] = scanner.nextInt();
            student[i] = new Student(name[i], id[i], score[i]);
        }
        Student.sort(student);
        System.out.println(student[0].toString());
        System.out.println(student[num - 1].toString());
    }
    
}

class Student{
	String name;
	String id;
	int score;
	
	public Student(String name, String id, int score) {
		super();
		this.name = name;
		this.id = id;
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public static Object[] sort(Object[] obj) {
		Student[] s = (Student[])obj;
		for (int i = 0; i < obj.length - 1; i++) {
			for (int j = 0; j < obj.length - 1 - i; j++) {
				Student[] temp = new Student[1];
				if(s[j].getScore() < s[j + 1].getScore()) {
					temp[0] = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp[0];
				}
			}
		}
		return obj;
	}
	
	@Override
	public String toString() {
		return name + " " + id;
	}
}