package com.youyuan.testdate;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * DateFormat以及子类SimpleDateFormat，字符串和时间对象转换，
 * 常用方法，format()格式化，parse();Date()重载方法获取时间
 * @author Administrator
 *
 */
public class TestDateFormat {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss，属于本年的第w周");
		Date d = new Date(333234123L);//数字转化为日期
		String str = df.format(d);//日期按照指定格式转化为指定格式的字符串
		System.out.println(str);
//		Date now = new Date();
//		String strnow = df.format(now);
//		System.out.println(strnow);
//		System.out.println(df.format(new Date()));
		System.out.println("************");
		String str2 = "2018,10,31";
		DateFormat df2 = new SimpleDateFormat("yyy,MM,dd");//格式规则要和str2字符串格式一致
		try {
			Date d2 = df2.parse(str2);//日期字符串转化为日期格式
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
			
	}

}
