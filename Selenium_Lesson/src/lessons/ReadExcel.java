package lessons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 指定excel的路径
			File src = new File(".\\files\\testdata.xlsx");
			// 加载文件
			FileInputStream fis = new FileInputStream(src);
			// 加载workbook
//			@SuppressWarnings("resource");
//			Syntax error, insert "enum Identifier" to complete EnumHeaderName)
			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			//加载sheet，这里我们只有一个sheet,默认是sheet1
			XSSFSheet sh1 =wb.getSheetAt(0);
			
			// 开始读取第一行第一列的数据
			String data1=sh1.getRow(0).getCell(0).getStringCellValue();
			// 读取第一行第二列内容
			String data2 = sh1.getRow(0).getCell(1).getStringCellValue();
			// 读取第二行第一列内容
			String data3=sh1.getRow(1).getCell(0).getStringCellValue();
			// 读取第二行第二列内容
			String data4=sh1.getRow(1).getCell(1).getStringCellValue();
			
			// 获取实际总行数
			int rows= sh1.getPhysicalNumberOfRows();
			// 获取第一行的列数
			int cells = sh1.getRow(0).getPhysicalNumberOfCells();
			
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
			System.out.println(data4);
			System.out.println(rows);
			System.out.println(cells);
			
			//循环读取
			for(int i=0;i<sh1.getPhysicalNumberOfRows();i++) {
				for(int j=0;j<2;j++) {
					System.out.println(sh1.getRow(i).getCell(j).getStringCellValue());
				}
			}
			
			//写入excel数据
			sh1.getRow(0).createCell(2).setCellValue("Pass");
			sh1.getRow(1).createCell(2).setCellValue("Fail");
			sh1.getRow(2).createCell(2).setCellValue("N/A");
			sh1.getRow(3).createCell(2).setCellValue("Pass");
			// 保存文件(同一个文件名);结果另存为文件(不同的文件名)
			FileOutputStream fout = new FileOutputStream(new File(".\\files\\testdata1.xlsx"));
			//覆盖写入内容
			wb.write(fout);
			// 关闭文件
			wb.close();
			
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

		
	}

}
