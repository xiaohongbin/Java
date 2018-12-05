package com.youyuan.testexception;

import java.io.FileNotFoundException;
/**
 * try catch 快捷键，选中要添加try..catch的代码段，然后点击鼠标右键，选择【Sourround With】选项；
 * 然后选择【Try/Catch Block】或者【6 try(try catch block)】选项
 */
import java.io.FileReader;
import java.io.IOException;

public class BB {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("e:/a.txt");
			char c = (char) reader.read();
			char c2 = (char)reader.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
