package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DeletePage extends TestBase{
	
	
	@FindBy(linkText="Cart")
	WebElement viewcart;
	
	@FindBy(xpath="//a[normalize-space()='Delete']")
	WebElement deleteitem;

	@FindBy(id="logout2")
	WebElement logout;
	
	public DeletePage() 
	{
		PageFactory.initElements(driver, this);
	}
		
	public void view()
	{
		viewcart.click();
	}
		
	public void delete()
	{
		deleteitem.click();
	}
	
	public void logout()
	{
		logout.click();
	}
	}
