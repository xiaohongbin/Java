package com.youyuan.array2;

import java.util.Arrays;

/**
 * Arrays数组方法,
 * @author Administrator
 *
 */
public class TestArray {
	public static void main(String[] args) {
		int[] a = {1,4,35,34,2,3};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Arrays.fill(a, 2,4,100);//左闭右开[2,4)
		System.out.println(Arrays.toString(a));
	}
	

}
