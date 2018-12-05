package lessons;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestDepend {
	WebDriver driver;
  @Test
  public void openbaidu() throws InterruptedException{
	  driver.get("https://www.baidu.com");
	  Thread.sleep(2000);
	  System.out.println(driver.getTitle());
//	  assertTrue(driver.getTitle()=="百度一下，你就知道");
	  
	  String title=driver.getTitle();
//	  百度一下，你就知道
//	  assertTrue(driver.getTitle().equals("百度一下，你就知道"));
	  if(!title.equals("百度一下，你就知道1")) {
		  Assert.fail("title不是百度");
	  }
	 
	  
  }
  @Test(dependsOnMethods= {"openbaidu"})
//  @Test
  public void testsearch() throws InterruptedException{
	  driver.findElement(By.id("kw")).sendKeys("有缘网");
	  driver.findElement(By.id("su")).click();
	  Thread.sleep(2000);
	  
  }
//  @Test(dependsOnMethods= {"testsearch"})
  @Test(enabled=false)
  public void stestsearch2() throws InterruptedException{
	  driver.findElement(By.id("kw")).clear();
	  driver.findElement(By.id("kw")).sendKeys("selenium");
	  driver.findElement(By.id("su")).click();
	  Thread.sleep(2000);
  }
  @BeforeClass
  public void setuo() {
	  System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
