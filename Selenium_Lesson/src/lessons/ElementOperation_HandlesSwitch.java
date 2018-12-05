package lessons;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementOperation_HandlesSwitch {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.jd.com");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.linkText("京东超市"));
		ele.click();
		Thread.sleep(2000);
		
		//获取当前句柄；实际打开页面时，A页面点击，已经打开B页面，但是句柄还是停留在A页面的句柄，因此需要从A页面句柄切换到B页面句柄
		String handle = driver.getWindowHandle();
		//获取所有句柄，并循环判断不是当前的句柄
		for(String handles:driver.getWindowHandles()) {
			if(handles.equals(handle)) 
				continue;
			driver.switchTo().window(handles);
				
			
		}
		
		WebElement shengxian_link = driver.findElement(By.linkText("京东生鲜"));
		shengxian_link.click();
//		Thread.sleep(2000);
//		driver.close();
//		Thread.sleep(2000);
//		driver.close();
//		Thread.sleep(2000);
//		driver.close();
				

	}

}
