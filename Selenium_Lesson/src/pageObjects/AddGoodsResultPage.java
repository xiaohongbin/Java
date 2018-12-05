package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.BasePage;

public class AddGoodsResultPage extends BasePage{
	/*
	 * 加入购物车结果页，成功加入提示等
	 */
	//成功加入购物车
	@FindBy(className="ftx-02")
	WebElement SucceedInfo;
	
	public AddGoodsResultPage(WebDriver driver) {
		super(driver);
	}
	/*
	 * 获取添加结果信息
	 */
	public String getResultInfo() {
		return SucceedInfo.getText();
	}
	

}
