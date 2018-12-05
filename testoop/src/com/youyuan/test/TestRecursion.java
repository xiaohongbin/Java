package com.youyuan.test;
/**
 * 递归算法的基本流程，写了一个阶乘的例子
 * @author Administrator
 * @version V1.0
 */
public class TestRecursion {
	public static  int a=0;
	/**
	 * 计算阶乘，阶乘的意思是：5*4*3*2*1
	 * @param m 参数m是阶乘的最大值
	 * @return 返回阶乘的结果值
	 */
	public static int factorial(int m) {
		
		if(m==1) {//递归头
			return 1;
		}else {//递归体
			return m*factorial(m-1);
		}
	}
	public static void test01(){
		a++;
		System.out.println(a);
		if(a<5) {
		test01();
		}else {
			System.out.println("over");	
		}
	}
	public static void test02(){
		System.out.println("TestRecursion.test02()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
		test01();
	}

}
