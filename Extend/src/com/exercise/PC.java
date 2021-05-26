package com.exercise;

public class PC extends Computer{
	public String brand;
	
	public PC(String cpu, int ram, int rom, String brand) {
		super(cpu, ram, rom);
		this.brand = brand;
	}
	
	public void getPCDetail() {
		super.getDetail();
		System.out.println(" 品牌: " + brand);
	}
}
