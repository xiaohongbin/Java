package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;



public class ElementOperation_GetUrl {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.baidu.com");
		WebElement ele = driver.findElement(By.linkText("新闻"));
		ele.click();
		Thread.sleep(2000);
		String url =driver.getCurrentUrl();
		System.out.println(url);
		assert url.equals("http://news.baidu.com/");
		
		driver.quit();

	}

}
