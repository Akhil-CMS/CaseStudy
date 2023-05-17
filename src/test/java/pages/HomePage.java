package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[@id='login2']")
	WebElement login;

	@FindBy(id="loginusername")
	WebElement lgnname;
	@FindBy(id="loginpassword")
	WebElement lgnpwd;

	@FindBy(xpath="//*[@id=\"logInModal\"]/div[1]/div[1]/div[3]/button[2]")
	WebElement lgin;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;

	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[1]/div[1]/div[1]/h4[1]")
	WebElement samsungmob;

	@FindBy(xpath="//a[@class='btn btn-success btn-lg']")
	WebElement additem;
	
	@FindBy(xpath="(//a[@class='nav-link'])[1]")
	WebElement HomeBtn;
	
	@FindBy(xpath="//a[normalize-space()='Nexus 6']")
	WebElement nexus6;
		
	@FindBy(linkText="Cart")
	WebElement viewcart;

	@FindBy(id="logout2")
	WebElement logout;

  public HomePage()
{
	  PageFactory.initElements(driver,this);
	  }
  
  public void login()
{
	  login.click();
}
  public void usrnme(String usrnme)
{
	  lgnname.sendKeys(usrnme);
 }
	
  public void password(String paswd)
{
	  lgnpwd.sendKeys(paswd);
}

  public void submit()
{
	  lgin.click();
}
	public void samsung()																				
{
	js.executeScript("window.scrollBy(10, 500)","");
	samsungmob.click();
 }
	
public void additem1()
{
	additem.click();
		}
	public void cart1() throws InterruptedException
	{
	Alert simple = driver.switchTo().alert();
	simple.accept();
	}
	
	public void Home()
	{
		HomeBtn.click();
			}
	
	public void nexusmob()																				
	{
		js.executeScript("window.scrollBy(10, 500)","");
		nexus6.click();
	 }
	public void additem2()
	{
		additem.click();
			}
		public void cart2() throws InterruptedException
		{
		Alert simple = driver.switchTo().alert();
		simple.accept();
		}
	
	public void view()
{
		viewcart.click();
		}
	public void logout()
{
		logout.click();
		}
}
