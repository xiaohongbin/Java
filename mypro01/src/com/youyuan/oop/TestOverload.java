package com.youyuan.oop;
/**
 * 测试方法重载，1.方法名相同2.形参变量个数不同/变量类型不同/变量顺序不同
 * 不能重载，形参类型相同，但是名称不同/与返回值类型无关
 * @author Administrator
 *
 */
public class TestOverload {
	public int add(int a,int b) {
		int sum = a+b;
		return sum;
	}

	public static void main(String[] args) {
		MyMath m=new MyMath();
		int result=m.add(5,6.1);
//		int s=add(2,3);
		
		System.out.println(result);
	}

}
 class MyMath{
	 int a,b;
	public int add(int a,int b) {
		 int sum;
		 return sum=a+b;
	}
	public int add(int a,int b,int c) {		//形参个数不同，可以重载
		int sum;
		return sum=a+b+c;
	}
	public int add(double a,int b) {	//形参类型不同，可以重载
		int sum;
		 return sum=(int)(a+b);
	}
	public int add(int a,double b) {	//形参顺序不同，可以重载
		int sum;
		 return sum=(int)(a+b);
	}
//	public int add(double c,int d) {	//形参变量名称不同，不可以重载
//		int sum;
//		 return sum=(int)(c+d);
//	}
	
//	public int add(int a,double b) {	//返回值类型不同，不可以重载
//		double sum;
//		 return sum=a+b;
//	}
	//构造方法重载
	public MyMath() {
		
	}
	public MyMath(int a) {
		this.a=a;
	}
	public MyMath(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public MyMath(double a,int b) {
		double sum=a+b;
		
	}
}
