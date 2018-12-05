package com.youyuan.wrap;
/**
 * 8种数据类型封装，基本数据类型转化为对象。byte,int，char，float，double，boolean，，
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Integer i = new Integer(1000);
		System.out.println(i);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(i));
		Integer i2 = Integer.parseInt("234");//字符串数字转换为10进制整数
		Integer i3 = new Integer("234");
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i2.intValue());
		String str = 234+"";
		System.out.println(str);
				
	}

}
