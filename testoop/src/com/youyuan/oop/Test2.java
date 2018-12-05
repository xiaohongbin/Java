package com.youyuan.oop;

public class Test2 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="张三";
		s1.age=18;
		
		Computer c=new Computer();
		c.brand="联想";
		c.cpuSpeed=100;
		s1.computer=c;
		System.out.println(s1.computer.brand);
		s1.study();
		s1.sayHello("李四");
	}
}