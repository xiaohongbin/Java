package com.youyuan.test;
/**
 * File 类，文件和路径
 */
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {
	public static void main(String[] args) {
		File f = new File("E:\\eclipse-workspace\\testfile\\src\\com\\youyuan\\test\\TestFile.java");
		File f1 = new File("E:\\eclipse-workspace\\testfile\\src\\com\\youyuan\\test");
		File f2 = new File(f1,"TestFile.java");
		File f3 = new File(f1,"Test01.java");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f.isFile()) {
			System.out.println("是一个文件");
		}
		if(f1.isDirectory()) {
			System.out.println("是一个文件夹");
		}
		String filename = f.getName();//获取文件或文件夹名称
		System.out.println(filename);
		String filepath = f.getPath();
		System.out.println(filepath);
		Long mo = f.lastModified();
		System.out.println(mo);
//		Date d = new Date(mo);
//		System.out.println(d);
//		DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
//		String str = df.format(d);
//		System.out.println(str);
		System.out.println(f.length());
		File f4 = new File("E:\\eclipse-workspace\\testfile\\src\\com\\youyuan\\test\\aa\\bb");
		f4.mkdirs();
		File f5 = new File("E:\\eclipse-workspace\\testfile\\src\\com\\youyuan\\test\\cc");
		f5.mkdir();
		f3.delete();
		
	}
}