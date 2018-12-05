package testSuites;
 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import framework.LogType;
import framework.Logger;
 
public class TestLog {
	
	public static void main(String[] args) throws Exception{
		
	     System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");  
	     WebDriver driver = new ChromeDriver(); 
//	     Logger.Output(LogType.LogTypeName.INFO, "启动chrome浏览器");
	     Logger.Output1(Logger.LogTypeName.INFO, "启动chrome浏览器");
	    
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     Logger.Output(LogType.LogTypeName.INFO, "设置隐式时间10秒");
	     
	     driver.get("https://www.baidu.com");
	     Logger.Output(LogType.LogTypeName.INFO, "打开百度首页");
	     
	     driver.findElement(By.id("kw")).sendKeys("Selenium");
	     Logger.Output(LogType.LogTypeName.INFO, "搜索输入框输入关键字selenium");
	     
	     Thread.sleep(2000);
	     driver.quit();
	     
	     
	}
 
}
