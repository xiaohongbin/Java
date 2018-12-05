package com.youyuan.array;
/**
 * 数组的基本用法，声明数组变量，创建数组对象，数组初始化
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		//声明数组变量
		int[] a;
		int b[];
		
		//创建数组对象
		a = new int[4];
		b = new int[3];
		
		//初始化(对数组元素的初始化)
		//默认初始化：数组元素相当于对象的成员变量，默认值和成员变量的规则一样，int 是0，布尔型是false，char是\u0000,引用是null
		//动态初始化
		for(int i=0;i<a.length;i++) {
			a[i] = i*4;
			System.out.println(a[i]);
		}
		
		//静态初始化
		int c[] = {12,23,34,56};	//length 4,索引范围[0,3]
		Cars[] cars = {
				new Cars("奔驰"),
				new Cars("宝马"),
				new Cars("大众")
		};
		Cars c2 =new Cars("奔驰");
		System.out.println(c2.equals(cars[0]));//见数组内存分析图3
		System.out.println(c2==cars[0]);
		System.out.println(cars[0].name);
		System.out.println(cars);
			
	}

}
