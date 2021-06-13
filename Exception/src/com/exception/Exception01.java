package com.exception;

/**
 * 
 *项目名称:Exception
 *类名称:Exception01
 *类描述:异常
 *常见的编译异常
 *SQLException————操作数据库时，查询表可能发生异常
 *IOException————操作文件时，发生的异常
 *FileNotFoundException————当操作一个不存在的文件时，发生异常
 *ClassNotFoundException————加载类,而该类不存在时，异常
 *EOFException————操作文件，到文件未尾，发生异常
 *IllegalArguementException————参数异常
 *创建人:郝鸿儒
 *创建时间:2021年6月7日 下午12:10:08
 *版本: 1.0
 */
@SuppressWarnings("serial")
public class Exception01 extends Exception{//如果不使用try-catch默认使用throws

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		//int res = num1 / num2;//执行到这步程序会抛出异常：ArithmeticException，程序崩溃，下面的代码不在执行
		//如果程序员觉得一段代码会出现问题，可以使用try-cratch异常处理机制来解决，从而保证程序的健壮性
		//将代码块放入try-catch中，如果出现异常，catch会捕获异常，程序继续执行
		try {
			//代码可能有异常
			int res = num1 / num2;
		} catch (Exception e) {
			//捕获到异常
			//当异常发生时，系统将异常封装成Exception对象e，传给catch
			//e.printStackTrace();
			System.out.println(e.getMessage());//输出异常信息
		}finally {
			//不管try{}中有没有异常，始终要执行finally，通常将释放资源的操作放在这里
		}
		System.out.println("runing......");
		/**
		 * throws一直向上抛出直到JVM
		 * JVM处理异常
		 * 1.输出异常信息
		 * 2.退出程序
		 */
	}

}
