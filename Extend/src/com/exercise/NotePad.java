package com.exercise;

public class NotePad extends Computer{
	public String color;
	
	public NotePad(String cpu, int ram, int rom, String color) {
		super(cpu, ram, rom);
		this.color = color;
	}
	
	public void getPadDetail() {
		super.getDetail();
		System.out.println(" 颜色: " + color);
	}
}
