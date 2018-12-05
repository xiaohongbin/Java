
package com.youyuan.oop;
/**
 * 面向对象，以类方式组织代码，以对象的方式封装数据
 * 栈，放置局部变量；
 * 堆，放置new出的对象，包括变量(默认值)(注，不包括形参变量)和方法；同一个类被多次new时，会在堆内存中产生不同的对象
 * 方法区,也是堆，放置类的代码信息、static变量、常量池，例如代码sayHello(sname)
 * 方法区，通过类加载器 class loader 加载 Student类的方法；调用方法区内方法时，开辟栈帧，调用方法
 * 操作对象，实际是操作地址
 * @author Administrator
 *
 */
public class Student {
	//静态数据
	String name;
	int age;
	private int id;
	private char gender;
	Computer computer;
	
	//动态的行为
	public void study() {
		System.out.println(name+"在学习");
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(gender);
	}
	public void sayHello(String sname) {
		System.out.println(name+"对"+sname+"说：你好！");
		
	}
	
	

}
