package com.youyuan.test01;
/**
 * 测试for 循环,课堂练习,九九乘法表
 * @author Administrator
 * @version 2.0
 */
public class TestWhieFor2 {
	
	public static void main(String[] args) {
		for(int j=1;j<=9;j++) {
			for(int i=1;i<=j;i++) {
			
			System.out.print(i+"*"+j+"="+i*j+"\t");
		}
			System.out.println();
		}	
	
	}

}
