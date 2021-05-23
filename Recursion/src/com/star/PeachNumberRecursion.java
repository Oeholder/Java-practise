package com.star;

public class PeachNumberRecursion {

	public static void main(String[] args) {
		Peach peach = new Peach();
		int peachNum = peach.peachNum(10, 1);
		System.out.println(peachNum);

	}

}
class Peach{
	/**
	 * 根据第day天剩余的桃子，计算day天前剩余的桃子
	 * @param day
	 * @param num
	 * @return
	 */
	public int peachNum(int day,int num) {//day为天数，num为剩下的桃子
		if(day == 1) {
			return num;
		}
		return (peachNum(day - 1,num) + 1)*2;
	}
}
