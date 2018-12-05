package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementOperation_Date_slected {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("http://jqueryui.com/resources/demos/datepicker/default.html");
		
		// 日期输入框
		WebElement date_inutbox = driver.findElement(By.id("datepicker"));
		//鼠标点击日期输入框
//		date_inutbox.click();
//		// 点击下一个月
//		driver.findElement(By.xpath("//*/div[@id='ui-datepicker-div']/div/a[@data-handler='next']")).click();
//		Thread.sleep(2000);;
//		
//		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a")).click();
//		Thread.sleep(2000);
		
		//直接使用sendkeys
		date_inutbox.sendKeys("07/17/2018");
		Thread.sleep(2000);
		driver.quit();

	}

}
