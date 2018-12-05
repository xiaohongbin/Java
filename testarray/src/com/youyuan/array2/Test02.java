package com.youyuan.array2;

import java.util.Arrays;

/**
 * 二维数组，数组对象还是数组
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		int[][] a = {
				  		{1,2},
				  		{3,4,2,9},
				  		{5,6},
		};
		int[][] b = new int [3][];
		b[0] = new int[2];
		b[1] = new int[4];//b[1]对象是4阶数组
		b[2] = new int[2];
		b[0][0] = 1;
		b[0][1] = 2;
		b[1][0] = 3;
		b[1][1] = 4;
		b[1][2] = 2;
		b[1][3] = 9;
		b[2][0] = 5;
		b[2][1] = 5;
		System.out.println(a.toString());
		System.out.println(Arrays.toString(a));
		System.out.println(b.toString());
		System.out.println(Arrays.toString(b));
		
	}

}