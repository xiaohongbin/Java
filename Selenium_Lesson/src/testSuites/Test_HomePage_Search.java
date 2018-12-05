package testSuites;
 
import java.io.IOException;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
import pageObjects.HomePage;
import pageObjects.functions.Login;
 
//public class Test_HomePage_Search extends Login{//实现方法二，继承Login父类的构造方法，调用initSetup()和loginValid()，直接初始化登录
public class Test_HomePage_Search {
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() throws IOException{
		
		//初始化一个Login类的实例
		Login login = new Login();
		login.initSetup();
		login.loginValid();
//		System.out.println("7777777777777"+driver);
		driver = login.driver;
//		System.out.println("888888888888888888"+driver);
		
	}
	
	
	@Test(description = "搜索商品")
	public void test_searchGoods() throws Exception{
//		System.out.println("%%%%%%%%%%%%%%"+driver);
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.searchWithKeyword("Java");
//		System.out.println("99999999999999");
		Thread.sleep(2000);		
	}
	@AfterClass
	public void teardown() throws InterruptedException{
		Thread.sleep(3000);
	}
	
 
}
