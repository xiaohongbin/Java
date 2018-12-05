package lessons;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;


public class ElementOperation_Actions {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://www.baidu.com");
		Thread.sleep(2000);
		
		WebElement settings = driver.findElement(By.xpath(".//*[@id='u1']/a[8]"));
		Actions action = new Actions(driver);
		//将鼠标移动到elements元素列表上
		action.moveToElement(settings).perform();
		Thread.sleep(2000);
		
//		driver.findElement(By.linkText("高级搜索")).click();
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[6]/a[1]")).click();
		Thread.sleep(2000);
//		//以下实现方式报错，通过inut标签遍历，最后一个input标签是隐藏属性，因此会提示exception ElementNotVisibleException
////		List<WebElement> lists = driver.findElements(By.xpath("//*/table[@id='gxsz']/tbody/tr/td/input"));
//		List<WebElement> lists = driver.findElements(By.xpath("//*/div[@class='search-setting']/table[@id='gxsz']/tbody/tr/td/input"));
//		for(WebElement list:lists) {
//			System.out.println(lists.size());
////			System.out.println(list.);
//			list.click();
//			Thread.sleep(1000);
//		}
		//以下方式可以成功实现，通过label标签遍历，获取9个radio元素
		List<WebElement> lists = driver.findElements(By.xpath("//*/div[@class='search-setting']/table[@id='gxsz']/tbody/tr/td/label"));
		for(WebElement list:lists) {
			System.out.println(lists.size());
			System.out.println(list.getText());
			list.click();
			Thread.sleep(1000);
		}		
		
		driver.quit();
		

	}

}
