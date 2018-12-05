package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ElementOperation_isDisplayed {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.baidu.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='u1']/a[7]")).click();
		driver.findElement(By.xpath(".//*[@id='TANGRAM__PSP_10__footerULoginBtn']")).click();;
		driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__userName']")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__password']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__submit']")).click();
		Thread.sleep(2000);
		//方法一
		WebElement error = driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__error' and text()='请输入验证码']"));
		assert error.isDisplayed();
		
		//方法二
		String error1 = driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_10__error']")).getText();
//		assert(error1=="请输入验证码");
		assert(error1.equals("请输入验证码"));
		

	}

}
