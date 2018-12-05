package com.youyuan.testexception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * try,catch,finally
 * @author Administrator
 *
 */
public class TestTryCatchFinally {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("e://a.txt");
			char temp = (char)reader.read();
			System.out.println("读出字符："+temp);
		} catch (FileNotFoundException e) {// 子类FileNotFoundException ，放在父类IOException上面，否则，子类不会执行
			System.out.println("文件没有找到");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("读取文件错误");
			e.printStackTrace();
		}finally {
			System.out.println("不管有没有异常我都会被执行");
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
