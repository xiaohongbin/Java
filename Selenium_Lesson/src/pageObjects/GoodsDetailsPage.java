package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import framework.BasePage;


public class GoodsDetailsPage extends BasePage{
	/*
	 * 商品详情页，价格对比，下单入口等操作
	 */
	@FindBy(xpath="//*/span[@class='p-price']/span[2]")
	WebElement goods_price;
	//加入购物车
	@FindBy(id="InitCartUrl")
	WebElement addToCart_Btn;
	//成功加入购物车
//	@FindBy(className="ftx-02")
////	@FindBy(id="result")
//	WebElement addSucced;
	@FindBy(xpath="//*[@id='result']/div/div/div[2]/div[3]/a[1]")
	WebElement checkDetails;
	
	
	public GoodsDetailsPage(WebDriver driver) {
		super(driver);
//		System.out.println("goods----------------"+driver);
	}
	/*
	 * 获取商品详情页的价格
	 */
	public String getPriceOnDetailsPage() {
		return goods_price.getText();
	}
	/*
	 * 点击添加购物车
	 */
	public void addGoodToCart() {
		click(addToCart_Btn);
	}
	/*
	 * 获取添加结果提示信息
//	 */
//	public String getResultInfo() {
//		return addSucced.getText();
//	}
	/*
	 * 查看详情
	 */
	public void checkInfo() {
		click(checkDetails);
	}
  

}
