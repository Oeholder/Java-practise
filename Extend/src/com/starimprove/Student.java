package com.starimprove;

public class Student {
	//Pupil和Graduate共有属性
	public String name;
	public int age;
	private int score;
	//Pupil和Graduate共有方法
	public void setScore(int score) {
		this.score = score;
	}
	
	public void showInfo() {
		System.out.println("学生姓名:" + name + " 年龄:" + age + " 成绩:" + score);
	}
}
