package com.youyuan.testexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 捕捉异常
 * @author Administrator
 *
 */
public class TestException {
	public static void main(String[] args) {
		int i;
//		i = 10/0;//java.lang.ArithmeticException: / by zero
		
		int b =0;
		if(b!=0) {
			i=10/b;
		}else
		{
			System.out.println("不能用0做除数");
		}
		/**
		 * 对象是空
		 */
//		Computer c = null;
////		c.start();//java.lang.NullPointerException
//		if(c!=null) {
//			c.start();//对象是null，调用对象的方法或者在属性
//		}
//		Scanner s = new Scanner(System.in);
//		int a = s.nextInt();
//		System.out.println(a);
		String s1 = "123";
		Integer i1 = new Integer(s1);
		System.out.println(i1);
//		String s2 = "123cdef";
//		Integer i2 = new Integer(s2);//java.lang.NumberFormatException: 
//		System.out.println(i2);
		try {
			Thread.sleep(2000);//checkedException
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f = new File("e:/1.txt");
		if(!f.exists()) {
			try {
				throw new FileNotFoundException("file does not exist!");//自定义异常信息
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
	}
	void test2(Object obj) {
		if(obj instanceof Man) {
			Man man = (Man) obj;
		}
		
	}

}
class Computer{
	void start() {
		System.out.println("启动计算机");
	}
}
class Man{
	void strong() {
		System.out.println("两条胳膊");
	}
}
