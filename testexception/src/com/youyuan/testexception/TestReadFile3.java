package com.youyuan.testexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 测试 try catch finally return执行顺序:1.执行try/catch里面的语句，给return赋值(但不会结束运行),
 * 2.finally里面的语句 3.执行return语句。
 * @author Administrator
 *
 */
public class TestReadFile3 {
	public static void main(String[] args) {
		String str = new TestReadFile3().openFile();
		System.out.println(str);
	}
	String openFile() {
		try {
			System.out.println("aaa");
			FileInputStream fis = new FileInputStream("e:/aa.txt");
			int a = fis.read();
			return "step1";
		} catch (FileNotFoundException e) {
			System.out.println("catch!!");
			e.printStackTrace();
			return "step2";//先确定返回的值(先赋值，)，并不会直接结束运行
		} catch (IOException e) {
			e.printStackTrace();
			return "step3";
		}finally {
			System.out.println("finally!!!");
//			return "step4";//不要在finally中设置返回值，会覆盖之前的赋值
		}
	}

}
