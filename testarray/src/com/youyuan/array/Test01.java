package com.youyuan.array;

public class Test01 {
	public static void main(String[] args) {
		/**
		 *1.数组是相同数据类型(数据类型可以是任意类型,包括基本类型和引用类型)的有序集合；
		 *2.数组也是对象，数组元素相当于对象的成员变量；
		 *3.数组长度是确定的，不可不可变的，越界后报：ArrayIndexOutOfBoundsException；
		 *4.数组元素初始化规则与成员变量的初始化规则相同；
		 *普通属性(成员变量)从属于对象；
		 *注意：操作对象，操作的是对对象的引用
		 *
		 */
		int[] a = new int[3];
		a[0] = 11;
		a[1] = 22;
//		a[1] = "test";	//type mismatch
		a[2] = 33;		
//		a[3] = 44;	//报错，ArrayIndexOutOfBoundsException
		Cars[] cars = new Cars[4];
		cars[0] = new Cars("奔驰");
		cars[1] = new Cars("宝马");
		System.out.println(cars);
		System.out.println(cars[0]);
		System.out.println(cars[0].name);
		System.out.println(cars[1]);
		System.out.println(cars[1].name);
		
		
	}

}
