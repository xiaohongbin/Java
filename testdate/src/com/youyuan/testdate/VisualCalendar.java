package com.youyuan.testdate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class VisualCalendar {
	public static void main(String[] args) {
		System.out.println("请输入日期：(年月日格式：2018-11-1)");
		Scanner scanner = new Scanner(System.in);
//		String strinput = scanner.nextLine();
		
//		String temp = "2018-11-11";
		String temp = scanner.nextLine();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = df.parse(temp);//字符串转化为date对象
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);//设置日历时间
//			System.out.println(calendar);
			int day = calendar.get(calendar.DATE);//获取日历中，日期值
//			int week = calendar.get(calendar.WEEK_OF_MONTH);
//			System.out.println(week);
			calendar.set(Calendar.DATE, 1);//设置日历中的日期为1号
//			System.out.println(calendar.getTime());
//			System.out.println(calendar);
//			System.out.println(calendar.get(calendar.DAY_OF_WEEK));
			int dayofweek = calendar.get(calendar.DAY_OF_WEEK);//获取1号是本周的第几天
//			int day =calendar.get(calendar.DAY_OF_MONTH);
//			System.out.println(calendar.getActualMaximum(calendar.DATE));
			int maxDate = calendar.getActualMaximum(calendar.DATE);//获取输入日期所在月的最大日期值
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			for(int i=0;i<dayofweek-1;i++) {
				System.out.print("\t");
			}
			for(int i=1;i<=maxDate;i++) {
				if(i==day) {
					System.out.print("*");
				}
				System.out.print(i+"\t");
				
				int w = calendar.get(calendar.DAY_OF_WEEK);
				if(w==Calendar.SATURDAY) {
					System.out.print("\n");
				}
				calendar.add(Calendar.DATE, 1);//日历日期加1
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		int j=0;
//		for(int i=1;i<=31;i++) {
//			System.out.print(i+"\t");
//			j++;
//			if(j%7==0) {
//				System.out.print("\n");
//			}
//		}
	}

}
