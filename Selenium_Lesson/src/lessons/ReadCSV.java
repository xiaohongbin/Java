package lessons;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCSV {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 加载CSV文件
		CSVReader reader = new CSVReader(new FileReader(".\\files\\testcsv.csv"));
		// 把内容添加到list中
		List<String[]> li = reader.readAll();
		System.out.println("总共行数是："+li.size());
		// 新建一个Itera引用
		Iterator<String[]> i1 =li.iterator();
		// 遍历每个值
		while(i1.hasNext()) {
			String[] str = i1.next();
			System.out.print(" 本行的值为：");
			for(int i=0;i<str.length;i++) {
				System.out.print(" "+str[i]);
			}
			System.out.println(" ");
			
			
			
			
		}
		
		

	}

}
