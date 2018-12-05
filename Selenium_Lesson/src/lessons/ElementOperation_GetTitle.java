package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementOperation_GetTitle {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.baidu.com");
		
		String title=driver.getTitle();
		System.out.println(title);
//		assert title =="百度一下，你就知道";
		assert title.equals("百度一下，你就知道");
		Thread.sleep(2000);
		driver.quit();

	}

}
