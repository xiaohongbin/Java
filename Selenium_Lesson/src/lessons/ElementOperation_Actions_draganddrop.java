package lessons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementOperation_Actions_draganddrop {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		Thread.sleep(2000);
		// 定位能拖拽的元素
		WebElement move_ele = driver.findElement(By.id("draggable"));
		// 定位拖拽目标位置元素
		WebElement target_ele = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(move_ele, target_ele).build().perform();
//		assert(driver.findElement(By.xpath("//*/div[@id='droppable']/p[text()='Dropped!']")).isDisplayed()==true);
		assert(driver.findElement(By.xpath("//*/div[@id='droppable']/p")).getText()).equals("Dropped!");
//		System.out.println(driver.findElement(By.xpath("//*/div[@id='droppable']/p")).getText());
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
