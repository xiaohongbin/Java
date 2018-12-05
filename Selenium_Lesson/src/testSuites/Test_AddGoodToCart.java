package testSuites;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pageObjects.GoodsDetailsPage;
import pageObjects.SearchResultListPage;
import pageObjects.AddGoodsResultPage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Test_AddGoodToCart  {
  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
  }


  @Test
  public void testAddToCart() throws InterruptedException{
	  SearchResultListPage srlp =PageFactory.initElements(Test_HomePage_Search.driver,SearchResultListPage.class);
	  srlp.clickItemImg();
	// 切换窗口到商品详情页
	  srlp.switchWindow();
	  GoodsDetailsPage gdp = PageFactory.initElements(Test_HomePage_Search.driver, GoodsDetailsPage.class);
	  gdp.addGoodToCart();
	  AddGoodsResultPage agr = PageFactory.initElements(Test_HomePage_Search.driver, AddGoodsResultPage.class);
	  //页面刷新需要重新获取元素
	  Test_HomePage_Search.driver.findElement(By.xpath("//*[@id='result']/div/div/div[1]/div[1]/h3"));
	  agr.getResultInfo();

	 
	  //判断添加是否成功
	  if(agr.getResultInfo().equals("商品已成功加入购物车！")) {
		  System.out.println("添加成功！！");
	  }
	  else {
		  
		  System.out.println(agr.getResultInfo()+"添加失败");
	  }
	  Test_HomePage_Search.driver.findElement(By.xpath("//*[@id='result']/div/div/div[2]/div[3]/a[1]"));
	  gdp.checkInfo();


    
  }

  @AfterClass
  public void teardown() {
//	  Test_HomePage_Search.driver.quit();
    
  }
}
