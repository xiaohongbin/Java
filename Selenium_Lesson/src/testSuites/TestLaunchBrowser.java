package testSuites;

import java.io.IOException;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framework.BrowserEngine;
import framework.Logger;

public class TestLaunchBrowser {
	public WebDriver driver;
  @Test
  public void search() throws Exception{
	  driver.findElement(By.id("kw")).sendKeys("有缘网");
	  driver.findElement(By.id("su")).click();
	  Thread.sleep(2000);
	  Logger.Output1(Logger.LogTypeName.INFO, "输入搜索数据");
	  
  }
  @BeforeClass
  public void setup() throws IOException{
	  BrowserEngine browserEngine = new BrowserEngine();
	  browserEngine.initConfigData();
	  driver=browserEngine.getBrowser();
  }

  @AfterClass
  public void teardown() {
	  driver.quit();
  }

}
