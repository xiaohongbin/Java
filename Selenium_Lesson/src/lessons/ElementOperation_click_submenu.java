package lessons;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementOperation_click_submenu {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("http://jqueryui.com/resources/demos/selectmenu/default.html");
		
		Thread.sleep(2000);
//		System.out.println(driver.findElement(By.id("speed-button")).getAttribute("innerHTML"));
		driver.findElement(By.id("speed-button")).click();
		Thread.sleep(2000);
		
		List<WebElement> lists = driver.findElements(By.xpath("//*[@id='speed-menu']/li/div"));
		
		for(WebElement list:lists) {
//			if(list.getText().equals("Slow")) {
			//getAttribute("inerHTML")就是获取当前元素上面的文字，相当于getText()
			if(list.getAttribute("innerHTML").equals("Slow")) {
				list.click();
				break;
			}
		
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
