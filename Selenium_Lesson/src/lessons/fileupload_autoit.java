package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class fileupload_autoit {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("user-data-dir=C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User Data");
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver",".\\Tools\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.baidu.com");
		
		// 点击照相机这个按钮
		driver.findElement(By.xpath(".//*/span[@class='soutu-btn']")).click();
		// 点击本地上传图片
		driver.findElement(By.xpath("//*/input[@class='upload-pic']")).click();
		// 执行桌面的AutoIt封装的脚本
		Runtime.getRuntime().exec(".\\Tools\\UploadFileChrome.exe");
		
		Thread.sleep(8000);
		
		driver.quit();

	}

}
