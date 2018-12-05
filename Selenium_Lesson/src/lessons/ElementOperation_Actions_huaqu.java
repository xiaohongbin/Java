package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class ElementOperation_Actions_huaqu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.baidu.com/duty/");
		
		Thread.sleep(2000);
		//定义第一段文字
		WebElement string_sected = driver.findElement(By.xpath("//*/div[@class='dwri_bule']/table/tbody/tr/td/p"));
//		System.out.println(string_sected.getText());
		//定义第二段文字
		WebElement string_Second = driver.findElement(By.xpath("//*/div[@class='dwri_bule']/table/tbody/tr/td/ul/li[1]"));
		Actions action = new Actions(driver);
		action.clickAndHold(string_sected).moveToElement(string_Second).perform();
		action.release();
				
	}

}
