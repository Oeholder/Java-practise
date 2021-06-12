package com.anonymous_innerclass_exercise;

public class Exercise {

	public static void main(String[] args) {
		CellPhone phone = new CellPhone();
		phone.alarmclock(new Bell() {
			@Override
			public void ring() {
				System.out.println("懒猪起床了");
			}
		}); 
		phone.alarmclock(new Bell() {
			@Override
			public void ring() {
				System.out.println("小伙伴上课了");
			}
		}); 
		
	}

}

interface Bell{
	void ring();
}

class CellPhone{
	public void alarmclock(Bell bell) {
		bell.ring();
	}
}