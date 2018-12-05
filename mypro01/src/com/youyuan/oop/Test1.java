package com.youyuan.oop;

public class Test1 {
	public static void main(String[] args) {
		//通过类加载器 class loader 加载 Student类，加载后，在方法区中就有了Student类的代码信息(属性、方法)
		Student s1=new Student();	//堆内存中实例化一个 Student 对象
		System.out.println(s1);	//s1的内存地址
//		System.out.println("dizhi"+s1.name);
//		System.out.println("@"+s1.name.hashCode());
		s1.name="张三";
//		System.out.println("@"+s1.name.hashCode());//输出变量name地址
		s1.study();
		
		s1.sayHello("李四");
		Student s2=new Student();	//堆内存中实例化另外一个Student 对象
		System.out.println(s2);//s2的内存地址
//		s2.name="张三";
//		System.out.println("@"+s2.name.hashCode());
		s2.age=18;//基本数据类型，可以直接赋值
		s2.sayHello("老高");
		
	}
}
