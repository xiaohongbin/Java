package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementOperation_IframeSwitch {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("http://data.pharmacodia.com/web/homePage/index?ns=1&ts=1&str=YWSJ");
		Thread.sleep(2000);
		driver.switchTo().frame("rightMain");
		
		WebElement ele = driver.findElement(By.xpath("//*/span[@title='化学药']"));
		//no such element exception
		ele.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(".//*[@id='noLoginAlert']/div/button")).click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
