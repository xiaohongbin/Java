package lessons;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class findElement_ByName {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.baidu.com");
		
		driver.findElement(By.name("wd")).sendKeys("自动化测试");
		driver.findElement(By.xpath(".//*/input[@class='s_ipt']")).click();
//		Thread.sleep(3000);
//		driver.quit();
		
		

	}

}
