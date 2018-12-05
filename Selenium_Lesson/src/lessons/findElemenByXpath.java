package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class findElemenByXpath {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.baidu.com");
//		driver.findElement(By.xpath(".//*[@id='kw']")).sendKeys("java");
//		driver.findElement(By.xpath(".//*/input[@id='kw']")).sendKeys("java");
//		driver.findElement(By.xpath(".//*/input[@name='wd']")).sendKeys("java");
		driver.findElement(By.xpath(".//*/input[@class='s_ipt']")).sendKeys("测试");
//		driver.findElement(By.xpath(".//*[@id='su']")).click();
//		driver.findElement(By.xpath(".//*/input[@id='su']")).click();
//		driver.findElement(By.xpath(".//*/input[@value='百度一下']")).click();
		driver.findElement(By.xpath(".//*/input[@class='bg s_btn']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
