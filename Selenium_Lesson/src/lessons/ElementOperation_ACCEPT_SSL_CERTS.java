package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;




public class ElementOperation_ACCEPT_SSL_CERTS {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/* chrome 浏览器
		 * 
		 
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		
		// 打开带capability设置选项的浏览器
		WebDriver driver =new ChromeDriver(cap);
		driver.manage().window().maximize();
		driver.get("https://kyfw.12306.cn/otn");
		*/
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.gecko.driver", ".\\Tools\\geckodriver.exe");
		// 创建 firefox profile
//		FirefoxProfile profile = new FirefoxProfile();
//		// 把这项值设置为True,就是接受不可信任的证书
//		profile.setAcceptUntrustedCertificates(true);
		// 打开一个带上面设置好profile的火狐浏览器
		WebDriver driver = new FirefoxDriver(cap);
		//The constructor FirefoxDriver(FirefoxProfile) is undefined
		driver.manage().window().maximize();
		driver.get("https://kyfw.12306.cn/otn");
		
		Thread.sleep(2000);

	}

}
