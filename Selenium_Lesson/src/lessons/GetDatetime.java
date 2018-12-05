package lessons;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDatetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个data format对象
		DateFormat dateformat = new SimpleDateFormat("yyyyMMdd-HHmmss");
		//利用Date()获取当前时间
		Date date = new Date();
		//格式化时间,并用String对象存储
		String date1 = dateformat.format(date);
		
		System.out.println(date1);

	}

}
