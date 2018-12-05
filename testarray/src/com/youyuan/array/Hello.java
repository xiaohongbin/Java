//package com.youyuan.array;
/**
 * 在dos命令下运行带包的java文件
 * 第一步，dos命令环境，进入java文件所在的文件夹，javac命令编译；
 * 第二步，回退到package的父目录，java命令执行编译后的类文件：例子，java com.youyuan.array.Hello
 * @author Administrator
 *
 */
public class Hello {
	public static void main(String[] args) {
		for(int i = 0; i < 3;i++) {
			System.out.println("HelloWorld");
		}
		
	}

}
