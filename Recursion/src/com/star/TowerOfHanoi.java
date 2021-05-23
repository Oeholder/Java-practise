package com.star;

public class TowerOfHanoi {

	public static void main(String[] args) {
		//建立汉诺塔
		int num = 5;//层数
		int[] tower1 = new int[num] ,tower2 = new int[num],tower3 = new int[num];
		for (int i = 0; i < tower1.length; i++) {
			tower1[i] = i + 1;
			System.out.print(tower1[i] + "\t" + tower2[i] + "\t" + tower3[i] + "\n");
		}
		
		SolveHanoi hanoi = new SolveHanoi();
		hanoi.solveHanoi(num, tower1, tower2, tower3);
		System.out.println("=================");
		for (int i = 0; i < tower1.length; i++) {
			System.out.print(tower1[i] + "\t" + tower2[i] + "\t" + tower3[i] + "\n");
		}
	}
}
class SolveHanoi{
	int num;
	public void solveHanoi(int num,int tower1[],int tower2[],int tower3[]) {
		//如果只有一个盘 num = 1
		if(num == 1) {
			tower3[tower3.length - 1] = tower1[tower1.length - 1];
		}else {
			//如果有多个盘，可以当作两个盘
			//先移动上面所有的到 2，借助 3
			solveHanoi(num - 1, tower1, tower3, tower2);
			//把最下面的移动到 3
			tower3[tower3.length - 1] = tower1[tower1.length - 1];
			//移动 2 所有的到 3， 借助 1
			solveHanoi(num - 1, tower2, tower1, tower3);
		}
	}
}
