package lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElement_LinkText {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.baidu.com");
		
		//By linkText 查找元素
		driver.findElement(By.linkText("新闻")).click();
		//判断打开页面是不是百度新闻，这里用url作为验证
		System.out.println(driver.getCurrentUrl());
		assert driver.getCurrentUrl().equals("http://news.baidu.com/");
		if(driver.getCurrentUrl().equals("http://news.baidu.com/")) {
			System.out.println("test pass");
//			assert.fail();
		}

		Thread.sleep(2000);
		
		driver.quit();
	

	}

}
