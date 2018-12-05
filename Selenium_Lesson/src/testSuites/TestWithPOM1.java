package testSuites;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.JdHomePage1;

public class TestWithPOM1 {
	WebDriver driver;
  @Test
  public void testLogin() throws Exception {
	  JdHomePage1 hp =new JdHomePage1(driver);
//	  hp.clickLoginLink();
//	  hp.inputUsername("user1");
//	  hp.inputPassword("123456");
//	  hp.clickLoginbtn();
	  //使用登录重构方法
	  hp.login("user1", "123456");
  }
  @BeforeClass
  public void setup() throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.jd.com");
	  Thread.sleep(2000);
  }

}
