package com.demo_localdate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 *项目名称:Date
 *类名称:LocalDate_
 *类描述:1)LocalDate(日期/、LocalTime(时间)、LocalDateTime(日期时间)JDK8加入
 *LocalDate只包含日期,可以获取日期字段
 *LocalTime只包含时间，可以获取时间字段
 *LocalDateTime包含日期+时间，可以获取日期和时间字段案例演示
 *创建人:郝鸿儒
 *创建时间:2021年6月16日 上午10:34:32
 *版本: 1.0
 */
public class LocalDate_ {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();//LocaIDate.now();//LocalTime.now();
		System.out.println(ldt);
		ldt.getYear();
		ldt.getMonthValue();
		ldt.getMonth();
		ldt.getDayOfMonth();
		ldt.getHour();
		ldt.getMinute();
		ldt.getSecond();
		/*
		 * 2) DateTimeFormatter格式日期类   类似于SimpleDateFormat
		 * DateTimeFormat dtf = DateTimeFormatter.ofPattern(格式);
		 * String str = dtf.format(日期对象);
		 */
		///关于DateTimeFormatter 的各个格式参数，需要看jdk8的文档.
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分钟ss秒");
		String strDate = dtf.format(ldt);
		System.out.println(strDate);
	}
}
