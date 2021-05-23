package com.star;

import java.util.Random;

public class MazeRecursion {

	public static void main(String[] args) {
		int maze[][] = new int[8][8];
		//建立迷宫边界
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				if(i == 0 || i == maze.length - 1) {
					maze[i][j] = 1;
				}
				if(j == 0 || j == maze[i].length - 1) {
					maze[i][j] = 1;
				}
			}
		}
		Random random = new Random();
		//随机生成障碍墙
		for (int i = 2; i < maze.length - 2; i++) {
			for (int j = 1; j < maze[i].length; j++) {
				int r = random.nextInt(7);
					maze[i][r] = 1;
					j+=2;
			}
		}
		//设置起点和出口
		
		//显示迷宫
		for (int i[] : maze) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
		//使用findWay寻路
		Maze maze01 = new Maze();
		maze01.findWay(maze, 1, 1);
		System.out.println("===============" + "\n  寻路情况如下：\n" + "===============");
		//显示寻路情况
		for (int i[] : maze) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

	}

}

class Maze{
	//(i,j)为老鼠坐标
	// 0 表示可以走没走；1 表示障碍物；2 表示可以走；3 表示此路不通
	//当maze[6][6] = 2到达出口，否则继续寻找
	//招路策略：下 右 上 左
	public boolean findWay(int maze[][], int i, int j) {
		int row = maze.length;
		int col = maze[1].length;
		if(maze[row - 2][col - 2] == 2) {//说明已经找到
			return true;
		}else {
			if(maze[i][j] == 0) {//说明可以走但还没走
				//假定可走通
				maze[i][j] = 2;
				//使用找路策略来确定是否真的可有走通
				if(findWay(maze, i + 1, j)) {//先试着走 下 
					return true;
				}else if(findWay(maze, i, j + 1)) {//右 
					return true;
				}else if(findWay(maze, i - 1, j)){//上
					return true;
				}else if(findWay(maze, i, j - 1)){//左
					return true;
				}else {
					maze[i][j] = 3;
					return false;
				}
				/* 若往下走遇到1，会返回false，
				 * 判断不通过，进入下一方向(右)的判断
				 * 若遇到不通的路比如：
				 * 1 2 1 1
				 * 0 2 0 1
				 * 1 1 1 1
				 * 先往右，递归之后变为
				 * 1 2 1 1
				 * 0 2 3 1
				 * 1 1 1 1
				 * 返回false，判断不通过，回溯到2行2列点；
				 * 进入 上 方向的判断，上方为2，判断结果为false；
				 * 进入 左 方向的判断，左方为0，继续执行递归，
				 * 直到找到出口，返回true；判断通过，返回true。
				 */
			}else {
				return false;
			}
		}
	}
}
