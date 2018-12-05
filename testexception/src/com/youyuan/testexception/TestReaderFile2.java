package com.youyuan.testexception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReaderFile2 {
	public static void main(String[] args) {
		FileReader reader =null;//定义一个全局 变量 reader
		try {
			/*FileReader*/ reader = new FileReader("e:/a.txt");
			char c = (char) reader.read();
			char c2 = (char)reader.read();
			System.out.println(""+c+c2);//""连接字符串
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(reader!=null) {
					reader.close();
				}				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
