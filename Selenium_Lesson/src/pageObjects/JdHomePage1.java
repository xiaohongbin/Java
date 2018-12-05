package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class JdHomePage1 {
	WebDriver driver;

	// 元素定位
	//登录链接
	By login_link=By.id("ttbar-login");
	//账户登录
	By login_withAccount=By.xpath("//*/div[@class='login-form']/div[3]/a");
	//div[3]索引是从1开始，不是0开始
//	By login_withAccount=By.xpath("//*[@id='content']/div[2]/div[1]/div/div[3]/a");
	//输入用户名框
	By inputbox_username=By.id("loginname");
	//输入密码
	By inputbox_password=By.id("nloginpwd");
	//登录按钮
	By login_submitbtn=By.id("loginsubmit");
	
	// 业务逻辑和操作方法
	// 构造方法，只是为了初始化？是否有其他方法
	public JdHomePage1(WebDriver driver) {
		this.driver =driver;
	}

    //点击登录链接
	public void clickLoginLink() throws Exception{
		driver.findElement(login_link).click();
		Thread.sleep(3);
		// 点击账户登录
		driver.findElement(login_withAccount).click();
	}
	// 登录步骤拆分-输入用户名
	public void inputUsername(String username) {
		driver.findElement(inputbox_username).sendKeys(username);
	}
	// 登录步骤拆分-输入密码
	public void inputPassword(String password) {
		driver.findElement(inputbox_password).sendKeys(password);
	}
	// 点击登录按钮
	public void clickLoginbtn() {
		driver.findElement(login_submitbtn).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}
	//重构一个登录方法
	public void login(String name,String pass) {
		driver.findElement(login_link).click();
		driver.findElement(login_withAccount).click();
		driver.findElement(inputbox_username).sendKeys(name);
		driver.findElement(inputbox_password).sendKeys(pass);
		driver.findElement(login_submitbtn).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}
	

}
