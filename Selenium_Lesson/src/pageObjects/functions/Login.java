package pageObjects.functions;
 
import java.io.IOException;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
 
import framework.BrowserEngine;
import pageObjects.HomePage;
import pageObjects.LoginPage;
 
public class Login {
	
	public WebDriver driver;
//	
//	public Login() {
//		try {
//			initSetup();
//			System.out.println("1111111111111111"+driver);
//			loginValid();
//			System.out.println("222222222222222222222"+driver);
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	
	//第一步，获取浏览器类型，打开浏览器。打开测试网站
	public  void initSetup() throws IOException{
//		System.out.println("33333333333333333"+driver);
		BrowserEngine browser = new BrowserEngine();
		browser.initConfigData();
		driver = browser.getBrowser();
//		System.out.println("!!!!!!!!!!!!!!!!"+driver);
	}
	
	// 用page factory类来加载初始化主页元素，点击登录这个链接
	public void loginValid() throws IOException{
		
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		//点击主页上的登录链接
		homepage.clickLoginLink();
		//跳转到登录页面，初始化登录界面的元素
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
//		System.out.println("*******************"+loginpage);
		//测试一个有效的用户名登录
		loginpage.login("大葱鸭II", "hong125101");
//		System.out.println("6666666666666666"+driver);
//		System.out.println("5555555555555"+loginpage);
//		return driver;
		
	}
	
}
