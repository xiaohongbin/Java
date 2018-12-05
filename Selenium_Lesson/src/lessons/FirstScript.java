package lessons;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class FirstScript {
		public static void main(String[] args) throws Exception{
			System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			driver.get("https://www.baidu.com");
			System.out.println(driver.getTitle());
			
			//判断title是不是 百度一下，你就知道
			try {
				String baidu_title ="百度一下，你就知道";
				assert baidu_title.equals(driver.getTitle());
				//assert equals 比对字符串；==比对数字
				System.out.println("test pass");
			}catch (Exception e) {
				e.printStackTrace();
			}
//			if(!driver.getTitle().equals("百度一下，ni你就知道")) {
//				assert.fail("标题错误");
//			}
			//关闭并退出浏览器
			Thread.sleep(2000);
			driver.quit();
			
		}
}

