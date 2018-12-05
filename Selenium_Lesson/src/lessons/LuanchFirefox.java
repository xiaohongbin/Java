package lessons;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class LuanchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",".\\Tools\\geckodriver.exe");
//		System.out.println(System.setProperty("webdriver.gecko.driver",".\\Tools\\geckodriver.exe"));
//		DesiredCapabilities capability = DesiredCapabilities.firefox();
//        capability.setCapability("webdriver.gecko.driver",".\\Tools\\geckodriver.exe");
		
		//初始化一个火狐浏览器实例，实例名称是driver
		WebDriver driver = new FirefoxDriver();
		//最大化窗口
		driver.manage().window().maximize();
		//设置隐形等待时间
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//get()打开一个站点
		driver.get("https://www.baidu.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//getTitle()获取当前页面title
		System.out.println("当前打开的页面标题是："+driver.getTitle());
		//关闭并退出浏览器
		driver.quit();
		
		
		
		

	}

}
