package com.youyuan.array2;
/**
 * 矩阵，二维数组
 * @author Administrator
 *
 */
public class Matrix {
	/**
	 * 封装打印矩阵方法
	 * @param args
	 */
	public static void printMatrix(int[][] c) {
		for(int i=0;i<c.length;i++) {
			for(int j =0;j<c.length;j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	/**
	 * 封装矩阵加法
	 * @param args
	 */
	public static int[][] add(int[][]a,int[][]b){
		int c[][] = new int[a.length][a.length];
		for(int i=0;i<c.length;i++) {
			for(int j =0;j<c.length;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}	
		}
		return c;
	}
	public static void main(String[] args) {
		int[][] a = {//定义静态数组
						{1,3},
						{2,4},
					};
		int[][] b = {
						{3,4},
						{5,6},
					};
		int[][] c = new int[2][2];//定义动态数组
		int[][] d = add(a,b);
		printMatrix(d);
		System.out.println("*************");
//		c[0][0] = a[0][0] + b[0][0];
//		c[0][1] = a[0][1] + b[0][1];
		c[1][0] = a[1][0] + b[1][0];
		c[1][1] = a[1][1] + b[1][1];
		//矩阵加法
		for(int i=0;i<c.length;i++) {
			for(int j =0;j<c.length;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}	
		}

		System.out.println(c[0][0]+"\t"+c[0][1]);
		System.out.println(c[1][0]+"\t"+c[1][1]);
		//打印矩阵
		for(int i=0;i<c.length;i++) {
			for(int j =0;j<c.length;j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
