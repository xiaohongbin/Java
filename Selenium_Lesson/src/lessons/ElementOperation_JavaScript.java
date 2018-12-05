package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ElementOperation_JavaScript {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("http://blog.csdn.net/u011541946");
		Thread.sleep(2000);
		// 定义csdn底部 关于 这个元素
//		WebElement ele = driver.findElement(By.xpath(".//*[@id='Paging_005661461281921454']/ul/li[2]"));
		WebElement ele = driver.findElement(By.linkText("关于"));
		//创建一个javascript 执行实例
		JavascriptExecutor je =(JavascriptExecutor) driver;
		//移动到元素element对象的“顶端”与当前窗口的“顶部”对齐
		je.executeScript("arguments[0].scrollIntoView(true);", ele);
//		je.executeScript("arguments[0].scrollIntoView(false);", ele);
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 700)");
		Thread.sleep(2000);
		driver.quit();

	}

}
