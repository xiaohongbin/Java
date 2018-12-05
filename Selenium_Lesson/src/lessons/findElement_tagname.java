package lessons;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class findElement_tagname {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");
//		WebDriver driver= new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://news.baidu.com");
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.F11);
		

	}

}
