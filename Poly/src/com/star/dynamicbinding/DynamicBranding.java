package com.star.dynamicbinding;

/**
 * 
 *项目名称：Poly
 *类名称：DynamicBranding
 *类描述：java动态绑定机制
 *1.当调用对象 方法 时，该方法会和给对象的 内存地址/运行类型 绑定
 *2.当调用对象 属性 时，没有动态绑定机制，哪里声明哪里使用
 *创建人： 郝鸿儒
 *创建时间：2021年5月26日 下午3:55:48
 * @version
 */
public class DynamicBranding {

	public static void main(String[] args) {
		Base base = new Sub();//向上转型
		
		System.out.println(base.getI());//调用的是子类方法
		System.out.println(base.sum());
		/**
		 * 方法有动态绑定机制，Sub中的sum()失效后，
		 * 调用Base中的sum() {return getI() + 10}，
		 * 这里 getI() = Sub.getI()
		 */
		System.out.println(base.sum1());
		/**
		 * 属性没有动态绑定机制Sub中sum1()失效后，
		 * Base中的sum1() {return i + 10}， 
		 * 这里 i = Base.i
		 */
	}

}
