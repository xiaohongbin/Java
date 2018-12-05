package lessons;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class LuanchIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver",".\\Tools\\IEDriverServer.exe");
//		System.out.println(System.setProperty("webdriver.gecko.driver",".\\Tools\\geckodriver.exe"));
		
		//初始化一个火狐浏览器实例，实例名称是driver
		WebDriver driver = new InternetExplorerDriver();
		//最大化窗口
		driver.manage().window().maximize();
		//设置隐形等待时间
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//get()打开一个站点
		driver.get("https://www.baidu.com");
		//getTitle()获取当前页面title
		System.out.println("当前打开的页面标题是："+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//关闭并退出浏览器
		driver.quit();
		
		
		
		

	}

}
