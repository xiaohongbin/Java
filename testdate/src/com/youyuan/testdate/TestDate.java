package com.youyuan.testdate;

import java.util.Date;

/**
 * Date 类，java.util.Date获取系统时间,Date(),getTime(),setTime(),before(),after()
 * @author Administrator
 *
 */
public class TestDate {
	public static void main(String[] args) {
		Date d = new Date();//获取系统当前时间
		System.out.println(d);
		System.out.println(d.toString());
		long t = System.currentTimeMillis();
		System.out.println(t);
		Date d2 = new Date(1000);//获取指定数字对应的时间
		System.out.println(d2);
		System.out.println(d2.toGMTString());
		System.out.println("************");
		System.out.println(d2.getTime());
		System.out.println(d.getTime());//相当于System.currentTimeMillis()
		d2.setTime(2000);//重新设置时间
		System.out.println(d2);
		System.out.println(d.before(d2));
		System.out.println(d.after(d2));
		System.out.println(d.getTime()<d2.getTime());
		
		
	}

}
