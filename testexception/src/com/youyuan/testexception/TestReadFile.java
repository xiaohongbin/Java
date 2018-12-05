package com.youyuan.testexception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 声明异常，然后谁调用谁处理;
 * 声明多个异常；
 * 第二种方法扔给jre处理；
 * @author Administrator
 *
 */
public class TestReadFile {
	public static void main(String[] args) /*throws FileNotFoundException,IOException*/{//扔给jre处理
		String str;
		try {
			str = new TestReadFile().openFile();//谁调用谁处理，try catch
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(str);
		
	}
	String openFile() throws FileNotFoundException,IOException {
		FileReader reader = new FileReader("e:/a.txt");
		char c = (char)reader.read();
		return "";
	}

}
