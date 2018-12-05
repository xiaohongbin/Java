package lessons;

import org.testng.annotations.Test;
import org.testng.Reporter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestngReportDemo {
  @Test
  public void TestReport() {
	  System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("httpps://www.baidu.com");
	  Reporter.log("打开网站");
	  driver.quit();
	  Reporter.log("关闭浏览器");
  }
}
