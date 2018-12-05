package com.youyuan.test;
/**
 * 测试自动拆箱和装箱
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
//		Integer i = new Integer(1000);
		Integer i = 1000;//jdk5.0以后，自动装箱：编译器改进代码增加代码：Integer i = new Integer(1000)
		Integer i2 = 2000;
		int c = new Integer(1500);//编译器拆箱：new Integer(1500).intvalue();
		int c1 = i2;	//编译器拆箱i2.intvalue();
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(c);
		System.out.println(c1);
		System.out.println("**********************");
		Integer n = null;
//		int n1 = n;//编译报错，编译时调用空对象的值，java.lang.NullPointerException
		Integer d = 1234;
		Integer d1 = 1234;
		System.out.println(d==d1);//比较对象
		System.out.println(d.equals(d1));//比较值
		System.out.println("**********************");
		Integer d2 = 123;//[-128,127] 之间的数值，仍然当做基本数据类型来处理
		Integer d3 = 123;
		System.out.println(d2==d3);
		System.out.println(d2.equals(d3));
		
		
	}


}
