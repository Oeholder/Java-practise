package com.star;

import java.util.Random;

public class Homework14 {

	public static void main(String[] args) {
		Tom tom1 = new Tom(0);
		Tom tom2 = new Tom(1);
		Tom tom3 = new Tom(0);
		PC pc = new PC();
		Count c = new Count();
		c.judge(tom1, pc);
		c.judge(tom2, pc);
		c.judge(tom3, pc);
		c.printCount();
	}

}

class Tom{
	int finger;
	public Tom(int finger) {
		this.finger = finger; 
	}
}

class PC{
	int pcFinger;
	public PC() {
		Random r = new Random();
		this.pcFinger = r.nextInt(3);
		System.out.println("电脑的出拳是：" + this.pcFinger);
	}
}

class Count{
	boolean win = true;
	boolean fail = false; 
	int winCount,failCount;
	
	public boolean judge(Tom t, PC pc) {
		if(t.finger == pc.pcFinger) {
			return win;
		}
		boolean judge =  t.finger == 0 ? (pc.pcFinger == 1 ? win : fail) : 
						(t.finger == 1 ? (pc.pcFinger == 2 ? win : fail) : 
						(t.finger == 2 ? (pc.pcFinger == 0 ? win : fail) : win));
		if(judge == win) {
			winCount++;
		}else {
			failCount++;
		}
		return judge;
	}
	
	public void printCount() {
		System.out.println("Tom赢得次数：" + winCount);
		System.out.println("Tom输得次数：" + failCount);
	}
	
}