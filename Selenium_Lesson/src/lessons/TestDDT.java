package lessons;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestDDT {
  @Test(dataProvider = "testdata")
  public void TestLogin(String username, String password) throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.baidu.com");
	// click login link
	  driver.findElement(By.xpath(".//*[@id='u1']/a[7]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//*[@id='TANGRAM__PSP_10__footerULoginBtn']")).click();
	  
	  driver.findElement(By.id("TANGRAM__PSP_10__userName")).clear();
	  driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys(username);
	  driver.findElement(By.id("TANGRAM__PSP_10__password")).clear();
	  driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys(password);
	  
	  
	  
  }

  @DataProvider(name="testdata")
  public Object[][] TestDataFeed() {
	//创建一个二维数组
	  Object[][] baidudata= new Object[2][2];
	// 设置数组的元素值，这里是设置第一个用户名
	  baidudata[0][0] = "selenium1@baidu.com";
	// 设置第一个用户密码
	  baidudata[0][1] ="password1";
//	  设置第二个用户名
	  baidudata[1][0]="selenium2@baidu.com";
	// 设置第二个用户密码
	  baidudata[1][1]="password2";
	// 返回数据传给脚本
	  return baidudata;
	  
	  
			  
//	  
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
  }
}
