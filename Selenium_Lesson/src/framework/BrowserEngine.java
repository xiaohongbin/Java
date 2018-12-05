package framework;

import java.io.FileInputStream;//从文件，例如图片，读取原始字节流
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class BrowserEngine {
	public String browserName;
	public String URL;
	public WebDriver driver;
	
	public void initConfigData() throws IOException{
		Properties p = new Properties();
		// 加载配置文件
		InputStream ips = new FileInputStream(".\\Testconfig\\config.properties");
		p.load(ips);//读取出列表，key，value键值对
		Logger.Output(LogType.LogTypeName.INFO, "Start to select browser name from properties file");
		//同一目录下不同类下的方法可以直接引用，不需要import
		browserName = p.getProperty("browserName");//查找获取指定的key的value
		Logger.Output(LogType.LogTypeName.INFO, "Your had select test browser type is: "+ browserName);
		URL = p.getProperty("URL");
		Logger.Output(LogType.LogTypeName.INFO, "The test server URL is"+ URL);
		ips.close();	
	}
	
	public WebDriver getBrowser() {
		if(browserName.equalsIgnoreCase("Firefox")) {//不区分大小写
			System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");
			driver = new FirefoxDriver();
			Logger.Output(LogType.LogTypeName.INFO, "启动火狐浏览器");
			
		}
		else if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
			driver = new ChromeDriver();
			Logger.Output1(Logger.LogTypeName.INFO, "启动谷歌浏览器");
		}
		System.out.println("-------------"+URL);
		driver.get(URL);
		Logger.Output1(Logger.LogTypeName.INFO, "打开网页："+URL);
		driver.manage().window().maximize();
		Logger.Output1(Logger.LogTypeName.INFO, "最大化窗口");
		callWait(5);
		return driver;	
	}
	/*
	 * 关闭浏览器并退出方法
	 */
	public void teardown() throws InterruptedException{
		Logger.Output1(Logger.LogTypeName.INFO, "关闭浏览器");
		driver.quit();
		Thread.sleep(2000);	
	}
	/*
	 * 隐式时间等待方法
	 */
	public void callWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		Logger.Output1(Logger.LogTypeName.INFO, "等待"+time+"秒钟");
	}

}
