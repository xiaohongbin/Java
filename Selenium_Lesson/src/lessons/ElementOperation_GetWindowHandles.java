package lessons;
import java.util.concurrent.TimeUnit;
import java.util.List;
//import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class ElementOperation_GetWindowHandles {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.baidu.com");
		System.out.println(driver.getWindowHandle());
		WebElement ele=driver.findElement(By.partialLinkText("设为主页"));
		ele.click();
		System.out.println(driver.getWindowHandles());
		//定义一个字符串数组，数组长度，从getWindowHandles() 这个set 数组中获取
		String[] handles=new String[driver.getWindowHandles().size()];
//		String[] handles=driver.getWindowHandles();
		System.out.println(handles.length);
		//将
		driver.getWindowHandles().toArray(handles);
		System.out.println(handles[0]);
		System.out.println(handles[1]);
		System.out.println(handles);
//		handles.
//		System.out.println(getType(driver.getWindowHandles()));
//		List <WebElement> handles=driver.getWindowHandles();
//		System.out.println(handles.get(1));
		
		
		driver.quit();
		

	}

}
