package testSuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import pageObjects.JdHomePage;

public class TestWithPOM {
	WebDriver driver;
  @Test
  public void testLogin() {
	  JdHomePage hp = PageFactory.initElements(driver, JdHomePage.class);
	  //PageFactory 多名称的用法？
	  hp.login("user1", "123456");
  }
  @BeforeClass
  public void setup() throws Exception{
	  System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.jd.com");
	  Thread.sleep(2000);
	  
  }

}
