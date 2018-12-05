package lessons;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElements_List {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		System.setProperty("weddriver.chrome.driver", ".\\Tools\\chromedriver.exe");//执行失败
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");//可以执行
		WebDriver driver= new ChromeDriver();
//		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("http://news.baidu.com");
		List <WebElement> links= driver.findElements(By.xpath(".//*[@id='pane-news']/div/ul/li"));
//		String title = driver.findElement(By.xpath(".//*[@id='pane-news']/div/ul/li[1]")).getText();//成功定位第一条新闻
//		String title = driver.findElement(By.xpath(".//*[@id='pane-news'][1]")).getText();
//		 int tt=0;
		String title = links.get(2).getText();
		System.out.println(title);
		for(int i=0;i<links.size();i++) {
//			System.out.println(links.size());
			System.out.println(links.get(i).getText());
			
		}
		driver.quit();

	}

}
