package com.youyuan.oop.array;
/**
 * finnal，看做是常量，不能被继承，不能被重写
 * 重载方法string();length();indexOf(),substring()，replace(),
 * ==，作用于引用类型的变量，则比较的是所指向的对象的地址
 * @author Administrator
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str1 = "abcdef";
		String str2 = "abcdef";
		System.out.println(str1.charAt(3));
		System.out.println(str1.equals(str2));//equals()比较内容是否相等
		System.out.println(str1==str2);
//		System.out.println(str1.charAt(6));	//StringIndexOutOfBoundsException
		String str = new String("testing");//调用重载结构体
		String stre = new String("testing");
		System.out.println(str);
		System.out.println(str.equals(stre));
		System.out.println(str==stre);//new的两个对象地址不同，因此返回false
		char[] char1 = {'a','b','c'};
		String s1 = new String(char1);
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.indexOf('b'));//返回指定字符串索引位置，不存在返回-1
		String s2 = s1.substring(1);
		System.out.println(s2);
		String s3 = s1.replace('a','b');//替换指定字符，被替换字符不存在则返回原字符串
		System.out.println(s3);
		
		String s4 = "zhansan,lisi,wangwu";
		String[] strArray = s4.split(",");
		System.out.println(strArray);
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
				
		
		
	}

}
