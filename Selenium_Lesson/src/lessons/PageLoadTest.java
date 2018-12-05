package lessons;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;



public class PageLoadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 // 注意targetPosition是一个点对象，把一个点作为参数传入，不能直接写（300， 600）
		Point targetPosition = new Point(300,600);
		driver.manage().window().setPosition(targetPosition);
//		System.out.println(driver.manage().window().setPosition(targetPosition));
		System.out.println("窗口位置："+driver.manage().window().getPosition());
		
		// 注意targetSize是一个对象传入，也不可以直接写成 1024*768
		System.out.println("窗口大小："+driver.manage().window().getSize());
		Dimension targetSize = new Dimension(1024,768);
		driver.manage().window().setSize(targetSize);
		System.out.println("窗口大小："+ driver.manage().window().getSize());
		
		driver.get("https://www.baidu.com");
		driver.manage().window().fullscreen();
//		driver.findElement(By.tagName("body")).sendKeys(Keys.F11);
//		driver.quit();
		
		
	}

}
