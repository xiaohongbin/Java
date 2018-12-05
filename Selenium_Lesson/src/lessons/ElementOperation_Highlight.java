package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementOperation_Highlight {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		driver.get("https://www.baidu.com");
		
		driver.findElement(By.xpath("//*[@id='u1']/a[7]")).click();
		driver.findElement(By.xpath(".//*[@id='TANGRAM__PSP_10__footerULoginBtn']")).click();
		
		WebElement username = driver.findElement(By.xpath(".//*[@id='TANGRAM__PSP_10__userName']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		username.sendKeys("abcdefg");
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", username);
		Thread.sleep(1000);
		WebElement passwd = driver.findElement(By.id("TANGRAM__PSP_10__password"));
		passwd.sendKeys("123456");
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", passwd);
		Thread.sleep(1000);
		driver.quit();
		

	}

}
