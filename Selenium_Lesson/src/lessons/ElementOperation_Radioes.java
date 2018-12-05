package lessons;

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class ElementOperation_Radioes {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.wjx.cn/m/2792226.aspx/");
		Thread.sleep(2000);
	    //ArrayList 和 List 区别	
//		ArrayList<WebElement> answer_options = (ArrayList<WebElement>) driver.findElements(By.xpath("//*/div[@id='divQuestion']/fieldset/div/div/div/span/input/../a"));
//		List<WebElement> answer_options =  driver.findElements(By.xpath("//*/div[@id='divQuestion']/fieldset/div/div/div/span/input/../a"));
		List<WebElement> answer_options = driver.findElements(By.xpath("//*/div[@id='divQuestion']/fieldset/div/div/div/span/a"));
		for(WebElement ele:answer_options) {
			ele.click();
			Thread.sleep(1000);
		}

	}

}
