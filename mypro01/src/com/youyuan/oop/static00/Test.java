package com.youyuan.oop.static00;

public abstract class Test {
	public static void main(String[] args) {
		Student.ss=10;
		Student.printSS();
//		Student.study();	//静态方法main不能直接调用普通方法study()
		//Cannot make a static reference to the non-static method study() from the type Student
		Student stu=new Student();
		stu.study();
	}

}
