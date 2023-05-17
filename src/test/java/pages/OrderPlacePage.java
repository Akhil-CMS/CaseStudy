package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;


public class OrderPlacePage extends TestBase {
	
	
	@FindBy(linkText="Cart")
	WebElement viewcart;
		
	@FindBy(xpath="//button[contains(text(),'Place Order')]")
	WebElement placeOdrBtn;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement Ordname;
	
	@FindBy(xpath="//input[@id='country']")
	WebElement Ordcountry;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement Ordcity;
	
	
	@FindBy(xpath="//input[@id='card']")
	WebElement Cardno;
	
	
	@FindBy(xpath="//input[@id='month']")
	WebElement ExpMonth;
	
	
	@FindBy(xpath="//input[@id='year']")
	WebElement ExpYear;
	
	@FindBy(xpath="//button[contains(text(),'Purchase')]")
	WebElement placeOrderbtn;
	
	@FindBy(xpath="//h2[contains(text(),'Thank you for your purchase!')]")
	WebElement thankuBtn;

	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement okclick;

	@FindBy(id="logout2")
	WebElement logout;
	
	
	public OrderPlacePage() {
		PageFactory.initElements(driver, this);
		
		}
	
	
	public void view()
	{
		viewcart.click();
	}
	
	
	public void clickPlaceOrder() {
		placeOdrBtn.click();
	}
	
	
	public void formFields(String name, String cou, String cit,String crd, String mnt, String yr) throws InterruptedException {
		Ordname.sendKeys(name);
		Ordcountry.sendKeys(cou);
		Ordcity.sendKeys(cit);
		Cardno.sendKeys(crd);
		ExpMonth.sendKeys(mnt);
		ExpYear.sendKeys(yr);
		placeOrderbtn.click();
		
		
	}
	
	public void thankuAlertMsg()
	{
	String act = thankuBtn.getText();
	System.out.println("Message: "+ act);
	}
	
	public void OkThankuClick()
	{
		okclick.click();
	}

	public void logout()
	{
		logout.click();
	}
	


	
}
