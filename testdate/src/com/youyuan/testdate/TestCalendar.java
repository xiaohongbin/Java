package com.youyuan.testdate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * 测试日历类,Calendar,子类GregorianCalendar,常用方法，set，get, getTime，setTime(Date)
 * 日期和long整形转化
 * @author Administrator
 *
 */
public class TestCalendar {
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		c.set(2018, 10, 31, 13, 41, 15);//注意月份是从0-11,0代表1月份，11代表12月份
		Date d = c.getTime();
		System.out.println(d);
		c.set(2018, Calendar.OCTOBER, 31, 13, 49);//第二种方法
		Date d1 = c.getTime();
		System.out.println(d1);
		System.out.println("************");
		Calendar c1 = new GregorianCalendar();
		c1.set(Calendar.YEAR, 2018);
		c1.set(Calendar.MONTH,9);//10月
		c1.set(Calendar.DATE,31);
		Date d2 = c1.getTime();//时分秒没有设置，默认获取当前时间
		System.out.println(d2);
		System.out.println(c1.get(Calendar.YEAR));//get 时间，YEAR，MONTH，DATE
//		System.out.println(c1.get(Calendar.HOUR));
		c1.setTime(new Date());
		Date d3 = c1.getTime();
		System.out.println(d3.getTime());
		//测试时间计算
		c1.add(Calendar.YEAR, 30);
		System.out.println(c1.get(Calendar.YEAR));
		c1.add(Calendar.YEAR, -40);
		System.out.println(c1.get(Calendar.YEAR));
	}

}
