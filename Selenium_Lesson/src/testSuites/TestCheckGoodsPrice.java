package testSuites;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import framework.BrowserEngine;
import pageObjects.HomePage;
import pageObjects.SearchResultListPage;
import pageObjects.GoodsDetailsPage;

public class TestCheckGoodsPrice {
	WebDriver driver;
	
	@BeforeClass
	  public void setup() throws IOException{
		BrowserEngine browserEngine= new BrowserEngine();
		browserEngine.initConfigData();
		driver=browserEngine.getBrowser();
		
		  
	  }
  @Test
  public void checkprice() throws InterruptedException{
	  HomePage homepage=PageFactory.initElements(driver, HomePage.class);

	  homepage.searchWithKeyword("mate7");

	//进入搜索结果列表页,初始化页面元素
	  SearchResultListPage srlp=PageFactory.initElements(driver, SearchResultListPage.class);

	  Thread.sleep(1000);
	  String price1=srlp.getGoodsPriceOnListPage();// 获取列表页商品的价格
	  System.out.println("--------------"+price1);
	  srlp.clickItemImg();
	  srlp.switchWindow();
	  
	//进入商品详情页
			GoodsDetailsPage gdp = PageFactory.initElements(driver, GoodsDetailsPage.class);
			Thread.sleep(1000);
			String price2 = gdp.getPriceOnDetailsPage(); //获取商品详情页价格
			System.out.println("--------------"+price2);
			
			//判断 同一个商品在列表页和详情页价格是否显示一致
//			if(price1 == price2){//整数可以用==方式比较
				if(price2.equals(price1)){
				System.out.println("价格一致Pass");
			}else
				System.out.println("Failed");
				
			
			// 第二种断言
			Assert.assertEquals(price2, price1);
			gdp.addGoodToCart(); // 添加到购物车
	  
  }
  

  @AfterClass
  public void teardown() {
	  driver.quit();
  }

}
