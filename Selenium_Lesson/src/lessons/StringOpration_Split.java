package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class StringOpration_Split {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.baidu.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.id("kw")).sendKeys("有缘网");
		driver.findElement(By.id("su")).click();
		Thread.sleep(2000);
		
		// 定位 百度为您找到相关结果约xxxx个 这个元素
		WebElement res = driver.findElement(By.className("nums"));
		// 获取该字段值  "搜索工具 百度为您找到相关结果约xxxxx个"
		String res_string = res.getText();
		// 根据约这个词切片，取第二片字符串，应该得到“xxxx个”
		String str1 = res_string.split("约")[1];
		String str2 =str1.split("个")[0];
		
		System.out.println(str2);
		
		

	}

}
