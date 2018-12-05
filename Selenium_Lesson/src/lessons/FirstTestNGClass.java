package lessons;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestNGClass {
	WebDriver driver;
	
  @Test
  public void open_baidu() {
	  driver.get("https://www.baidu.com");
	  driver.findElement(By.id("kw")).sendKeys("有缘网");
	  driver.findElement(By.id("su")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
