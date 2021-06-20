package com.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_ {

	public static void main(String[] args) throws ParseException{
		Date d1 = new Date();//获取当前系统时间
		System.out.println(d1);
		
		Date d2 = new Date(9234567);//通过指定毫秒数得到时间
		System.out.println(d2);
		
		System.out.println(d1.getTime());//获取某个时间对应的毫秒数
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd  hh:mm:ss E");
		String format = sdf.format(d1); // format:将日期转换成指定格式的字符串
		System.out.println(format);
		
		String s = "1996年01月01  10:20:30 星期一";
		Date parse = sdf.parse(s);
		System.out.println(parse);
	}
}
