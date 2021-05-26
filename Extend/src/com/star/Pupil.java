package com.star;

/**
 * 
 *项目名称：Extend
 *类名称：Pupil
 *类描述：小学生
 *创建人： 郝鸿儒
 *创建时间：2021年5月24日 下午5:38:32
 * @version
 */
public class Pupil {
	public String name;
	public int age;
	private int score;
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public void testing() {
		System.out.println("小学生" + name + "正在考数学");
	}
	
	public void showInfo() {
		System.out.println("小学生姓名:" + name + " 年龄:" + age + " 成绩:" + score);
	}
}
