package lessons;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;


public class Readproperties {
	
	public static String browser_Name;
	public static String server_Url;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Properties p = new Properties();
		//实例化一个输入对象ips
		InputStream ips = new FileInputStream(".\\Testconfig\\config.properties");
		p.load(ips);
		
		browser_Name = p.getProperty("browserName");
		server_Url = p.getProperty("URL");
		System.out.println(browser_Name);
		System.out.println(server_Url);
		ips.close();
		
		


	}

}
