package lessons;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementOperation_TakeScreenshot {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.get("https://www.baidu.com");
		Thread.sleep(2000);
		
		/* 调用截图方法
		 * 指定了OutputType.FILE做为参数传递给getScreenshotAs()方法，其含义是将截取的屏幕以文件形式返回
		 */
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			/*copy 截图文件到文件夹 ./Screenshots
			 * 利用FileUtils工具类的copyFile()方法保存getScreenshotAs()返回的文件对象
			 */
			FileUtils.copyFile(src, new File(".\\Screenshots\\screen.png"));
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
		driver.quit();
	}

}
