package com.star;

/**
 * 
 *项目名称:Main
 *类名称:Main_
 *类描述:理解main方法语法
 *创建人:郝鸿儒
 *创建时间:2021年5月31日 下午2:58:45
 * @version
 */
public class Main_ {

	public static void main(String[] args) {
		/**
		 * 1.main方法是java虚拟机在调用，所以该方法的访问权限必须是public
		 * 2.java虚拟机在执行main方法时不需要创建对象，所以该方法必须是static
		 * 3.该方法接受String类型数组参数，该数组中保存执行java命令时传递给所运行类的参数
		 * 4.main方法是静态方法，可以访问本类的静态方法和静态变量，不能直接访问非静态的方法和变量，需要创建对象之后调用
		 */
		for (int i = 0; i < args.length; i++) {
			//在cmd中运行  java  执行的程序 参数1 参数2 参数3  命令
			//在运行按钮小三角下的 run configurations 中的 arguments 中的 program arguments 里输入参数
			System.out.println(args[i]);//打印结果为：参数1 参数2 参数3
			
		}
		
	}

}
