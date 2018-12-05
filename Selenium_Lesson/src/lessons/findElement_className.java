package lessons;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement_className {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.baidu.com");
		
		driver.findElement(By.className("s_ipt")).sendKeys("自动化测试");
		//className 'bg s_btn_wr'中间有空格，两个类名，其中bg 重复，s_btn_wr是唯一的
//		driver.findElement(By.className("s_btn_wr")).click();//可以成功定位点击
//		driver.findElement(By.className("bg")).click();//定位失败，因为class 'bg'有多个
		driver.findElement(By.className("s_btn")).click();//也可以成功定位点击
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
