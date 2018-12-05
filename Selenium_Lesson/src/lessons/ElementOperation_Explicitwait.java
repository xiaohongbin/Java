package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;




public class ElementOperation_Explicitwait {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.icloud.com/");
		// 创建一个WebDriverWait类的一个对象 wait，设置5，默认单位是秒
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 1);
		driver.switchTo().frame("auth-frame");
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='account_name_text_field']")));
		boolean status = ele.isDisplayed();
		
		if(status) {
			System.out.println("===== 元素可见======");
		}else {
			System.out.println("===== 元素不可见======");
		}
		driver.quit();
	}

}
