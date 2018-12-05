package com.youyuan.teststringbuilder;
/**
 * 测试stringbuilder 一些常用方法
 * 增强for循环,例子for(int m:a)
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdefghijklm");
		sb.delete(2, 4);//区间范围是左闭右开[2,4)
		System.out.println(sb);
		sb.delete(2, 4).delete(2, 4);//方法链
		System.out.println(sb);
		System.out.println(args[0]);
		
		int[] a  = {12,23,11,2,3,4,56};
		for(int i =0;i<a.length;i++) {
			int m = a[i];
			System.out.println(m);
		}
		//增强for循环
		for(int m:a) {
			System.out.println(m);
		}
		
	}

}
