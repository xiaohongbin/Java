package com.youyuan.array;
/**
 * 字符串是一个string类型的对象；
 * 字符串成为不可变字符序列
 * private final char value[] ，final 表示数组变量'value'的值不可变，也就是value的内存地址值只能被赋值一次
 * literals ，字面量，表示说引号引来的字符串内容
 * String ，字符串，数组对象；
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
		char[] char1 = {'a','b','a','b'};
		String s1 = new String(char1);
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.indexOf('b'));//返回一个指定的字符串值最早出现的位置，在一个字符串中的指定位置从前向后搜索，不存在返回-1;从左到右
		System.out.println(s1.lastIndexOf('b'));//返回一个指定的字符串值最后出现的位置，在一个字符串中的指定位置从后向前搜索；从右到左
		System.out.println("*************");
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
		System.out.println("*******************");
		System.out.println("Abcbd".startsWith("Ab"));//true,false
		System.out.println("Abcbd".endsWith("bd"));
//		System.out.println(1.2.toString());
		System.out.println("Abcbd".toLowerCase());
		System.out.println("Abcbd".toUpperCase());
		System.out.println("Abcbd中文".toCharArray().length);
		System.out.println(" A bcbd ".trim());//去除收尾空格
		
		System.out.println("*********数组对象**********");
		String gh = "a";
		for(int i = 0; i < 3; i++) {//见数组内存分析4,内存中生成4个对象
			gh += i;	
		}
		System.out.println(gh);//
		String ghg = new String("a");
		for(int i = 0; i < 3; i++) {//见数组内存分析5，内存中生成5个对象
			ghg += i;	
		}
		System.out.println(ghg);//
		
		
	}

}
