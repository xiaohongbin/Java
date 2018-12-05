package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import framework.BasePage;

public class HomePage extends BasePage{
	/*
	 * 京东商城的首页，主要提供一些其他子模块或者页面的入口，一般点击一个元素，进入下一页面
	 */
	
	// 元素定位
	//搜索输入框
	@FindBy (id="key")
	WebElement search_inputbox;
	//搜索提交按钮
	@FindBy(xpath="//*[@id='search']/div/div[2]/button")
	WebElement search_submitbutton;
	// 登录链接
	@FindBy(id="ttbar-login")
	WebElement login_link;
	
	//HomePage子类的构造方法，
	public HomePage(WebDriver driver) {
		super(driver);//调用父类BasePage的构造函数,BasePage(),调用同一个driver对象
//		System.out.println("homepage----------------"+driver);
	}
	/*
	 * 搜索框输入关键字，点击搜索
	 */
	public  SearchResultListPage searchWithKeyword(String keyword){
//	public  void searchWithKeyword(String keyword){
		type(search_inputbox,keyword);
		click(search_submitbutton);
		System.out.println("----------------"+new SearchResultListPage(driver));
//		System.out.println(driver);
//		System.out.println(driver.getWindowHandle());
		return new SearchResultListPage(driver);
	}
	/*
	 * 点击登录链接
	 */
	public LoginPage clickLoginLink() {
		click(login_link);
		return new LoginPage(driver);
		
	}


}
