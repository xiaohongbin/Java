package lessons;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestNG_TestCrossBrowser {
	@Test
	@Parameters("Browser")
	public void startBrowser(String browser) throws Exception{
		if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.baidu.com");
			driver.findElement(By.id("kw")).sendKeys("有缘网");
			Thread.sleep(2000);
			driver.quit();
			
		}
		else if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.baidu.com");
			driver.findElement(By.id("kw")).sendKeys("百度");
			Thread.sleep(2000);
			driver.quit();
		}
	}

	

}
