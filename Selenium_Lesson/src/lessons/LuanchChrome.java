package lessons;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LuanchChrome {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.baidu.com");
		Thread.sleep(2000);
		// to(String url)在当前页打开新的网页 
		driver.navigate().to("http://news.baidu.com");
		Thread.sleep(2000);
		// back()后退到百度首页
		driver.navigate().back();
		Thread.sleep(2000);
		// forward() 前进到百度新闻
		driver.navigate().forward();
		Thread.sleep(2000);
		// 刷新当前页 
		driver.navigate().refresh();

	}

}
