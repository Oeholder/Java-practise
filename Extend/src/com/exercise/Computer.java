package com.exercise;

public class Computer {
	public String cpu; 
	public int ram;
	public int rom;
	
	public Computer() {

	}
	
	public Computer(String cpu, int ram, int rom) {
		this.cpu = cpu;
		this.ram = ram;
		this.rom = rom;
	}
	
	public void getDetail() {
		System.out.print("电脑基本信息如下\nCPU: " + cpu + " 内存: " + ram + "GB 硬盘: " + rom +"GB");
	}

}
