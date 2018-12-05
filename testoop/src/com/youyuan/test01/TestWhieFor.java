package com.youyuan.test01;
/**
 * 测试 for 循环,课堂练习,计算100以内奇数、偶数总和
 * @author Administrator
 * 
 */
public class TestWhieFor {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
/*
		int a =1;//初始化
		while(a<=100) {//条件判断
			System.out.println(a);//循环体
			a++;//迭代
		}
		System.out.println("while 循环体结束");
		for(int j=1;j<=100;j++) {	//初始化，条件判断；迭代
			System.out.println(j);//循环体
		}
		*/
		int sum=0;
		int oddSum=0;
		int evenSum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
			if(i%2!=0) {	//求余数
				oddSum+=i;
			}
			if(i%2==0) {
				evenSum+=i;
			}
		}
		System.out.println("总和="+sum);
		System.out.println("奇数总和="+oddSum);
		System.out.println("偶数总和="+evenSum);
		
		//1-100被5整除的数
		
		for(int k=1;k<=100;k++) {
			if(k%5==0) {
				System.out.print(k+"\t");	
			}
			if(k%(5*3)==0) {
				System.out.println();
			}
		}
	
	}

}
