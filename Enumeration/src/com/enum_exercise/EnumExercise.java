package com.enum_exercise;

public class EnumExercise {

	public static void main(String[] args) {
		Week week[] = Week.values();
		for (Week week2 : week) {
			System.out.println(week2.toString());
		}
	}

}

enum Week{
	MONDAY("星期一"),
	TUESDAY("星期二"),
	WEDNESDAY("星期三"),
	THURSDAY("星期四"),
	FRIDAY("星期五"),
	SATURDAY("星期六"),
	SUNDAY("星期日");
	private String day;
	private Week(String day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		return this.day;
	}
}