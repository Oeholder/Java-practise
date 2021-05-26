package com.star;

public class Homework09 {

	public static void main(String[] args) {
		Music music = new Music("喜羊羊与灰太狼",200);
		music.play(null);
		System.out.println(music.getInfo());
	}

}

class Music{
	String name;
	int time;
	
	public Music(String name, int time) {
		this.name = name;
		this.time = time;
	}
	
	public void play(String name) {
		System.out.println("正在播放:" + name);
	}
	
	public String getInfo() {
		return name + "\t" + time + "s";
	}
}