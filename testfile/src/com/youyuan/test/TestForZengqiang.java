package com.youyuan.test;

public class TestForZengqiang {
	public static void main(String[] args) {
		int[] i = {2,22,32,11,24,5,6,7};
		for(int j=0;j<i.length;j++) {
			System.out.println("i["+j+"]="+i[j]);
		}
		for(int j:i) {
			System.out.println(j);
		}
	}

}
