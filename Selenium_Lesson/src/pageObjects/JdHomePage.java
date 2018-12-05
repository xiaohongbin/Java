package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JdHomePage {
	// 元素定位
	//登录链接
	@FindBy(id="ttbar-login")
	WebElement login_link;
	//账户登录
	@FindBy(xpath="//*[@id='content']/div[2]/div[1]/div/div[3]/a")
	WebElement login_withaccount;
	//输入用户名框
	@FindBy(id="loginname")
	WebElement inputbox_username;
	//输入密码
	@FindBy(id="nloginpwd")
	WebElement inputbox_password;
	
	// 业务逻辑和操作方法
	//登录方法
	public void login(String username,String password) {
		login_link.click();
		login_withaccount.click();
		inputbox_username.sendKeys(username);
		inputbox_password.sendKeys(password);
	}

}
