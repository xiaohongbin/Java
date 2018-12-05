package testSuites;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLog4j {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger("baidu");
		//读取配置文件
		PropertyConfigurator.configure(".\\config\\Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		logger.info("启动浏览器");
		driver.manage().window().maximize();
		logger.info("浏览器窗口最大化");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		logger.info("隐形等待2秒钟");
		
		driver.get("https://www.baidu.com");
		logger.info("打开百度网站");
		
		driver.findElement(By.id("kw")).sendKeys("有缘网");
		logger.info("搜索输入框输入 有缘网");
		
		Thread.sleep(2000);
		driver.quit();
		
		
		

	}

}
