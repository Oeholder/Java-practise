package com.demo_calender;

import java.util.Calendar;

/**
 * 
 *项目名称:Date
 *类名称:Calender_
 *类描述:第二代日期类
 *1) 第二代日期类,主要就是Calendar类(日历)。
 *	 public abstract class Calendar extends object implements Serializable,Cloneable, Comparable<Calendar>
 *2) Calendar类是一个抽象类，它为特定瞬间与一组诸如YEAR、MONTH、DAY_OF_MONTH、HOUR等日历字段之间的转换提供了一些方法,
 *	 并为操作日历字段（例如获得下星期的日期)提供了一些方法。
 *创建人:郝鸿儒
 *创建时间:2021年6月16日 上午10:13:45
 *版本: 1.0
 */
public class Calender_ {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();//创建日历类对象//比较简单，自由
		System.out.println(c);
		//2.获取日历对象的某个日历字段
		System.out.println("年:" + c.get(Calendar.YEAR));
		System.out.println("月:" + (c.get(Calendar.MONTH)+1));
		System.out.println("日:" + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("小时:" + c.get(Calendar.HOUR));
		System.out.println("分钟:" + c.get(Calendar.MINUTE));
		System.out.println("秒:" + c.get(Calendar.SECOND));
		//Calender没有专门的格式化方法，所以需要程序员自己来组合显示
		System.out.println(c.get(Calendar.YEAR) + "年"
						 +(c.get(Calendar.MONTH)+1) + "月"
						 +c.get(Calendar.DAY_OF_MONTH)+ "日");
	}

}
