package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementOperation_comaction {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.baidu.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,"t"));
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
