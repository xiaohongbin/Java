package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import library.MyWait;
import org.openqa.selenium.Keys;

public class TestMyWait {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icloud.com/");
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		// 用户名输入框输入字段
//		driver.switchTo().frame("auth-frame");
		MyWait.isElementPresent(driver, ".//*[@id='account_name_text_field']", 10).sendKeys("tester");
		driver.findElement(By.xpath("//*[@id='account_name_text_field']")).sendKeys(Keys.ENTER);
		
		// 密码输入框输入字段
		MyWait.isElementPresent(driver, ".//*[@id='password_text_field']", 10).sendKeys("123456");
		driver.findElement(By.xpath(".//*[@id='password_text_field']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
