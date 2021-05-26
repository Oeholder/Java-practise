package com.star;

public class Extends01 {

	public static void main(String[] args) {
		Pupil pupil = new Pupil();
		pupil.name = "小明";
		pupil.age = 8;
		pupil.setScore(88);
		pupil.testing();
		pupil.showInfo();
		Graduate graduate = new Graduate();
		graduate.name = "大明";
		graduate.age = 20;
		graduate.setScore(99);
		graduate.testing();
		graduate.showInfo();
	}

}
