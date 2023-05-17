package testScripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.DeletePage;
import pages.HomePage;
import pages.OrderPlacePage;

public class PlaceOrder extends TestBase {
 

HomePage homePage;
DeletePage deleteCart;
OrderPlacePage orderplacePage;

  @BeforeTest
  public void setup() {
	  initialize();
  }	
  @Test(priority=1)
public void addCartItem() throws InterruptedException
  {
  homePage = new HomePage();
  homePage.login();
  Thread.sleep(1000);
  homePage.usrnme("akhilb");
  homePage.password("Password@1");
  homePage.submit();
  
  Thread.sleep(1000);
  homePage.samsung();
  homePage.additem1();
  Thread.sleep(2000);
  homePage.cart1();
  Thread.sleep(1000);
  
  homePage.Home();
  Thread.sleep(1000);
  
  homePage.nexusmob();
  homePage.additem2();
  Thread.sleep(1000);
  homePage.cart2();
    
  homePage.view();
  Thread.sleep(2000);
  homePage.logout();
  } 
  
  @Test(priority=2)
  public void deleteCartItem() throws InterruptedException
  {
  homePage.login();
  Thread.sleep(1000);
  homePage.usrnme("akhilb");
  homePage.password("Password@1");
  homePage.submit();
  
  deleteCart = new DeletePage();
  Thread.sleep(1000);
  deleteCart.view();
  Thread.sleep(2000);
  deleteCart.delete();
  Thread.sleep(2000);
  deleteCart.logout();
  }
  
  @Test(priority=3)
  public void placeCartItem() throws InterruptedException
  {
  homePage.login();
  Thread.sleep(1000);
  homePage.usrnme("akhilb");
  homePage.password("Password@1");
  homePage.submit();
  
  orderplacePage = new OrderPlacePage();
  
  Thread.sleep(2000);
  orderplacePage.view();
  
  Thread.sleep(2000);
  orderplacePage.clickPlaceOrder();
  orderplacePage.formFields("Akhil", "India", "Bangalore", "3465604900065609", "10", "2026");
  
  Thread.sleep(2000);
  orderplacePage.thankuAlertMsg();
  
  Thread.sleep(2000);
  orderplacePage.OkThankuClick();
  
  Thread.sleep(2000);
  orderplacePage.logout();
    } 
  
  @AfterTest
  public void tearDown() {
	  closeBrowser();
  }
  }
