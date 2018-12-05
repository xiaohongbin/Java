package com.youyuan.oop.testThis;
/**
 * this,隐士参数：普通方法，指向调用该方法的对象；构造方法，正在初始化的对象
 * 静态方法不能使用this
 * @author 肖红宾
 *
 */
public class Student {
	//静态数据
	String name;
	int id;

	
	public Student(String name,int id) {
		this();	//通过this调用其他构造方法，必须位于第一句
//		this(name);	//构造方法只能用调用一个
		this.name=name;
		this.id=id;
	}
	public Student(String name) {
		this.name=name;
	}
	public Student() {
		System.out.println("构造一个对象");
	}
	//动态的行为
	public void study(String name) {
		this.name=name;
		System.out.println(name+"在学习");
	}
	public void sayHello(String sname) {
		System.out.println(name+"对"+sname+"说：你好！");
	}	
	
}
