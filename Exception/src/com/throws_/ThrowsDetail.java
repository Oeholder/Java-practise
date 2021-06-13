package com.throws_;

import java.security.spec.ECFieldF2m;

/**
 * 
 *项目名称:Exception
 *类名称:ThrowsDetail
 *类描述:throws细节
 *创建人:郝鸿儒
 *创建时间:2021年6月9日 下午6:06:43
 *版本: 1.0
 */
@SuppressWarnings("unused")
public class ThrowsDetail {
	public static void main(String[] args) {
		try {
			f2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	/**
	 * 1)对于 编译异常 ，程序中必须处理，比如try-catch 或者throws
	 * 2)对于运行时异常，程序中如果没有处理，默认就是throws的方式处理
	 * 3)子类重写父类的方法时，对抛出异常的规定:子类重写的方法，所抛出的异常类型要么和父类抛出的异常一致，要么为父类抛出的异常的类型的子类型
	 * 4)在throws过程中，如果有方法 try-catch，就相当于处理异常，就可以不必throws
	 */
	public static void f2() {
		int n1 = 10;
		int n2 = 0;
		double res = n1 / n2;
	}
}
