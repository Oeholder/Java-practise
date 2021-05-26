package com.star;

/**
 * 
 *项目名称：Extend
 *类名称：Graduate
 *类描述：大学生
 *创建人： 郝鸿儒
 *创建时间：2021年5月24日 下午5:38:16
 * @version
 */
public class Graduate extends Pupil{
	public String name;
	public int age;
	private int score;
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public void testing() {
		System.out.println("大学生" + name + "正在考高等数学");
	}
	
	public void showInfo() {
		System.out.println("大学生姓名:" + name + " 年龄:" + age + " 成绩:" + score);
	}
}
