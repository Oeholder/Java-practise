package com.star;

public class VaryParameterExercise {

	public static void main(String[] args) {
		LspMethod lsp = new LspMethod();
		System.out.println(lsp.showScore("张三", 23, 66, 81));
		System.out.println(lsp.showScore("李四", 91, 85));

	}

}

class LspMethod{
	public String showScore(String name, double... scores) {
		double sum = 0;
		for (double d : scores) sum += d;
		return "姓名:" + name + "\t" + scores.length + "门课总成绩为:" + sum;
	}
}