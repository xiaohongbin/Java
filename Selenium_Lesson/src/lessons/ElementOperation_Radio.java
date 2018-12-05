package lessons;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class ElementOperation_Radio {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    
	    driver.get("http://news.baidu.com");
	    Thread.sleep(2000);
	    
	    ArrayList<WebElement> search_type = (ArrayList<WebElement>)driver.findElements(By.xpath("//*/p[@class='search-radios']/input"));
	    for(WebElement ele:search_type) {
	    	ele.click();
	    	Thread.sleep(2000);
	    }
	    driver.quit();
	

	}

}
