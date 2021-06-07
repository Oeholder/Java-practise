package com.final_;

/**
 * 
 *项目名称:Final
 *类名称:Final
 *类描述:final关键字细节
 *
 *final可以修饰类、属性、方法和局部变量
 *在某些情况下,程序员可能有以下需求，就会使用到final:
 *(1)当不希望类被继承时,可以用final修饰
 *(2)当不希望父类的某个方法被子类覆盖/重写(override)时,可以用final关键字修饰
 *(3)当不希望类的的某个属性的值被修改,可以用final修饰
 *(4)当不希望某个局部变量被修改，可以使用final修饰
 *
 *1.final修饰的属性在定义时要赋初值：定义时赋值，构造器赋值，代码块赋值（静态的不能在构造器中赋值）
 *2.final不能修饰构造器
 *3.final和static往往搭配使用，效率更高，不会导致类加载，底层编译器做了优化处理
 *4.String是final类，不能被继承
 *创建人:郝鸿儒
 *创建时间:2021年6月1日 上午10:00:25
 * @version
 */
public class Final {
	public static void main(String[] args) {
		
	}
}
