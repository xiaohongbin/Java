package lessons;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class HandlePopup {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		// 创建HashMap类的一个对象
		Map<String,Object> prefs = new HashMap<String,Object>();
		// 设置提醒的设置，2表示block
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		// 在 Chrome driver传入options设置
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://weibo.com/");
		driver.manage().window().maximize();
		

	}

}
