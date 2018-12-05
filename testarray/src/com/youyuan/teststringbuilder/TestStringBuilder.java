package com.youyuan.teststringbuilder;
/**
 * StringBuilder(),测试可变字符序列，StringBuilder(线程不安全，效率高)，StringBuffer(线程安全，效率低)
 * String:不可变字符序列
 * append 方法
 * @author Administrator
 *
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();//字符数组长度默认16
		StringBuilder sb1 = new StringBuilder(32);//字符数组长度初始32
		StringBuilder sb2 = new StringBuilder("abcd");//字符数组长度初始32,value[]={'a','b','c','d','\u0000'，...}
		System.out.println(sb2.length());
		sb2.append("efg");
		System.out.println(sb2);
		sb2.append(true).append(321).append("test");//通过 return this 实现方法链
		System.out.println(sb2);
		
		StringBuilder ghg = new StringBuilder("a");
		for(int i = 0; i < 3; i++) {//内存中生成2个对象
			ghg.append(i);	
		}
		System.out.println(ghg);//
			
	}

}
