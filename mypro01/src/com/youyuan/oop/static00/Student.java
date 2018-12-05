package com.youyuan.oop.static00;
/**
 * static 静态变量，类变量或者成员变量；堆，存放new的对象，忽略static类型的属性和方法；方法区存在静态属性和方法
 * 静态方法不能调用非静态的属性和方法；
 * 普通方法可以调用静态的属性和方法
 * @author Administrator
 *
 */
public class Student {
	//静态数据
	String name;
	int id;

	static int ss;
	public static void printSS() {
		System.out.println(ss);
	}
	
	//动态的行为
	public void study() {
		System.out.println(name+"在学习");
		int a=ss;
		System.out.println(a);
	}
	public void sayHello(String sname) {
		System.out.println(name+"对"+sname+"说：你好！");
	}	

}
